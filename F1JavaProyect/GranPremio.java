package es.upm.dit.prog.practica4;

import java.util.Arrays;

public class GranPremio<Corredores> {
		private String circuito;
		Corredor[] corredores;
		Corredor[] boxes;
		Corredor[] fueraDeCarrera;
		
		
		@Override
		public String toString() {
			return "GranPremio [circuito=" + circuito + ", corredores=" + Arrays.toString(corredores) + ", boxes="
					+ Arrays.toString(boxes) + ", fueraDeCarrera=" + Arrays.toString(fueraDeCarrera) + "]";
		}
		
		
		public GranPremio(String nombre, int n){
			circuito = nombre;
			corredores = new Corredor [n];
			boxes = new Corredor [n];
			fueraDeCarrera = new Corredor [n];
		
		}
		private boolean addCorredor(Corredor[] cs, Corredor c){	
			boolean a = false;
			if(c != null && cs[cs.length -1] == null){
				for (int i = 0; i < cs.length -1; i++) {
					if(cs[i] == null){
					cs[i] = c;
					a = true;
					break;
					}
				}
			}else{
					a = false;
			}

			return a;
		}
		
		public boolean addCorredor(Corredor c){
			boolean a = false;
			if(c != null && corredores[corredores.length -1] == null){
				for (int i = 0; i < corredores.length; i++) {
					if(corredores[i] == null){
					corredores[i] = c;
					a = true;
					break;
					}
				}
			}else{
					a = false;
			}

			return a;
		}
		
		private boolean addCorredor(Corredor[] cs, Corredor c, int n){
			boolean puede = false;
			if((c != null) && (n<cs.length)){
				for (int i = cs.length -2; i>=n; i--){
					cs[i+1]= cs[i];
				}
				cs[n]=c;
				puede = true;
			}
			return puede;
		}
		public boolean addCorredor(Corredor c, int n){
		boolean a = false;
			if((c != null && n>=0) && n<= corredores.length -1){
				for(int i= corredores.length -2;i> n; i--){
					corredores[i +1] = corredores[i];
					corredores[i] = c;
					a = true;
					}
				
				}else{
				a = false;
			}
		return a;
	}
		
		public Corredor[] getCorredores(Selector s){
			int n=0;
			if(s.equals(null)){
				SelectorTrue sAux = new SelectorTrue();
				s = sAux;
			}
			s.inicia();
			for (int i = 0; i < corredores.length; i++){
					if(s.selecciona(corredores[i])){
						n++;
					}
			}
			int w=0;
			
			Corredor[] aux = new Corredor[n];
			
			s.inicia();
			for(int i=0; i<corredores.length; i++){
				if(corredores[i] != null && s.selecciona(corredores[i])){
					aux[w++] = corredores[i];
				}
				
			}
			return aux;
			
		}	
	
			
		
		 public void inicioCarrera(){
			 for(int i=0; i<corredores.length -1;i++){
				 if(corredores[i] != null){
					 corredores[i].enCarrera();
				 }
			 }
		 }
		 
		 private int getPosicion(Corredor[] cs, Corredor c){
			 int n=-1;
			 if(c!=null){
			 for(int i=0; i<cs.length;i++){
				 if(cs[i] != null && cs[i].equals(c)){
					 n=i;
					 break;
				 }
			 }  
		 }
			 return n;
	}
		 public void vuelta(Corredor c, long t){
			 if(getPosicion(corredores, c) != -1){
				 corredores[getPosicion(corredores,c)].vuelta(t);
			 }
		 }
		 
		 public void finCarrera(Corredor c, long t){
			 if(getPosicion(corredores, c) != -1){
				 corredores[getPosicion(corredores,c)].finCarrera(t);
			 }
		 }
		 
		 private boolean removeCorredor(Corredor[] cs, Corredor c){
			boolean esta = false;
			Corredor aux=null;
			if(getPosicion(cs, c) != -1){
				esta = true;
				for(int i = getPosicion(cs,c); i<cs.length -1; i++){
					aux = cs[i+1];
					cs[i] = aux;
				}
				cs[cs.length -1] = null;
			}
			return esta;
		 }
		 
		 public void fueraDeCarrera(Corredor c){
			 if(removeCorredor(corredores,c) && addCorredor(fueraDeCarrera,c)){
				 c.fueraCarrera();
			 }
				 
		 }
		 
		 public void  aBoxes(Corredor c){
			 if(removeCorredor(corredores,c) && addCorredor(boxes,c)){
				 c.aBoxes();
			 }
		 }
		 
		 public void deBoxes(Corredor c, int n){
			if(((c!= null && removeCorredor(boxes,c) && addCorredor(corredores,c,n)) && n>= 0) && n<= corredores.length -1){
				c.enCarrera();
			}
			 
		 }
		 
		 public boolean adelanta(Corredor c1, Corredor c2){
			 boolean sepuede= false, estac1 = false, estac2=false;
			 int pc1= 0;
			 int pc2 = 0;
			 for(int i=0; i<corredores.length && !sepuede; i++){
				 if(corredores[i] == c1){
					 estac1 = true;
					 pc1 = i;
					 
				 }
				 if(corredores[i] == c2){
					 estac2 = true;
					 pc2 = i;
				 
				 }
				 if( estac1 && estac2)
					 sepuede = true;
			 }
			 if(sepuede){
				 corredores[pc1] = c2;
				 corredores[pc2] = c1;
				 
			 }
			 return sepuede;
		 }

	
}
