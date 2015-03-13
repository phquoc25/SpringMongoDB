package com.qph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qph.dto.PersonDto;
import com.qph.services.IService;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private IService<PersonDto> personService;
	
	@RequestMapping(value="/{idNumber}")
	@ResponseBody
	public PersonDto getPerson(@PathVariable String idNumber){
		return personService.get(idNumber);
	}
}
