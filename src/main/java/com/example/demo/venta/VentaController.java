package com.example.demo.venta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta")
public class VentaController {
	
	@Autowired
	VentaRepository ventaRepository;
	
	@Autowired
	VentaService ventaService;
	
	@GetMapping("/todos")
	public List<Venta> todos() {
		return ventaRepository.findAll();	
	}
	
	@GetMapping("/allsales")
	public List<Venta> buscarVentaPorMesAndYear(@RequestParam Integer mes, @RequestParam Integer year) {
		return ventaService.buscarVentaPorMesAndYear(mes,year);
	}
	
	@GetMapping("/total")
	public double dameElTotal(Integer mes, Integer year) {
		return ventaService.dameElTotal(mes,year);
	}
	
	@GetMapping("/ultimaventa")
	public Venta buscarVentaUltima() {
		return ventaService.buscarVentaUltima();
	}
	
	@GetMapping("/primeraventa")
	public Venta buscarVentaPrimera() {
		return ventaService.buscarVentaPrimera();
	}
	
	@PostMapping("/insert")
	public Venta insert(@RequestBody Venta venta) {
		return ventaService.insert(venta);
	}
	
	@PutMapping("/actualizar")
	public Venta actualizar(@RequestBody Venta venta) {
		return ventaService.actualizar(venta);
	}
	
	@DeleteMapping("/borrar/{id}")
	public void borrar(@PathVariable("id") Long id) {
		ventaService.borrar(id);
	}

}
