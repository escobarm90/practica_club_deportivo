package ar.edu.unlam.practica;

import ar.edu.unlam.practica.interfaces.Nadadores;

public class Nadador extends Deportista implements Nadadores {
	
	private String estiloPreferido;
	
	
	public Nadador(Integer nroDeSocio, String nombre, String estiloPreferido) {
		super(nroDeSocio, nombre);
		this.estiloPreferido = estiloPreferido;
	}


	@Override
	public String getEstiloPreferido() {
		return this.estiloPreferido;
	}

}
