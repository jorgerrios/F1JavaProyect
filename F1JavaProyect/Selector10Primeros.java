package es.upm.dit.prog.practica4;

public class Selector10Primeros implements Selector {
	
	
	public boolean selecciona(Corredor c){
		if (!c.equals(null)){
			contador ++;
		}
		if(contador <= 10){
			return true;
		}else{
			return false;
		}
	}
	
	public void inicia(){
		contador =0;
	}
	private static int contador = 0;
}
