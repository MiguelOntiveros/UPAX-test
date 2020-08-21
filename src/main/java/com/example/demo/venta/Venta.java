package com.example.demo.venta;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "venta")
public class Venta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String articulo;
    private Long cantidad; 
    private double precio; 
    private String cliente;
    private String empleado;
	private LocalDate fechacompra;
    private double total; 
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	 public String getEmpleado() {
		return empleado;
	}
	 public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public LocalDate getFechaCompra() {
		return fechacompra;
	}
	public void setFechaCompra(LocalDate fechacompra) {
		this.fechacompra = fechacompra;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
