package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Usuario;
import com.repository.UsuarioRepositorio;
import com.request.UsuarioRequest;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {
	
	@Autowired UsuarioRepositorio repositorio;

	public Usuario findById(Long id) {
		return repositorio.findOne(id);
	}

	public List<Usuario> findAll() {
		return repositorio.findAll();
	}

	public Usuario saveUser(UsuarioRequest userRequest) {
		return repositorio.save(fromReq(userRequest));
	}
	
	private Usuario fromReq(UsuarioRequest request){
		Usuario usuario = new Usuario();
		usuario.setCiudad(request.getCiudad());
		usuario.setDirección(request.getDirección());
		usuario.setEdad(request.getEdad());
		usuario.setEmail(request.getEmail());
		usuario.setNombre(request.getNombre());
		usuario.setTelefono(request.getTelefono());
		
		return usuario;
	}
	
	

}
