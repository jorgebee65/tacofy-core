package com.tacofy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tacofy.po.Taqueria;
import com.tacofy.service.TaqueriaService;

@Controller
@RequestMapping("tacofy")
public class TaqueriaController {

	@Autowired
	private TaqueriaService taqueriaService;
	
	@GetMapping("taquerias")
	public ResponseEntity<List<Taqueria>> getTaquerias() {
		List<Taqueria> list = taqueriaService.getTaquerias();
		return new ResponseEntity<List<Taqueria>>(list, HttpStatus.OK);
	}
}
