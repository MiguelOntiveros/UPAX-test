package com.example.demo.empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {
	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	public Empleado insert(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}
	
	public Empleado actualizar(Empleado empleado) {
		Empleado empleadoEncontrado = empleadoRepository.findById(empleado.getId()).get();
		
		empleadoEncontrado.setNombre(empleado.getNombre());
		empleadoEncontrado.setApellidoPaterno(empleado.getApellidoPaterno());
		empleadoEncontrado.setApellidoMaterno(empleado.getApellidoMaterno());
		empleadoEncontrado.setTipo(empleado.getTipo());
		empleadoEncontrado.setEdad(empleado.getEdad());
		empleadoEncontrado.setSexo(empleado.getSexo());
		empleadoEncontrado.setDireccion(empleado.getDireccion());
		empleadoEncontrado.setCelular(empleado.getCelular());
		empleadoEncontrado.setEstadoCivil(empleado.getEstadoCivil());
		empleadoEncontrado.setFechaNacimiento(empleado.getFechaNacimiento());
		
		return empleadoRepository.save(empleadoEncontrado);
	}
	
	public void borrar(Long id) {
		empleadoRepository.deleteById(id);
	}
	
	public void borrarEmpleadoPorNombre(Long id) {
		empleadoRepository.buscarEmpleadoPorNombre("Mike");
	}
}
