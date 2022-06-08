package com.brunoelinton.crudclients.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brunoelinton.crudclients.dto.ClientDTO;
import com.brunoelinton.crudclients.services.ClientService;

@Controller
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll() {
		List<ClientDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
