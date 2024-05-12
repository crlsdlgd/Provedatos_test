package com.provedadosEmpleadosTest.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.provedadosEmpleadosTest.modelo.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{

	@Query(value = "SELECT e.* FROM empleado e WHERE e.nombres LIKE CONCAT('%', :nombres, '%') OR e.apellidos LIKE CONCAT('%', :nombres, '%') OR e.codigo = :codigo", nativeQuery = true)
	List<Empleado> buscarPorNombreOCodigo(@Param("nombres") String nombres, @Param("codigo") String codigo);

	@Query(value = "SELECT e.* FROM empleado e WHERE e.nombres LIKE CONCAT('%', :nombres, '%') OR e.apellidos LIKE CONCAT('%', :nombres, '%')", nativeQuery = true)
	List<Empleado> buscarPorNombre(@Param("nombres") String nombres);

	@Query(value = "SELECT e.* FROM empleado e WHERE e.codigo = :codigo", nativeQuery = true)
	List<Empleado> buscarPorCodigo(@Param("codigo") String codigo);

}
