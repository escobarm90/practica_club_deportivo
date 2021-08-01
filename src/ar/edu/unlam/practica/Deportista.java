package ar.edu.unlam.practica;

public abstract class Deportista {

	private Integer nroDeSocio;
	private String nombre;
	
	public Deportista(Integer nroDeSocio, String nombre) {
		this.nroDeSocio = nroDeSocio;
		this.nombre = nombre;
	}

	public Integer getNroDeSocio() {
		return nroDeSocio;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nroDeSocio == null) ? 0 : nroDeSocio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {		
		Deportista other = (Deportista) obj;
		if (nroDeSocio == null) {
			if (other.nroDeSocio != null)
				return false;
		} else if (!nroDeSocio.equals(other.nroDeSocio))
			return false;
		return true;
	}
	
	
	
}
