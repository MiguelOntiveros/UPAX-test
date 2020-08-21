package com.example.demo.servicio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ServicioRepository extends JpaRepository<Servicio, Long>{
	
	@Query( value = "Delete FROM servicio c WHERE c.nombre = ?1", 
			  nativeQuery = true)
			void buscarServicioPorNombre(String nombre);

}
