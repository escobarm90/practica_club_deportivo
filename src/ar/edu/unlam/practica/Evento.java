package ar.edu.unlam.practica;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.enums.TipoDeEvento;
import ar.edu.unlam.practica.excepciones.NoEstaPreparadoException;
import ar.edu.unlam.practica.interfaces.Ciclistas;
import ar.edu.unlam.practica.interfaces.Corredores;
import ar.edu.unlam.practica.interfaces.Nadadores;

public class Evento {

	private String nombre;
	private TipoDeEvento tipo;
	private Set<Deportista> participantes;
	
	public Evento(TipoDeEvento tipo,String nombre) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.participantes = new HashSet<Deportista>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Boolean agregarParticipante(Deportista participante) throws NoEstaPreparadoException {
		if(this.tipo.equals(TipoDeEvento.PEDERISMO) && participante instanceof Corredores) {
			return participantes.add(participante);
		}if(this.tipo.equals(TipoDeEvento.NATACION) && participante instanceof Nadadores) {
			return participantes.add(participante);
		}if(this.tipo.equals(TipoDeEvento.CICLISMO) && participante instanceof Ciclistas) {
			return participantes.add(participante);
		}if(this.tipo.equals(TipoDeEvento.ACUATLON) && participante instanceof Nadadores && participante instanceof Corredores) {
			return participantes.add(participante);
		}if(this.tipo.equals(TipoDeEvento.DUATLON) && participante instanceof Corredores && participante instanceof Ciclistas) {
			return participantes.add(participante);			
		}if(this.tipo.equals(TipoDeEvento.TRIATLON) && participante instanceof Nadadores && participante instanceof Corredores ){
			return participantes.add(participante);
		}else throw new NoEstaPreparadoException("No Esta Preparado");
	}
	
	public Integer getParticipantes() {
		return this.participantes.size();
	}
	
}
