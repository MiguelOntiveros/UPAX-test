package com.example.demo.producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

	@Query( value = "Delete FROM producto c WHERE c.nombre = ?1", 
			  nativeQuery = true)
			void buscarProductoPorNombre(String nombre);
}
