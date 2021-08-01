package ar.edu.unlam.practica;

import ar.edu.unlam.enums.TipoDeBicicleta;
import ar.edu.unlam.practica.interfaces.Ciclistas;
import ar.edu.unlam.practica.interfaces.Corredores;
import ar.edu.unlam.practica.interfaces.Nadadores;

public class Triatleta extends Deportista implements Ciclistas, Corredores, Nadadores {

	private TipoDeBicicleta tipoDeBicicleta;
	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;
	private String estiloPreferido;
	
	
	public Triatleta(Integer nroDeSocio, String nombre, Integer distanciaPreferida, TipoDeBicicleta tipoDeBicicleta) {
		super(nroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	@Override
	public String getEstiloPreferido() {
		return this.estiloPreferido;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer kms) {
		this.cantidadDeKilometrosEntrenados += kms;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadDeKilometrosEntrenados;
	}

}
