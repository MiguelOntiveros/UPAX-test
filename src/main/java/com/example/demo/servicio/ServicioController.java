package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicio")
public class ServicioController {
	
	@Autowired
	ServicioRepository servicioRepository;
	
	@Autowired
	ServicioService servicioService;
	
	@GetMapping("/todos")
	public List<Servicio> todos() {
		return servicioRepository.findAll();
	}
	
	@PostMapping("/insert")
	public Servicio insert(@RequestBody Servicio producto) {
		return servicioService.insert(producto);
	}
	
	@PutMapping("/actualizar")
	public Servicio actualizar(@RequestBody Servicio producto) {
		return servicioService.actualizar(producto);
	}
	
	@DeleteMapping("/borrar/{id}")
	public void borrar(@PathVariable("id") Long id) {
		servicioService.borrar(id);
	}
}
