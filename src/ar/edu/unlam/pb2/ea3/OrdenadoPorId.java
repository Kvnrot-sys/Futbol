package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class OrdenadoPorId implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {

		 if(o1.getId() > o2.getId()){
	            return 1;
	        } else {
	            return -1;
	        }
	}

}