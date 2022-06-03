package com.pichincha.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.pichincha.demo.modelo.Cuenta;

public interface ICuentaService {

	public List<Cuenta>listar();
	public Optional<Cuenta>listarCedula(int cedula);
	public int save(Cuenta c);
	public void delete(int cedula);
}
