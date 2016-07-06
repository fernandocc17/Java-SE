package model;

import interfaces.Movimiento;

import java.util.Scanner;

import enums.Sexo;

public abstract class SerVivo implements Movimiento {
	private String nombre;
	private int edad;
	@Override
	public String toString() {
		return "SerVivo [nombre=" + nombre + ", edad=" + edad + ", sexo="
				+ sexo + "]";
	}

	private Sexo sexo;

	public SerVivo() {
		super();
		Scanner sc = new Scanner(System.in);
		int sexo;
		System.out.println("Dame el nombre");
		nombre = sc.next();
		System.out.println("Dame la edad");
		edad = sc.nextInt();
		System.out.println("1.- Masculino 2.- Femenino");
		sexo=sc.nextInt();
		if (sexo==1)
				this.sexo=Sexo.MASCULINO;
		else
				this.sexo=Sexo.FEMENINO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}
