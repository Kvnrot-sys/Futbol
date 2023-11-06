package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;
import java.util.Objects;

public class Jugador implements Comparable{
	
	private Integer id;
	private String nombre;
	private Integer precio;
	

	public Jugador(Integer id, String nombre, Integer precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}


	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getPrecio() {
		return precio;
	}


	public void setPrecio(Integer precio) {
		this.precio = precio;
	}





	@Override
	public int compareTo(Object o) {
		
		return this.nombre.compareTo(((Jugador) o).getNombre());
	}





	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(nombre, other.nombre);
	}






	




	




	
	
	
	
	
	
	
	


}
