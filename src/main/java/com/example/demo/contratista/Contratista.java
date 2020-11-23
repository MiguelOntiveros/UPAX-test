package com.example.demo.contratista;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contratista")
public class Contratista {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long numero;
	private Long persona;
	private String nombregenero;
	private String nombre;
	private String rfc; 
	private String registro;
	private String padron;
	private String calle;
	private String numext;
	private String numint;
	private String edificio; 
	private String colonia;
	private Long pais; 
	private Long estado;
	private Long ciudad;
	private String codpos; 
	private String contacto; 
    private Long telefonos; 
	private Long giro;
	private String email;
	private String web;
	private Date creadofecha;
	private Date creadohora;
	private String inscripcion; 
	private String vigencia;
	private String suspendidofecha; 
	private Long suspendidomotivo;
	private String suspendidoobservaciones;
	private String curp;
	private Long generico;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Long getPersona() {
		return persona;
	}
	public void setPersona(Long persona) {
		this.persona = persona;
	}
	public String getNombregenero() {
		return nombregenero;
	}
	public void setNombregenero(String nombregenero) {
		this.nombregenero = nombregenero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getPadron() {
		return padron;
	}
	public void setPadron(String padron) {
		this.padron = padron;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumext() {
		return numext;
	}
	public void setNumext(String numext) {
		this.numext = numext;
	}
	public String getNumint() {
		return numint;
	}
	public void setNumint(String numint) {
		this.numint = numint;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public Long getPais() {
		return pais;
	}
	public void setPais(Long pais) {
		this.pais = pais;
	}
	public Long getEstado() {
		return estado;
	}
	public void setEstado(Long estado) {
		this.estado = estado;
	}
	public Long getCiudad() {
		return ciudad;
	}
	public void setCiudad(Long ciudad) {
		this.ciudad = ciudad;
	}
	public String getCodpos() {
		return codpos;
	}
	public void setCodpos(String codpos) {
		this.codpos = codpos;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public Long getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Long telefonos) {
		this.telefonos = telefonos;
	}
	public Long getGiro() {
		return giro;
	}
	public void setGiro(Long giro) {
		this.giro = giro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public Date getCreadofecha() {
		return creadofecha;
	}
	public void setCreadofecha(Date creadofecha) {
		this.creadofecha = creadofecha;
	}
	public Date getCreadohora() {
		return creadohora;
	}
	public void setCreadohora(Date creadohora) {
		this.creadohora = creadohora;
	}
	public String getInscripcion() {
		return inscripcion;
	}
	public void setInscripcion(String inscripcion) {
		this.inscripcion = inscripcion;
	}
	public String getVigencia() {
		return vigencia;
	}
	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}
	public String getSuspendidofecha() {
		return suspendidofecha;
	}
	public void setSuspendidofecha(String suspendidofecha) {
		this.suspendidofecha = suspendidofecha;
	}
	public Long getSuspendidomotivo() {
		return suspendidomotivo;
	}
	public void setSuspendidomotivo(Long suspendidomotivo) {
		this.suspendidomotivo = suspendidomotivo;
	}
	public String getSuspendidoobservaciones() {
		return suspendidoobservaciones;
	}
	public void setSuspendidoobservaciones(String suspendidoobservaciones) {
		this.suspendidoobservaciones = suspendidoobservaciones;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public Long getGenerico() {
		return generico;
	}
	public void setGenerico(Long generico) {
		this.generico = generico;
	}
	
}
