package com.example.demo.agenda;

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
@RequestMapping("/agenda")
public class AgendaController {
	
	@Autowired
	AgendaRepository agendaRepository;
	
	@Autowired
	AgendaService agendaService;
	
	@GetMapping("/todos")
	public List<Agenda> todos() {
		return agendaRepository.findAll();
	}
	
	@GetMapping("/primerdia")
	public Integer obtenerPrimerDiaDelMes(Integer year, Integer mes) {
		return agendaService.obtenerPrimerDiaDelMes(year, mes);
	}
	
	@GetMapping("/esbisiesto")
	public boolean esBisiesto(Integer year) {
		return agendaService.esBisiesto(year);
	}
	
	@GetMapping("/diasmes")
	public Integer obtenerDiasDelMes(Integer year, Integer mes) {
		return agendaService.obtenerDiasDelMes(year, mes);
	}
	
	@PostMapping("/insert")
	public Agenda insert(@RequestBody Agenda agenda) {
		return agendaService.insert(agenda);
	}
	
	@PutMapping("/actualizar")
	public Agenda actualizar(@RequestBody Agenda agenda) {
		return agendaService.actualizar(agenda);
	}
	
	@DeleteMapping("/borrar/{id}")
	public void borrar(@PathVariable("id") Long id) {
		agendaService.borrar(id);
	}


}
