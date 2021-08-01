package ar.edu.unlam.practica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unlam.enums.TipoDeEvento;
import ar.edu.unlam.practica.excepciones.NoEstaPreparadoException;


public class Club {
	
	private String nombre;
	private Set<Deportista> socios;
	private List<Evento> eventos = new ArrayList<Evento>();
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Deportista>();
	}
	
	public void agregarDeportista(Deportista deportista) {
		this.socios.add(deportista);
	}
	
	public Integer getCantidadDeSocios() {
		return this.socios.size();
	}
	
	public void crearEvento(TipoDeEvento tipo,String nombre) {
		Evento nuevo = new Evento(tipo,nombre);
		eventos.add(nuevo);
	}
	
	public Evento getEventoPorNombre(String nombre) {
		Evento buscado = null;
		for (Evento evento: eventos) {
			if (evento.getNombre().equals(nombre)){
				buscado = evento;
			}
		}return buscado;
	}
	
	public void inscribirEnEvento(String nombre, Deportista participante) throws NoEstaPreparadoException {
		Evento buscado = null;
		for (Evento evento: eventos) {
			if (evento.getNombre().equals(nombre)){
				evento.agregarParticipante(participante);
			}
		}		
	}
}
