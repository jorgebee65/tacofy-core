package com.tacofy.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import com.tacofy.bo.TaqueriaBO;
import com.tacofy.exception.ServiceExceptionCO;
import com.tacofy.handler.error.ApiError;
import com.tacofy.service.TaqueriaService;

@Controller
@RequestMapping("/tacofy")
public class TaqueriaController {

	public static final String TAQUERIA_UPLOADED_FOLDER = "C:\\Tacofy\\images\\";

	@Autowired
	private TaqueriaService taqueriaService;

	@CrossOrigin(origins = "http://localhost:8081")
	@RequestMapping(value = "/taquerias", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<TaqueriaBO>> getTaquerias() {
		return new ResponseEntity<List<TaqueriaBO>>(taqueriaService.getTaquerias(), HttpStatus.OK);
	}

	@RequestMapping(value = "/taquerias", method = RequestMethod.POST)
	ResponseEntity<?> save(@RequestBody TaqueriaBO taqueria, UriComponentsBuilder ucBuilder) {
		TaqueriaBO res = taqueriaService.save(taqueria);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/tacofy/taquerias/{id}").buildAndExpand(res.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/taquerias/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TaqueriaBO> getTaqueria(@PathVariable("id") long id) throws ServiceExceptionCO {
		TaqueriaBO bo = taqueriaService.find(id);
		return new ResponseEntity<TaqueriaBO>(bo, HttpStatus.OK);
	}

	@RequestMapping(value = "/taquerias/image", method = RequestMethod.POST, headers = ("content-type=multipart/form-data"))
	public ResponseEntity<byte[]> uploadTaqueriaImage(@RequestParam("id_taqueria") long idTaqueria,
			@RequestParam("file") MultipartFile multipartFile, UriComponentsBuilder componentBuilder)
			throws ServiceExceptionCO, IOException {
		TaqueriaBO bo = null;
		bo = taqueriaService.find(idTaqueria);
		if ( bo.getImagen() != null) {
			String filename = bo.getImagen();
			Path path = Paths.get(filename);
			File file = path.toFile();
			if (file.exists()) {
				file.delete();
			}
		}
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss.");
		String dateName = sdf.format(date);
		String fileName = String
				.valueOf(bo.getId() + "-picture-" + dateName + multipartFile.getContentType().split("/")[1]);
		bo.setImagen(TAQUERIA_UPLOADED_FOLDER + fileName);
		byte[] bytes = multipartFile.getBytes();
		Path path2 = Paths.get(TAQUERIA_UPLOADED_FOLDER + fileName);
		Files.write(path2, bytes);
		taqueriaService.update(bo);
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(bytes);
	}
	
	@RequestMapping(value = "/taquerias/{id}/image", method = RequestMethod.GET)
	public ResponseEntity<byte[]> getTaqueriaImage(@PathVariable("id") long id) throws ServiceExceptionCO, IOException{
		TaqueriaBO bo = null;
		bo = taqueriaService.find(id);
		if(bo==null) {
			throw new ServiceExceptionCO("No se encuentra taqueria con ID: "+id, TaqueriaController.class );
		}
		if(bo.getImagen()==null || "".equals(bo.getImagen())){
			throw new ServiceExceptionCO("La taqueria no tiene imágenes que mostrar", TaqueriaController.class );
		}
		Path path = Paths.get(bo.getImagen());
		File file = path.toFile();
		if (!file.exists()) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		byte[] image = Files.readAllBytes(path);
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
	}

}
