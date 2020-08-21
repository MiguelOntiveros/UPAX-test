package com.example.demo.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Transactional
	@Modifying
	@Query( value = "Delete FROM cliente c WHERE c.nombre = ?1", 
			  nativeQuery = true)
			int buscarClientePorNombre(String nombre);
}
