package com.sgsistemas.proyecto.proveedores.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table (name = "provincias")

public class Provincias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
	private String nombre;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
