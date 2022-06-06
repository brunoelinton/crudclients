package com.brunoelinton.crudclients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunoelinton.crudclients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
