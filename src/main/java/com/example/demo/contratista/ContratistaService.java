package com.example.demo.contratista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cliente.Cliente;

@Service
public class ContratistaService {
	
	@Autowired
	ContratistaRepository contratistaRepository;
	
	public Contratista insert(Contratista contratista) {
		return contratistaRepository.save(contratista);
	}

}
