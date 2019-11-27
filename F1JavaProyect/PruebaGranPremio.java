package es.upm.dit.prog.practica4;

import java.util.Arrays;
import java.util.Random;

public class PruebaGranPremio {
	public static void main (String[] args) {
		Corredor [] cs = {		
				new Corredor ("Nico Rosberg", "ROS", "GE", "Mercedes"),
				new Corredor ("Lewis Hamilton", "HAM", "UK","Mercedes"),
				new Corredor ("Daniel Ricciardo", "RIC", "AUS", "Red Bull"),
				new Corredor ("Sebastian Vettel", "VET", "GE", "Ferrari"),
				new Corredor ("Max Verstappen", "VER", "NE", "Red Bull"),
				new Corredor ("Kimi Raikkonen", "RAI", "FI", "Ferrari"),
				new Corredor ("Sergio Perez", "PER", "ME", "Force India"),
				new Corredor ("Valtteri Bottas", "BOT", "FI", "Williams"),
				new Corredor ("Nico Hulkenberg", "HUL", "GE", "Force India"),
				new Corredor ("Fernando Alonso", "ALO", "ES", "McLaren Honda"),
				new Corredor ("Felipe Massa", "MAS", "BR", "Williams"),
				new Corredor ("Carlos Sainz", "SAI", "ES", "Toro Rosso"),
				new Corredor ("Romain Grosjean", "GRO", "FR", "Haas F1 Team"),
				new Corredor ("Daniil Kvyat", "KVY", "RU", "Toro Rosso"),
				new Corredor ("Jenson Button", "BUT", "UK", "McLaren Honda")
		};

		/*GranPremio gp = new GranPremio ("Barcelona", 15);
		
		
		int nPrueba = 0;
		
		// nok addCorredor
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : " + gp.addCorredor (cs[0], -1) + "nok add corredor ");
		System.out.println("GP: " + gp);

		// nok addCorredor
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : " + gp.addCorredor (cs[0], cs.length) + "nok add corredor ");
		System.out.println("GP: " + gp);

		// ok addCorredor
		nPrueba++; 
		System.out.println("Prueba " + nPrueba + " : " + gp.addCorredor (cs[0]) + "ok add corredor ");
		System.out.println("GP: " + gp);

		// ok addCorredor
		nPrueba++; 
		System.out.println("Prueba " + nPrueba + " : " + gp.addCorredor (cs[1]) + " ok add corredor ");
		System.out.println("GP: " + gp);

		// ok addCorredor
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : " + gp.addCorredor (cs[3], 3) + " ok add corredor ");
		System.out.println("GP: " + gp);

		// ok getCorredores
		nPrueba++;
		Corredor[] cs2 = gp.getCorredores((Selector)null);
		System.out.println("Prueba " + nPrueba + " : ok getCorredores ");
		for (int i = 0; i < cs2.length; i++) {
			if (cs2[i] != null) {
				System.out.println (cs2[i] + "\n");
			}
			else
				System.out.println ("null\n");
		}
		
		// ok addCorredor
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : " + gp.addCorredor (cs[2]) + " ok add corredor ");
		System.out.println("GP: " + gp);

		// ok addCorredor
		nPrueba++;
		boolean res = true;
		for (int i = 4; i < cs.length; i++) {
			if (!gp.addCorredor (cs[i]))
				res = false;
		}
		System.out.println("Prueba " + nPrueba + " : " + res + " ok add corredor 10 veces");
		System.out.println("GP: " + gp);

		// nok addCorredor
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : " + gp.addCorredor (cs[0]) + " nok add corredor ");
		System.out.println("GP: " + gp);
		
		// ok inicioCarrera
		nPrueba++;
		gp.inicioCarrera();
		System.out.println("Prueba " + nPrueba + " : inicioCarrera ");
		System.out.println("GP: " + gp);
		
		// ok vuelta
		nPrueba++;
		for (int n = 0; n < 20; n++) {
			long tvuelta = 95000;
			Random r = new Random();
			for (int i = 0; i < cs.length; i++) {
				tvuelta += (long)(r.nextDouble()*100);
				gp.vuelta (cs[i], tvuelta); 
			}
		}
		System.out.println("Prueba " + nPrueba + " : ok 20 vueltas todos");
		System.out.println("GP: " + gp);

		// ok fueraDeCarrera
		nPrueba++;
		gp.fueraDeCarrera(cs[cs.length -1]);
		System.out.println("Prueba " + nPrueba + " : ok FueraDeCarrera 14 ");
		System.out.println("GP: " + gp);
	
		// nok fueraDeCarrera
		nPrueba++;
		gp.fueraDeCarrera(cs[cs.length -1]);
		System.out.println("Prueba " + nPrueba + " : nok FueraDeCarrera ");
		System.out.println("GP: " + gp);
		
		// nok aBoxes 
		nPrueba++;
		gp.aBoxes(cs[cs.length-1]);
		System.out.println("Prueba " + nPrueba + " : nok aBoxes ");
		System.out.println("GP: " + gp);
		
		// nok deBoxes 
		nPrueba++;
		gp.deBoxes(cs[0], 0);
		System.out.println("Prueba " + nPrueba + " : nok deBoxes ");
		System.out.println("GP: " + gp);
		
		// ok aBoxes
		nPrueba++;
		gp.aBoxes(cs[cs.length-2]);
		System.out.println("Prueba " + nPrueba + " : ok aBoxes ");
		System.out.println("GP: " + gp);

		// ok deBoxes
		nPrueba++;
		gp.deBoxes(cs[cs.length-2], 13);
		System.out.println("Prueba " + nPrueba + " : ok deBoxes ");
		System.out.println("GP: " + gp);
		
		// ok aBoxes
		nPrueba++;
		gp.aBoxes(cs[11]);
		System.out.println("Prueba " + nPrueba + " : ok aBoxes ");
		System.out.println("GP: " + gp);

		// ok deBoxes
		nPrueba++;
		gp.deBoxes(cs[11], 10);
		System.out.println("Prueba " + nPrueba + " : ok deBoxes ");
		System.out.println("GP: " + gp);
		
		// nok adelanta
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : " + gp.adelanta(cs[cs.length -1], cs[12]) + " nok adelanta ");
		System.out.println("GP: " + gp);
		
		// ok adelanta
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : " +  gp.adelanta(cs[0], cs[1]) + " ok adelanta ");
		System.out.println("GP: " + gp);

		// ok adelanta
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : " + gp.adelanta(cs[1], cs[2]) + " ok adelanta ");
		System.out.println("GP: " + gp);
		
		// ok finCarrera
		nPrueba++;
		long tvuelta = 95000;
		Random r = new Random();
		for (int i = 0; i < cs.length; i++) {
			tvuelta += (long)(r.nextDouble()*100);
			gp.finCarrera (cs[i], tvuelta); 
		}
		System.out.println("Prueba " + nPrueba + " : ok finCarrera");
		System.out.println("GP: " + gp);
*/
		
		
		
		
		GranPremio gp2 = new GranPremio ("Barcelona", 15);
		int nPrueba = 0;
				
		
     	// ok addCorredor
		nPrueba++;
		boolean res = true;
		for (int i = 0; i < cs.length; i++) {
			if (!gp2.addCorredor (cs[i]))
				res = false;
		}
		System.out.println("Prueba " + nPrueba + " : " + res + " ok add corredor 15 veces");
		System.out.println("GP: " + gp2);
		
		// ok vuelta
		nPrueba++;
		for (int n = 0; n < 20; n++) {
			long tvuelta1 = 95000;
			Random r1 = new Random();
			for (int i = 0; i < cs.length; i++) {
				tvuelta1 += (long)(r1.nextDouble()*100);
				gp2.vuelta (cs[i], tvuelta1); 
			}
		}
		System.out.println("Prueba " + nPrueba + " : ok 20 vueltas todos");
		System.out.println("GP: " + gp2);
	
		// ok finCarrera
		nPrueba++;
		long tvuelta1 = 95000;
		Random r1 = new Random();
		for (int i = 0; i < cs.length; i++) {
			tvuelta1 += (long)(r1.nextDouble()*100);
			gp2.finCarrera (cs[i], tvuelta1); 
		}
		System.out.println("Prueba " + nPrueba + " : ok finCarrera");
		System.out.println("GP: " + gp2);

		// ok SelectorTrue
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : ok selectorTrue");
		Selector s = new SelectorTrue();
		System.out.println(Arrays.toString(((GranPremio) gp2).getCorredores(s)));
	

		
		// ok SelectorPais
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : ok selectorPais ES");
		s = new SelectorPais("ES");
		System.out.println(Arrays.toString(gp2.getCorredores(s)));

		// ok SelectorEscuderia
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : ok selectorEscuderia Red Bull");
		System.out.println(Arrays.toString(gp2.getCorredores(new SelectorEscuderia("Red Bull"))));
	
		// ok SelectorPodio
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : ok selectorPodio");
		System.out.println(Arrays.toString(gp2.getCorredores(new SelectorPodio())));
		
		// ok Selector10Primeros
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : ok selector10Primeros");
		System.out.println(Arrays.toString(gp2.getCorredores(new Selector10Primeros())));

		// ok SelectorTiempoVuelta (95500)
		nPrueba++;
		System.out.println("Prueba " + nPrueba + " : ok selectorTiempoVuelta 95500");
		System.out.println(Arrays.toString(gp2.getCorredores(new SelectorTiempoVuelta(95500))));
	}}/*
		
	}
}
*/