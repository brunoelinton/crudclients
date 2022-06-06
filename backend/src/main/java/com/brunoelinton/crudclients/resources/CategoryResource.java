package com.brunoelinton.crudclients.resources;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brunoelinton.crudclients.entities.Client;
import com.brunoelinton.crudclients.services.ClientService;

@Controller
@RequestMapping(value = "/clients")
public class CategoryResource {
	
	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
