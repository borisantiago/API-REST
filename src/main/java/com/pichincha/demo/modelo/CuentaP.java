package com.pichincha.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cuenta")
public class CuentaP {
	
	@Id
	private int ncuenta;
	private int cedulaU;
	private String tipo;
	private String estado;
	private double saldo;
	private String moneda;
	
	
	public CuentaP(int ncuenta, int cedulaU, String tipo, String estado, double saldo, String moneda) {
		super();
		this.ncuenta = ncuenta;
		this.cedulaU = cedulaU;
		this.tipo = tipo;
		this.estado = estado;
		this.saldo = saldo;
		this.moneda = moneda;
	}


	public CuentaP() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getNcuenta() {
		return ncuenta;
	}


	public void setNcuenta(int ncuenta) {
		this.ncuenta = ncuenta;
	}


	public int getCedulaU() {
		return cedulaU;
	}


	public void setCedulaU(int cedulaU) {
		this.cedulaU = cedulaU;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public double getValor() {
		return saldo;
	}


	public void setValor(double saldo) {
		this.saldo = saldo;
	}


	public String getMoneda() {
		return moneda;
	}


	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
	
	
	
	

}
