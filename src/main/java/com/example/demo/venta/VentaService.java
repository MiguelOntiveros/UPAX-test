package com.example.demo.venta;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VentaService {
	
	@Autowired
	VentaRepository ventaRepository;
	
	public Venta insert(Venta venta) {
		return ventaRepository.save(venta);
	}
	
	public Venta actualizar(Venta venta) {
		Venta ventaEncontrada = ventaRepository.findById(venta.getId()).get();
		
		ventaEncontrada.setArticulo(venta.getArticulo());
		ventaEncontrada.setCantidad(venta.getCantidad());
		ventaEncontrada.setPrecio(venta.getPrecio());
		ventaEncontrada.setCliente(venta.getCliente());
		ventaEncontrada.setFechaCompra(venta.getFechaCompra());
		ventaEncontrada.setTotal(venta.getTotal());
		
		return ventaRepository.save(ventaEncontrada);
	}
	
	public void borrar(Long id) {
		ventaRepository.deleteById(id);
	}
	
	public void borrarVentaPorNombre(Long id) {
		ventaRepository.buscarVentaPorNombre("corte");
	}
	
	public List<Venta> buscarVentaPorMesAndYear(Integer mes, Integer year) {
		List<Venta> nuevaLista = new ArrayList<>();
		List<Venta> todasLasVentas = ventaRepository.findAll();
		for (Venta separacion : todasLasVentas) {
			if (separacion.getFechaCompra() != null && separacion.getFechaCompra().getMonthValue() == mes && separacion.getFechaCompra().getYear() == year) {
				nuevaLista.add(separacion);
			}
		}
		return nuevaLista;
	}
	
	public double dameElTotal(Integer mes, Integer year) {
		double acumuladorVenta = 0;
		double resultado = 0;
		double sumaTotal;
		List<Venta> filtroDeVentas = buscarVentaPorMesAndYear(mes, year);
		for (Venta lista : filtroDeVentas) {
			sumaTotal = lista.getCantidad() * lista.getPrecio();
			acumuladorVenta+= sumaTotal;
			lista.setTotal(acumuladorVenta);
			resultado = acumuladorVenta;
		}
		return resultado;
	}
	
	public Venta buscarVentaUltima() {
		return ventaRepository.buscarVentaUltimaString();
	}
	
	public Venta buscarVentaPrimera() {
		return ventaRepository.buscarVentaPrimerString();
	}

}
