package ar.edu.unlam.practica;

import ar.edu.unlam.practica.interfaces.Corredores;

public class Corredor extends Deportista implements Corredores {

	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados = 0 ;
	
	public Corredor(Integer nroDeSocio, String nombre, Integer distanciaPreferida) {
		super(nroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
	}


	public void setCantidadDeKilometrosEntrenados(Integer kms) {
		this.cantidadDeKilometrosEntrenados += kms;
	}

	
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadDeKilometrosEntrenados;
	}
	

}
