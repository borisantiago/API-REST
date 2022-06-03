package com.pichincha.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.pichincha.demo.modelo.Usuario;

public interface IUsuarioService {
	public List<Usuario>listar();
	public Optional<Usuario>listarCedula(int cedula);
	public int save(Usuario u);
	public void delete(int cedula);
}
