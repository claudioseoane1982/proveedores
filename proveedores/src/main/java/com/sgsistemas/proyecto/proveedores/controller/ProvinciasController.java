package com.sgsistemas.proyecto.proveedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgsistemas.proyecto.proveedores.domain.Provincias;
import com.sgsistemas.proyecto.proveedores.repository.ProvinciasRepository;

@RestController
@RequestMapping("/provincias")
public class ProvinciasController {

		@Autowired
		private ProvinciasRepository provinciasRepository;
		
		@GetMapping
		public List<Provincias> getall(){
			return this.provinciasRepository.findAll();
		}
		
		@PostMapping
		public Provincias save(@RequestBody Provincias c) {
			return this.provinciasRepository.save(c);
		}
		
		@GetMapping("/{id}")
		public Provincias getByid(@PathVariable("id") Long Id) {
			return this.provinciasRepository.findById(Id).orElse(null);
		}
	
}
