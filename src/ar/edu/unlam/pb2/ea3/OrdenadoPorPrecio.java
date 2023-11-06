package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class OrdenadoPorPrecio implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {

		 if(o1.getPrecio() > o2.getPrecio()){
	            return 1;
	        } else {
	            return -1;
	        }
	}

}
