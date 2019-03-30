package com.sgsistemas.proyecto.proveedores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sgsistemas.proyecto.proveedores.domain.Proveedores;

public interface ProveedoresRepository extends JpaRepository<Proveedores, Long>{

	@Query("select p from Proveedores p where p.nombre like '%:patron%'")
	public List<Proveedores> getProveedoresConPatron(@Param("patron") String patron);

	public List<Proveedores> findByNombreContains(String patron);
}
