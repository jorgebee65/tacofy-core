package com.tacofy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.tacofy.bo.TaqueriaBO;
import com.tacofy.service.TaqueriaService;

@Controller
@RequestMapping("/tacofy")
public class TaqueriaController {

	@Autowired
	private TaqueriaService taqueriaService;

	@RequestMapping(value = "/taquerias", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
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
	
	@RequestMapping(value = "/taquerias/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TaqueriaBO> getTaqueria(@PathVariable("id") long id) {
		return new ResponseEntity<TaqueriaBO>(taqueriaService.find(id), HttpStatus.OK);
	}

}
