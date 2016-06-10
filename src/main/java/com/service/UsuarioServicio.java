package com.service;

import java.util.List;

import com.model.Usuario;
import com.request.UsuarioRequest;

public interface UsuarioServicio {

	public Usuario findById(Long id);

	public List<Usuario> findAll();

	public Usuario saveUser(UsuarioRequest userRequest);

}
