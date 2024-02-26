package org.cibertec.edu.pe.modelo;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Taller {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@Column(precision = 8, scale = 2) // 8 dígitos en total, 2 decimales
    private BigDecimal costo;    
    private int vacante;  
	private Date fechaInicio;
	private Date fechaFin;
	
	public Taller() {		
	}

	public Taller(int id, String nombre, BigDecimal costo, int vacante, Date fechaInicio, Date fechaFin) {		
		this.id = id;
		this.nombre = nombre;
		this.costo = costo;
		this.vacante = vacante;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public int getVacante() {
		return vacante;
	}

	public void setVacante(int vacante) {
		this.vacante = vacante;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
}
