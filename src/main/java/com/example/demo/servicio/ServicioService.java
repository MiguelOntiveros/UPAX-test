package com.example.demo.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioService {
	
	@Autowired
	ServicioRepository servicioRepository;
	
	public Servicio insert(Servicio servicio) {
		return servicioRepository.save(servicio);
	}
	
	public Servicio actualizar(Servicio servicio) {
		Servicio servicioEncontrado = servicioRepository.findById(servicio.getId()).get();
		
		servicioEncontrado.setNombre(servicio.getNombre());
		servicioEncontrado.setCantidad(servicio.getCantidad());
		servicioEncontrado.setPrecio(servicio.getPrecio());
		
		return servicioRepository.save(servicioEncontrado);
	}
	
	public void borrar(Long id) {
		servicioRepository.deleteById(id);
	}
	
	public void borrarServicioPorNombre(Long id) {
		servicioRepository.buscarServicioPorNombre("corte");
	}
}
