package com.sgsistemas.proyecto.proveedores.service;

import java.util.List;

import com.sgsistemas.proyecto.proveedores.domain.Proveedores;

public interface ProveedoresService {

	public List<Proveedores> getAll();
	
	public Proveedores getById(Long id);
	
	public List<Proveedores> getAllByPatron(String patron);
	
	public Proveedores save(Proveedores proveedor);
	
	public Proveedores delete(Long id);
	
}
