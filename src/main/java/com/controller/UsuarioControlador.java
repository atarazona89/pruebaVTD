package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Usuario;
import com.request.UsuarioRequest;
import com.service.UsuarioServicio;

@Controller
@RequestMapping(value = "/user")
public class UsuarioControlador {
	
	@Autowired
	UsuarioServicio usuarioServicio;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Usuario getUser(@PathVariable("id") Long id) {
		System.out.println("en controlador");
		return usuarioServicio.findById(id);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public @ResponseBody
	List<Usuario> getUsers() {
		return usuarioServicio.findAll();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public @ResponseBody
	Usuario createUser(@RequestBody UsuarioRequest userRequest) {
		return usuarioServicio.saveUser(userRequest);
	}

}
