package com.example.demo.empleado;

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
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Autowired
	EmpleadoService empleadoService;
	
	@GetMapping("/todos")
	public List<Empleado> todos() {
		return empleadoRepository.findAll();
	}
	
	@PostMapping("/insert")
	public Empleado insert(@RequestBody Empleado empleado) {
		return empleadoService.insert(empleado);
	}
	
	@PutMapping("/actualizar")
	public Empleado actualizar(@RequestBody Empleado empleado) {
		return empleadoService.actualizar(empleado);
	}
	
	@DeleteMapping("/borrar/{id}")
	public void borrar(@PathVariable("id") Long id) {
		empleadoService.borrar(id);
	}
}
