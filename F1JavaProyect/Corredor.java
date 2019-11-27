/**
 * 
 */
package es.upm.dit.prog.practica4;

public class Corredor {
	private String nombre;
	private String iniciales;
	private String pais;
	private String escuderia;
	private Estado estado;
	private long tCarrera;
	private long tUltimaVuelta;
	private long tMejorVuelta;
	private int nVueltas;
	public Corredor(String nombre, String iniciales, String pais, String escuderia) {
		this.nombre = nombre;
		this.iniciales = iniciales;
		this.pais = pais;
		this.escuderia = escuderia;	
		tCarrera = 0;
		tUltimaVuelta = 0;
		nVueltas = 0;
		tMejorVuelta = Long.MAX_VALUE;
		estado = Estado.ESPERA; 
	}
	public String getNombre (){
		return this.nombre;
		}
	public String getIniciales (){
		return this.iniciales;
		}
	public String getPais (){
		return this.pais;
		}
	public String getEscuderia (){
		return this.escuderia;
		}
	public Estado getEstado (){
		return estado;
		}
	public long gettCarrera (){
		return tCarrera;
		}
	public long gettUltimaVuelta (){
		return tUltimaVuelta;
		}
	public long gettMejorVuelta (){
		return tMejorVuelta;
		}
	public int getNVueltas (){
		return nVueltas;
		}
	public void enCarrera() {
		this.estado = Estado.ENCARRERA;
	}
    public void fueraCarrera() {
    	this.estado = Estado.FUERACARRERA;
    }
    public void aBoxes() {
    	this.estado = Estado.ENBOXES;
    }
	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", iniciales=" + iniciales + ", pais=" + pais + ", escuderia=" + escuderia
				+ ", estado=" + estado + ", tCarrera=" + tCarrera + ", tUltimaVuelta=" + tUltimaVuelta
				+ ", tMejorVuelta=" + tMejorVuelta + ", nVueltas=" + nVueltas + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((escuderia == null) ? 0 : escuderia.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((iniciales == null) ? 0 : iniciales.hashCode());
		result = prime * result + nVueltas;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + (int) (tCarrera ^ (tCarrera >>> 32));
		result = prime * result + (int) (tMejorVuelta ^ (tMejorVuelta >>> 32));
		result = prime * result + (int) (tUltimaVuelta ^ (tUltimaVuelta >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corredor other = (Corredor) obj;
		if (escuderia == null) {
			if (other.escuderia != null)
				return false;
		} else if (!escuderia.equals(other.escuderia))
			return false;
		if (estado != other.estado)
			return false;
		if (iniciales == null) {
			if (other.iniciales != null)
				return false;
		} else if (!iniciales.equals(other.iniciales))
			return false;
		if (nVueltas != other.nVueltas)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (tCarrera != other.tCarrera)
			return false;
		if (tMejorVuelta != other.tMejorVuelta)
			return false;
		if (tUltimaVuelta != other.tUltimaVuelta)
			return false;
		return true;
	}
    
	public void vuelta(long tUltimaVuelta) {
		this.tUltimaVuelta = tUltimaVuelta ;
		this.tCarrera = this.tCarrera + tUltimaVuelta;
	    this.tMejorVuelta = Math.min(tMejorVuelta, tUltimaVuelta);
	    this.nVueltas = nVueltas + 1;
	}
	public void finCarrera(long t){
		/*this.tCarrera = this.tCarrera + t;
		this.tUltimaVuelta = t;
		this.nVueltas = nVueltas + 1;
		this.tMejorVuelta = Math.min(tMejorVuelta, t);*/
		vuelta(t);
		estado = Estado.FINAL;
			
		}
	
}
