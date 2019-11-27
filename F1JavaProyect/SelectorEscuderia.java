package es.upm.dit.prog.practica4;

public class SelectorEscuderia implements Selector {
	
	public SelectorEscuderia(String escuderia){
		this.escuderia = escuderia;
	}
	public boolean selecciona(Corredor c){
		boolean a = false;
		if(c!= null && c.getEscuderia() == escuderia){
			a = true;
			
		}
		return a;
	}
	public void inicia(){};
	String escuderia;
}
