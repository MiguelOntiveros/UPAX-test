package com.example.demo.cliente;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellidopaterno;
	private String apellidomaterno;
	private Integer edad; 
	private String sexo;
	private String direccion;
	private Long celular;
	private String estadocivil;
	private Date fechanacimiento;
	private String email;
	private Date primeracompra;
	private Date ultimacompra;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidopaterno;
	}

	public void setApellidoPaterno(String apellidopaterno) {
		this.apellidopaterno = apellidopaterno;
	}

	public String getApellidoMaterno() {
		return apellidomaterno;
	}

	public void setApellidoMaterno(String apellidomaterno) {
		this.apellidomaterno = apellidomaterno;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadoCivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public Date getFechaNacimiento() {
		return fechanacimiento;
	}

	public void setFechaNacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getPrimeraCompra() {
		return primeracompra;
	}

	public void setPrimeraCompra(Date primeraCompra) {
		this.primeracompra = primeraCompra;
	}

	public Date getUltimaCompra() {
		return ultimacompra;
	}

	public void setUltimaCompra(Date ultimaCompra) {
		this.ultimacompra = ultimaCompra;
	}
	
}
