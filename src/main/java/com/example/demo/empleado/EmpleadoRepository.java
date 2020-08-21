package com.example.demo.empleado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
	
	@Query( value = "Delete FROM empleado c WHERE c.nombre = ?1", 
			  nativeQuery = true)
			void buscarEmpleadoPorNombre(String nombre);

}
