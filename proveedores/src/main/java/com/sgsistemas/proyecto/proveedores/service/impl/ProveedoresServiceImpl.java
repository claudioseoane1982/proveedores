package com.sgsistemas.proyecto.proveedores.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgsistemas.proyecto.proveedores.domain.Proveedores;
import com.sgsistemas.proyecto.proveedores.repository.ProveedoresRepository;
import com.sgsistemas.proyecto.proveedores.service.ProveedoresService;

@Service
public class ProveedoresServiceImpl implements ProveedoresService {

	@Autowired
	private ProveedoresRepository proveedoresRepository;
	
	@Override
	public List<Proveedores> getAll() {
		return this.proveedoresRepository.findAll();
	}

	@Override
	public Proveedores getById(Long id) {
		return this.proveedoresRepository.findById(id).orElse(null);
	}

	@Override
	public List<Proveedores> getAllByPatron(String patron) {
		List<Proveedores> result = null;
		if (patron != null) {
			result = this.proveedoresRepository.findByNombreContains(patron);
		} else {
			result = this.proveedoresRepository.findAll();
		}
		return result;
	}

	@Override
	public Proveedores save(Proveedores proveedor) {
		return this.proveedoresRepository.save(proveedor);
	}

	@Override
	public Proveedores delete(Long id) {
		Proveedores proveedor = this.getById(id);
		if (proveedor != null) {
			this.proveedoresRepository.delete(proveedor);
		}
		return proveedor;
	}

}
