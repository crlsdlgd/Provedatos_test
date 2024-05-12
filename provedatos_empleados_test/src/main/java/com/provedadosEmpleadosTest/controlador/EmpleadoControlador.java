package com.provedadosEmpleadosTest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.provedadosEmpleadosTest.modelo.Empleado;
import com.provedadosEmpleadosTest.repositorio.EmpleadoRepositorio;
import com.provedadosEmpleadosTest.servicio.EmpleadoServicio;

@RestController
@RequestMapping("/empleado/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoControlador {
	
	@Autowired
	private EmpleadoRepositorio repositorio;
	
	@Autowired
	private EmpleadoServicio servicio;
	
	@GetMapping("/listar")
	public List<Empleado> listarTodosLosEmpleados() {
		return repositorio.findAll();
	}
	
	@PostMapping("/guardar")
	public Empleado crearEmpleado(@RequestBody Empleado empleado) {
		return repositorio.save(empleado);
	}
	
	@GetMapping("/listar/{nombres}/{codigo}")
	public List<Empleado> buscarPorNombreOCodigo(@PathVariable String nombres, @PathVariable String codigo) {
		return servicio.buscarPorNombreOCodigo(nombres, codigo);
	}
	
	@GetMapping("/buscarPorNombre/{nombres}")
	public List<Empleado> buscarPorNombre(@PathVariable String nombres) {
		return repositorio.buscarPorNombre(nombres);
	}
	
	@GetMapping("/buscarPorCodigo/{codigo}")
	public List<Empleado> buscarPorCodigo(@PathVariable String codigo) {
		return repositorio.buscarPorCodigo(codigo);
	}
}
