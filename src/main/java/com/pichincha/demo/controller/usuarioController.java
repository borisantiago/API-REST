package com.pichincha.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.pichincha.demo.interfaceService.IUsuarioService;
import com.pichincha.demo.modelo.Usuario;

@Controller
@RequestMapping
public class usuarioController {
	
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
	

}
