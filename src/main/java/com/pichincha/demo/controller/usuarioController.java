package com.pichincha.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pichincha.demo.modelo.Usuario;
import com.pichincha.demo.service.UsuarioService;

@Controller
@RequestMapping("/api/user")
public class usuarioController {
	
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping("/save")
	public ResponseEntity<Usuario> guardar(@RequestBody Usuario u){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.guardar(u));
	}
	
	/*
	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/listar")
	public String lsitar(Model model) {
		List<Usuario>usuarios = service.listar();
		model.addAttribute("usuarios", usuarios);
		return "index";
	}
	
	
	@GetMapping("/nuevo")
	public String agregar(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "form";
	}
	
	
	//public String save(@Valid Usuario u, Model model) {
	@PostMapping("/save")
	public String save(Usuario u, Model model) {
		service.save(u);
		return "redirect:/listar";
	}
	
	
	@GetMapping("/editar/{cedula}")
	public String editar(@PathVariable int cedula, Model model) {
		Optional<Usuario>usuario = service.listarCedula(cedula);
		model.addAttribute("usuario", usuario);
		return "form";
	}
	
	@GetMapping("/eliminar/{cedula}")
	public String delete(Model model, @PathVariable int cedula) {
		service.delete(cedula);
		return "redirect:/listar";
	}
	*/

}
