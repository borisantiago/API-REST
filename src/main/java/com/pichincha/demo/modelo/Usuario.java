package com.pichincha.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cedula;
	private String nombres;
	private String telefono;
	private int edad;
	private int n_cuenta;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Usuario(int cedula, String nombres, String telefono, int edad, int n_cuenta) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.telefono = telefono;
		this.edad = edad;
		this.n_cuenta = n_cuenta;
	}


	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getN_cuenta() {
		return n_cuenta;
	}


	public void setN_cuenta(int n_cuenta) {
		this.n_cuenta = n_cuenta;
	}
	
	
	
	
	
}
