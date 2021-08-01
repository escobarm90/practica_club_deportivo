package ar.edu.unlam.practica;

import ar.edu.unlam.enums.TipoDeBicicleta;
import ar.edu.unlam.practica.interfaces.Ciclistas;

public class Ciclista extends Deportista implements Ciclistas {

	private TipoDeBicicleta tipoDeBicicleta;
	
	public Ciclista(Integer nroDeSocio, String nombre, TipoDeBicicleta tipoDeBicicleta) {
		super(nroDeSocio, nombre);
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	

}
