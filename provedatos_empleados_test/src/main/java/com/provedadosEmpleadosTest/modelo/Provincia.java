package com.provedadosEmpleadosTest.modelo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="provincia")
public class Provincia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_provincia")
	private Long idProvincia;
	
	@Column(name="nombre_provincia")
	private String nombreProvincia;
	
	@Column(name="capital_provincia")
	private String capitalProvincia;
	
	@Column(name="descripcion_provincia")
	private String descripcionProvincia;
	
	@Column(name="poblacion_provincia")
	private Integer poblacionProvincia;
	
	@Column(name="superficie_provincia")
	private Long superficieProvincia;
	
	@Column(name="latitud_provincia")
	private String latitudProvincia;
	
	@Column(name="longitud_provincia")
	private String longitudProvincia;
	
	@Column(name="id_region")
	private Integer idRegion;

	@OneToMany(mappedBy = "provincia", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Empleado> empleados;

	public Provincia() {
		super();
	}

	public Provincia(Long idProvincia, String nombreProvincia, String capitalProvincia, String descripcionProvincia,
			Integer poblacionProvincia, Long superficieProvincia, String latitudProvincia, String longitudProvincia,
			Integer idRegion, List<Empleado> empleados) {
		super();
		this.idProvincia = idProvincia;
		this.nombreProvincia = nombreProvincia;
		this.capitalProvincia = capitalProvincia;
		this.descripcionProvincia = descripcionProvincia;
		this.poblacionProvincia = poblacionProvincia;
		this.superficieProvincia = superficieProvincia;
		this.latitudProvincia = latitudProvincia;
		this.longitudProvincia = longitudProvincia;
		this.idRegion = idRegion;
		this.empleados = empleados;
	}

	public Long getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public String getCapitalProvincia() {
		return capitalProvincia;
	}

	public void setCapitalProvincia(String capitalProvincia) {
		this.capitalProvincia = capitalProvincia;
	}

	public String getDescripcionProvincia() {
		return descripcionProvincia;
	}

	public void setDescripcionProvincia(String descripcionProvincia) {
		this.descripcionProvincia = descripcionProvincia;
	}

	public Integer getPoblacionProvincia() {
		return poblacionProvincia;
	}

	public void setPoblacionProvincia(Integer poblacionProvincia) {
		this.poblacionProvincia = poblacionProvincia;
	}

	public Long getSuperficieProvincia() {
		return superficieProvincia;
	}

	public void setSuperficieProvincia(Long superficieProvincia) {
		this.superficieProvincia = superficieProvincia;
	}

	public String getLatitudProvincia() {
		return latitudProvincia;
	}

	public void setLatitudProvincia(String latitudProvincia) {
		this.latitudProvincia = latitudProvincia;
	}

	public String getLongitudProvincia() {
		return longitudProvincia;
	}

	public void setLongitudProvincia(String longitudProvincia) {
		this.longitudProvincia = longitudProvincia;
	}

	public Integer getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
}
