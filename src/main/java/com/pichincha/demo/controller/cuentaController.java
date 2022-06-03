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

import com.pichincha.demo.interfaceService.ICuentaService;
import com.pichincha.demo.modelo.Cuenta;

@Controller
@RequestMapping
public class cuentaController {

	@Autowired
	private ICuentaService service;
	
	@GetMapping("/listar_cuentas")
	public String lsitar(Model model) {
		List<Cuenta>cuentas = service.listar();
		model.addAttribute("cuentas",cuentas);
		return "cuentas";
	}
	
	@GetMapping("/nueva_cuenta")
	public String agregar(Model model) {
		model.addAttribute("cuenta", new Cuenta());
		return "formCuenta";
	}
	
	@PostMapping("/save_cuenta")
	public String save(Cuenta c, Model model) {
		service.save(c);
		return "redirect:/listar_cuentas";
	}
	
	@GetMapping("/editar_cuenta/{cedula}")
	public String editar(@PathVariable int cedula, Model model) {
		Optional<Cuenta>cuenta = service.listarCedula(cedula);
		model.addAttribute("cuenta", cuenta);
		return "formCuenta";
	}
	
	@GetMapping("/eliminar_cuenta/{cedula}")
	public String delete(Model model, @PathVariable int cedula) {
		service.delete(cedula);
		return "redirect:/listar_cuentas";
	}
	
	
}
