package com.provedadosEmpleadosTest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provedadosEmpleadosTest.modelo.Empleado;
import com.provedadosEmpleadosTest.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServicio {
	
	@Autowired
	private EmpleadoRepositorio repositorio;
	
    public List<Empleado> buscarPorNombreOCodigo(String nombres, String codigo) {
    	nombres = nombres != null ? nombres : "";
    	codigo = codigo != null ? codigo : "";
    	return repositorio.buscarPorNombreOCodigo(nombres, codigo);
    }
}
