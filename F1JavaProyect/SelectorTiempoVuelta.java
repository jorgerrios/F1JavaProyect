package es.upm.dit.prog.practica4;

public class SelectorTiempoVuelta implements Selector{
	public SelectorTiempoVuelta(long mtiempo){
		this.mtiempo = mtiempo;
	}
	public void inicia(){}
	public boolean selecciona(Corredor c){
		boolean a = false;
		if(c.gettMejorVuelta()< mtiempo){
			a = true;
		}
		return a;
	}
	long mtiempo;
}
