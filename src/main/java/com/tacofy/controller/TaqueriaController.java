package com.tacofy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tacofy.bo.TaqueriaBO;
import com.tacofy.service.TaqueriaService;

@Controller
@RequestMapping("/tacofy")
public class TaqueriaController {

	@Autowired
	private TaqueriaService taqueriaService;
	
	@RequestMapping(value="/taquerias",method= RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> getTaquerias() {
		List<TaqueriaBO> list = taqueriaService.getTaquerias();
		list.forEach(taq ->{
			System.out.println(taq.getNombre());

		});
		return new ResponseEntity<List<TaqueriaBO>>(list,HttpStatus.OK);
	}
}
