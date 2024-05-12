package com.provedadosEmpleadosTest.modelo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private Long idEmpleado;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="ruc_cedula")
	private String rucCedula;
	
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="division")
	private String division;
	
	@Column(name="departamento")
	private String departamento;
	
	@Column(name="seccion")
	private String seccion;
	
	@Column(name="cargo")
	private String cargo;
	
	@Column(name="fecha_ingreso")
	private Date fechaIngreso;
	
	@Column(name="status")
	private String status;
	
	@Column(name="discapacidad")
	private Boolean discapacidad;
	
	@Column(name="email")
	private String email;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="estado_civil")
	private String estadoCivil;
	
	@Column(name="tipo_sangre")
	private String tipoSangre;
	
	@Column(name="observaciones")
	private String observaciones;
	
	@Column(name="observaciones_laborales")
	private String observacionesLaborales;
	
	@Column(name="jornada_parcial")
	private Boolean jornadaParcial;
	
	@Column(name="sueldo")
	private double sueldo;
	
	@Lob
	@Column(name="fotografia")
	private byte[] fotografia;
	
	@JoinColumn(name = "id_provincia", referencedColumnName = "id_provincia")
    @ManyToOne
    private Provincia provincia;
	
	@JoinColumn(name = "id_provincia_laboral", referencedColumnName = "id_provincia")
    @ManyToOne
    private Provincia provinciaLaboral;

	public Empleado() {
		super();
	}

	public Empleado(Long idEmpleado, String nombres, String apellidos, String rucCedula, Date fechaNacimiento,
			String codigo, String direccion, String telefono, String division, String departamento, String seccion,
			String cargo, Date fechaIngreso, String status, Boolean discapacidad, String email, String categoria, String estadoCivil, String tipoSangre, String observaciones, String observacionesLaborales,
			Boolean jornadaParcial, double sueldo, byte[] fotografia, Provincia provincia, Provincia provinciaLaboral) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rucCedula = rucCedula;
		this.fechaNacimiento = fechaNacimiento;
		this.codigo = codigo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.division = division;
		this.departamento = departamento;
		this.seccion = seccion;
		this.cargo = cargo;
		this.fechaIngreso = fechaIngreso;
		this.status = status;
		this.discapacidad = discapacidad;
		this.email = email;
		this.categoria = categoria;
		this.estadoCivil = estadoCivil;
		this.tipoSangre = tipoSangre;
		this.observaciones = observaciones;
		this.observacionesLaborales = observacionesLaborales;
		this.jornadaParcial = jornadaParcial;
		this.sueldo = sueldo;
		this.fotografia = fotografia;
		this.provincia = provincia;
		this.provinciaLaboral = provinciaLaboral;
	}

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRucCedula() {
		return rucCedula;
	}

	public void setRucCedula(String rucCedula) {
		this.rucCedula = rucCedula;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getDiscapacidad() {
		return discapacidad;
	}

	public void setDiscapacidad(Boolean discapacidad) {
		this.discapacidad = discapacidad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getObservacionesLaborales() {
		return observacionesLaborales;
	}

	public void setObservacionesLaborales(String observacionesLaborales) {
		this.observacionesLaborales = observacionesLaborales;
	}

	public Boolean getJornadaParcial() {
		return jornadaParcial;
	}

	public void setJornadaParcial(Boolean jornadaParcial) {
		this.jornadaParcial = jornadaParcial;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	public Provincia getProvinciaLaboral() {
		return provinciaLaboral;
	}

	public void setProvinciaLaboral(Provincia provinciaLaboral) {
		this.provinciaLaboral = provinciaLaboral;
	}

}
