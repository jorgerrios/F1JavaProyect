package es.upm.dit.prog.practica4;

public class SelectorPais implements Selector {
	private String pais;
	public SelectorPais(String pais){
		this.pais = pais;
	}
	public boolean selecciona(Corredor c){
		boolean a = false;
		if(c!= null && c.getPais()== pais){
			a = true;
		}
		return a;
	}
	public void inicia(){};
	
}
