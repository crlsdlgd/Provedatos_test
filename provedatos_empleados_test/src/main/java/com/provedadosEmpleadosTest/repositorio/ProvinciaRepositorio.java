package com.provedadosEmpleadosTest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.provedadosEmpleadosTest.modelo.Provincia;

@Repository
public interface ProvinciaRepositorio extends JpaRepository<Provincia, Long>{

}
