package com.tacofy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tacofy.bo.AmenidadBO;
import com.tacofy.service.AmenidadService;

@Controller
@RequestMapping("/tacofy")
public class AmenidadController {

	@Autowired
	private AmenidadService srvAmenidad;
	
	@RequestMapping(value="/amenidades",method= RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> getTaquerias() {
		List<AmenidadBO> list = srvAmenidad.getAmenidadesBO();
		return new ResponseEntity<List<AmenidadBO>>(list,HttpStatus.OK);
	}
}
