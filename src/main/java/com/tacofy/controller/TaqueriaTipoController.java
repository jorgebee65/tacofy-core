package com.tacofy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tacofy.bo.TaqueriaTipoBO;
import com.tacofy.service.TaqueriaTipoService;

@Controller
@RequestMapping("/tacofy")
public class TaqueriaTipoController {

	@Autowired
	private TaqueriaTipoService srvTaqTipo;
	
	@RequestMapping(value="/tipos",method= RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> getTaquerias() {
		List<TaqueriaTipoBO> list = srvTaqTipo.getTaqueriaTipos();
		return new ResponseEntity<List<TaqueriaTipoBO>>(list,HttpStatus.OK);
	}
}
