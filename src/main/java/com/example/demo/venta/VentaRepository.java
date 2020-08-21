package com.example.demo.venta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VentaRepository extends JpaRepository<Venta, Long>{
	
	@Query( value = "Delete FROM venta c WHERE c.nombre = ?1", 
			  nativeQuery = true)
			void buscarVentaPorNombre(String nombre);
	
	@Query( value = "Select * FROM venta order by fechacompra DESC limit 1", 
			  nativeQuery = true)
			Venta buscarVentaUltimaString();
	
	@Query( value = "Select * FROM venta order by fechacompra ASC limit 1", 
			  nativeQuery = true)
			Venta buscarVentaPrimerString();

}
