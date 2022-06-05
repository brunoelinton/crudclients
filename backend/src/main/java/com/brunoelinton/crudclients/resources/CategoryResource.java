package com.brunoelinton.crudclients.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brunoelinton.crudclients.entities.Client;

@Controller
@RequestMapping(value = "/clients")
public class CategoryResource {

	@GetMapping
	@Transactional()
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Bruno Guimarães", "12345678901", 20000.00, Instant.now(), 5));
		list.add(new Client(2L, "Bob Brown", "34567890123", 10000.00, Instant.now(), 2));
		list.add(new Client(3L, "Maria Garden", "78901234567", 8000.00, Instant.now(), 1));
		list.add(new Client(4L, "Alex Juice", "90123456789", 15000.00, Instant.now(), 3));
		return ResponseEntity.ok().body(list);
	}
}
