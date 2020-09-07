package com.example.demo.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/todos")
	public List<Cliente> todos() {
		return clienteRepository.findAll();
	}
	
	@PostMapping("/insert")
	public Cliente insert(@RequestBody Cliente cliente) {
		return clienteService.insert(cliente);
	}
	
	@PutMapping("/actualizar")
	public Cliente actualizar(@RequestBody Cliente cliente) {
		return clienteService.actualizar(cliente);
	}
	
	
	@DeleteMapping("/borrar/{id}")
	public void borrar(@PathVariable("id") Long id) {
		  clienteService.borrar(id);
		//clienteService.borrarClientePorNombre(id);
	}

}
