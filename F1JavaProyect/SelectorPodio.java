package es.upm.dit.prog.practica4;

public class SelectorPodio implements Selector {
private static int contador = 0;

	public boolean selecciona(Corredor c){
		if (!c.equals(null)){
			contador ++;
		}
		if(contador <= 3){
			return true;
		}else{
			return false;
		}
	}
	
	public void inicia(){
		contador =0;
	}
	

}
