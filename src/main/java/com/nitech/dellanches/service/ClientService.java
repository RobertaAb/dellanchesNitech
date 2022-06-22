package com.nitech.dellanches.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitech.dellanches.entity.ClientEntity;
import com.nitech.dellanches.repository.ClientRepository;

@Service
public class ClientService {
	@Autowired
	ClientRepository clientRepository;
	
	public ClientEntity save(ClientEntity client) {
		return clientRepository.save(client);
	}

	public ClientEntity findById(Integer id) {
		return clientRepository.findClientEntityById(id);
	}
}
