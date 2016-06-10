package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")
public class Usuario {

	private int id;
	private String Nombre;
	private String Ciudad;
	private String Telefono;
	private String Dirección;
	private int Edad;
	private String Email;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return Nombre;
	}

	@Column(name = "ciudad")
	public String getCiudad() {
		return Ciudad;
	}

	@Column(name = "telefono")
	public String getTelefono() {
		return Telefono;
	}

	@Column(name = "direccion")
	public String getDirección() {
		return Dirección;
	}

	@Column(name = "edad")
	public int getEdad() {
		return Edad;
	}

	@Column(name = "correo")
	public String getEmail() {
		return Email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public void setDirección(String dirección) {
		Dirección = dirección;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
