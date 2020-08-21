package com.example.demo.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	public Cliente insert(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente actualizar(Cliente cliente) {
		Cliente clienteEncontrado = clienteRepository.findById(cliente.getId()).get();
		
		clienteEncontrado.setNombre(cliente.getNombre());
		clienteEncontrado.setApellidoPaterno(cliente.getApellidoPaterno());
		clienteEncontrado.setApellidoMaterno(cliente.getApellidoMaterno());
		clienteEncontrado.setEdad(cliente.getEdad());
		clienteEncontrado.setSexo(cliente.getSexo());
		clienteEncontrado.setDireccion(cliente.getDireccion());
		clienteEncontrado.setCelular(cliente.getCelular());
		clienteEncontrado.setEstadoCivil(cliente.getEstadocivil());
		clienteEncontrado.setFechaNacimiento(cliente.getFechaNacimiento());
		clienteEncontrado.setEmail(cliente.getEmail());
		clienteEncontrado.setPrimeraCompra(cliente.getPrimeraCompra());
		clienteEncontrado.setUltimaCompra(cliente.getUltimaCompra());
		return clienteRepository.save(clienteEncontrado);
	}
	
	public void borrar(Long id) {
		clienteRepository.deleteById(id);
	}
	
	public void borrarClientePorNombre(Long id) {
		clienteRepository.buscarClientePorNombre("Isaias");
	}

}
