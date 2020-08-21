package com.example.demo.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;
	
	public Producto insert(Producto producto) {
		return productoRepository.save(producto);
	}
	
	public Producto actualizar(Producto producto) {
		Producto productoEncontrado = productoRepository.findById(producto.getId()).get();
		
		productoEncontrado.setNombre(producto.getNombre());
		productoEncontrado.setCantidad(producto.getCantidad());
		productoEncontrado.setPrecio(producto.getPrecio());
		
		return productoRepository.save(productoEncontrado);
	}
	
	public void borrar(Long id) {
		productoRepository.deleteById(id);
	}
	
	public double inventario() {
		double acumuladorProducto = 0;
		double resultado = 0;
		double sumaTotal;
		List<Producto> entradas = productoRepository.findAll();
		for(Producto inventario : entradas) {
			sumaTotal = inventario.getCantidad();
			acumuladorProducto+= sumaTotal;
			resultado = acumuladorProducto;
		}
		return resultado;
	}
	
	public void borrarProductoPorNombre(Long id) {
		productoRepository.buscarProductoPorNombre("shampoo");
	}

}
