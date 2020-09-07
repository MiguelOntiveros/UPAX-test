package com.example.demo.producto;

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
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	ProductoRepository productoRepository;
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/todos")
	public List<Producto> todos() {
		return productoRepository.findAll();
	}
	
	@GetMapping("/inventario")
	public double inventario() {
		return productoService.inventario();
	}
	
	@PostMapping("/insert")
	public Producto insert(@RequestBody Producto producto) {
		return productoService.insert(producto);
	}
	
	@PutMapping("/actualizar")
	public Producto actualizar(@RequestBody Producto producto) {
		return productoService.actualizar(producto);
	}
	
	@DeleteMapping("/borrar/{id}")
	public void borrar(@PathVariable("id") Long id) {
		productoService.borrar(id);
	}

}
