package com.pichincha.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.pichincha.demo.modelo.CuentaP;

public interface ICuentaService {
	
	public List<CuentaP>listar();
	public Optional<CuentaP>listarPorCuenta(int ncuenta);
	public CuentaP listarPorCedula(int cedulaU);
	public CuentaP guardar(CuentaP c);
	public String delete(int ncuenta);
	public CuentaP actualizarCuenta(int ncuenta, CuentaP c);

}
