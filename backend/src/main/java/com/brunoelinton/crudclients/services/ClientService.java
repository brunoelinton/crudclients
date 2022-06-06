package com.brunoelinton.crudclients.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunoelinton.crudclients.ClientRepository;
import com.brunoelinton.crudclients.entities.Client;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll() {
		return repository.findAll();
	}
}
