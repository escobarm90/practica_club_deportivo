package ar.edu.unlam.practica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import ar.edu.unlam.practica.excepciones.*;
import ar.edu.unlam.enums.TipoDeBicicleta;
import ar.edu.unlam.enums.TipoDeEvento;

public class ClubTest {

	
	@Test
	public void  queSePuedanIncorporarDistintosDeportistas() {
		// El número de socio no se puede repetir
		Club actual = new Club("CARP");
		
		actual.agregarDeportista(new Corredor(1000, "Camila", 42000));
		actual.agregarDeportista(new Corredor(1001, "Natalia", 5000));
		actual.agregarDeportista(new Corredor(1002, "Jorge", 21000));
		actual.agregarDeportista(new Nadador(1003, "Lucrecia", "Pecho"));
		actual.agregarDeportista(new Triatleta(1004, "Tamara", 10000, TipoDeBicicleta.RUTA));
		actual.agregarDeportista(new Ciclista(1005, "Alberto", TipoDeBicicleta.MONTAÑA));
		actual.agregarDeportista(new Ciclista(1006, "Domingo", TipoDeBicicleta.TRIATLON));
		actual.agregarDeportista(new Corredor(1007, "Luciana", 10000));
		actual.agregarDeportista(new Nadador(1008, "Luna", "Crol"));
		actual.agregarDeportista(new Nadador(1009, "Victor", "Mariposa"));
		actual.agregarDeportista(new Triatleta(1004, "Cecilia", 20000, TipoDeBicicleta.TRIATLON));
			
		assertEquals(10, actual.getCantidadDeSocios(),0.1);		
	}
	
	@Test (expected = NoEstaPreparadoException.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion () throws Exception{	
		// En las carreras de natación sólo pueden inscribirse los que sean INadador
		Deportista celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		actual.agregarDeportista(celeste);
		actual.crearEvento(TipoDeEvento.NATACION, "Maraton de aguas abiertas");
		
		actual.inscribirEnEvento("Maraton de aguas abiertas", celeste);
		
		assertEquals(1,actual.getEventoPorNombre("Maraton de aguas abiertas").getParticipantes(),0.1);
				
	}
	
	@Test (expected = NoEstaPreparadoException.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnTriatlon () throws Exception{		
		// En los triatlones sólo pueden inscribirse los que sean INadador & ICiclista
		Deportista celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		
		actual.crearEvento(TipoDeEvento.TRIATLON, "Triatlon Khona");
		
		actual.inscribirEnEvento("Triatlon Khona", celeste);
		
		assertEquals(0,actual.getEventoPorNombre("Triatlon Khona").getParticipantes(),0.1);		
	}
	
	@Test
	public void  queUnCorredorPuedaCorrerUnaMaraton() throws Exception{	
		Club nuevo = new Club("Moron");
		Deportista celeste = new Corredor(999, "Celeste", 42000);
		
		((Corredor) celeste).setCantidadDeKilometrosEntrenados(1000);
		
		nuevo.crearEvento(TipoDeEvento.PEDERISMO, "Maraton de New York");
	
		nuevo.inscribirEnEvento("Maraton de New York", celeste);
		
		assertEquals(1,nuevo.getEventoPorNombre("Maraton de New York").getParticipantes(),0.1);			
	}
	
}
