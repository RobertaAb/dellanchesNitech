package com.nitech.dellanches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nitech.dellanches.entity.ClientEntity;
import com.nitech.dellanches.service.ClientService;

@RequestMapping("/api/client")
@RestController
public class ClientController {
	@Autowired
	ClientService clientService;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody ClientEntity client) {
		return ResponseEntity.ok(clientService.save(client));
	}

	@GetMapping
	public ClientEntity find(@RequestParam Integer id) {
		return clientService.findById(id);
	}

}
