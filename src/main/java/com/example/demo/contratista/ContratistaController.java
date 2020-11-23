package com.example.demo.contratista;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cliente.Cliente;

@RestController
@CrossOrigin()
@RequestMapping("/contratista")
public class ContratistaController {
	
	@Autowired
	ContratistaRepository contratistaRepository;
	
	@Autowired
	ContratistaService contratistaService;
	
	@GetMapping("/todos")
	public List<Contratista> todos() {
		return contratistaRepository.findAll();
	}
	
	@PostMapping("/insert")
	public Contratista insert(@RequestBody Contratista contratista) {
		return contratistaService.insert(contratista);
	}
	
}
