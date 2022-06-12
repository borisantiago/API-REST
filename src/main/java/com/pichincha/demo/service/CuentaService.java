package com.pichincha.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.demo.exception.BadRequestException;
import com.pichincha.demo.exception.NotFoundException;
import com.pichincha.demo.interfaceService.ICuentaService;
import com.pichincha.demo.interfaces.ICuentaP;
import com.pichincha.demo.modelo.CuentaP;


@Service
public class CuentaService implements ICuentaService{

	@Autowired
	ICuentaP iCuenta;
	
	@Override
	public List<CuentaP> listar() {
		List<CuentaP> cuentas = (List<CuentaP>) iCuenta.findAll();
		if(cuentas.size()>0) {
			return cuentas;
		}else {
			throw new BadRequestException("{\"message\":\"No existen cuentas\",\"status\":false}");
		}
		
	}

	@Override
	public Optional<CuentaP> listarPorCuenta(int ncuenta) {
		if(!iCuenta.existsById(ncuenta))
			throw new NotFoundException("No existe la cuenta con el nuemro: "+ncuenta);
		return iCuenta.findById(ncuenta);
	}

	@Override
	public CuentaP listarPorCedula(int cedulaU) {
		if(!iCuenta.existByCedula(cedulaU)) {
			throw new NotFoundException("No existe la cedula en las cuentas registradas: "+cedulaU);
		}else {
			return iCuenta.findByCedulaU(cedulaU);
		}
		
	}

	@Override
	public CuentaP guardar(CuentaP c) {
		String mensaje;
		int ncuentaN = c.getNcuenta();
		CuentaP CuentaN = iCuenta.findByNcuenta(ncuentaN);
		
		if(CuentaN == null) {
			return iCuenta.save(c);
		}
		
		if(CuentaN != null) {
			mensaje = "Ya está el número de cuenta registrado";
			throw new BadRequestException(mensaje);
		}
		mensaje = "Usuario tuvo problemas al registro, preguntar al admin";
		throw new BadRequestException(mensaje);
	}

	@Override
	public CuentaP actualizarCuenta(int ncuenta, CuentaP c) {
		String mensaje = "";
		Optional<CuentaP> cuentaU = iCuenta.findById(ncuenta);
		if(cuentaU.isPresent()) {
			if( c != null) {
				int cuentaUser = cuentaU.get().getNcuenta();
				int cuentaReg = c.getNcuenta();
				if(cuentaUser == cuentaReg) {
					return iCuenta.save(c);
				}
				mensaje = "No se puede modificar el numero de cuenta";
                throw new BadRequestException(mensaje);
			}else {
				mensaje= "No existe información";
				throw new NotFoundException(mensaje);
			}
		}else {
			mensaje="La informacion no existe";
			throw new NotFoundException(mensaje);
		}
		
	}

	@Override
	public String delete(int ncuenta) {
		if(iCuenta.existsById(ncuenta)) {
			iCuenta.deleteById(ncuenta);
			return "{\"message\":\"Cuenta eliminada con exito, "+ncuenta+"\",\"status\":true}";
		}
		throw new NotFoundException("{\"message\":\"No se elimino, debido a que no se encontro la cuenta "+ncuenta+"\",\"status\":false}");
	}

	
}
