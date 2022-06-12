package com.pichincha.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	/*
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	*/
	private int cedula;
	private String nombre;
	private String apellido;
	private String telefono;
	private int edad;
	private int n_cuenta;
	
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Usuario(int cedula, String nombre, String apellido, String telefono, int edad, int n_cuenta) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
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


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
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
