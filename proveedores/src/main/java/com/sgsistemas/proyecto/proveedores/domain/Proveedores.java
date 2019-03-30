package com.sgsistemas.proyecto.proveedores.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table (name = "proveedores")

public class Proveedores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
	private String nombre;
	private String domicilio;
	private String cuitcuil;
		
	@ManyToOne
	@JoinColumn(name="localidad_id")
	private Localidades localidad;

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

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCuitcuil() {
		return cuitcuil;
	}

	public void setCuitcuil(String cuitcuil) {
		this.cuitcuil = cuitcuil;
	}

	public Localidades getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidades localidad) {
		this.localidad = localidad;
	}


}
