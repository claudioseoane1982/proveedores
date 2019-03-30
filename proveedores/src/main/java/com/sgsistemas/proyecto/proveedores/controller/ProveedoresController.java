package com.sgsistemas.proyecto.proveedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgsistemas.proyecto.proveedores.domain.Proveedores;
import com.sgsistemas.proyecto.proveedores.repository.ProveedoresRepository;

@RestController
@RequestMapping("/proveedores")
public class ProveedoresController {

		@Autowired
		private ProveedoresRepository proveedoresRepository;
		
		@GetMapping
		public List<Proveedores> getall(){
			return this.proveedoresRepository.findAll();
		}
		
		@PostMapping
		public Proveedores save(@RequestBody Proveedores c) {
			return this.proveedoresRepository.save(c);
		}
		
		@GetMapping("/{id}")
		public Proveedores getByid(@PathVariable("id") Long Id) {
			return this.proveedoresRepository.findById(Id).orElse(null);
		}
	
}
