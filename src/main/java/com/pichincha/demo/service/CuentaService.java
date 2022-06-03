package com.pichincha.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.demo.interfaceService.ICuentaService;
import com.pichincha.demo.interfaces.ICuenta;
import com.pichincha.demo.modelo.Cuenta;

@Service
public class CuentaService implements ICuentaService {

	@Autowired
	private ICuenta data;
	
	@Override
	public List<Cuenta> listar() {
		return (List<Cuenta>)data.findAll();
	}

	@Override
	public Optional<Cuenta> listarCedula(int cedula) {
		
		return data.findById(cedula);
	}

	@Override
	public int save(Cuenta c) {
		int res = 0;
		Cuenta cuenta = data.save(c);
		if(!cuenta.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int cedula) {
		data.deleteById(cedula);
		
	}

}
