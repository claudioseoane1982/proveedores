package com.sgsistemas.proyecto.proveedores.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table (name = "localidades")

public class Localidades {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="provincia_id")
	private Provincias provincia;

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

	public Provincias getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincias provincia) {
		this.provincia = provincia;
	}

  
	
	

}
