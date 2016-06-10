package com.request;

public class UsuarioRequest {

	private String Nombre;
	private String Ciudad;
	private String Telefono;
	private String Dirección;
	private int Edad;
	private String Email;

	public String getNombre() {
		return Nombre;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public String getTelefono() {
		return Telefono;
	}

	public String getDirección() {
		return Dirección;
	}

	public int getEdad() {
		return Edad;
	}

	public String getEmail() {
		return Email;
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
