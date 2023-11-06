package ar.edu.unlam.pb2.ea3;

import static org.junit.Assert.assertThrows;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol {
	private String nombre;
	private TreeSet<Jugador> jugadores = new TreeSet<Jugador>();

	final Integer CANTIDAD_DE_JUGADORES = 23;

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;

	}

	/*
	 * La capacidad m�xima de un equipo es 23. Cualquier intento de agregar m�s
	 * jugadores generar� una excepci�n (CapacidadMaximaException). Adem�s, no
	 * deber� permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	public void agregarJugador(Jugador jugador) throws CapacidadMaximaException, JugadorDuplicadoException {

		if (!this.jugadores.contains(jugador)) {
			this.jugadores.add(jugador);
		} else {
			throw new JugadorDuplicadoException();
		}

		if (this.jugadores.size() > CANTIDAD_DE_JUGADORES) {
			throw new CapacidadMaximaException();
		}

	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generar� una excepci�n (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante)
			throws JugadoreInexistenteException, CapacidadMaximaException, JugadorDuplicadoException {

		Boolean cambiado = false;
		if (this.jugadores.contains(saliente)) {
			this.jugadores.remove(saliente);
			agregarJugador(entrante);
			cambiado = true;
		} else {
			throw new JugadoreInexistenteException();
		}
		return cambiado;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {

		return null;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {

		TreeSet<Jugador> jugadoresOrdenadosPorPrecio = new TreeSet<Jugador>(new OrdenadoPorPrecio());

		jugadoresOrdenadosPorPrecio.addAll(jugadores);

		return jugadoresOrdenadosPorPrecio;

	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		TreeSet<Jugador> jugadoresOrdenadosPorId = new TreeSet<Jugador>(new OrdenadoPorId());

		jugadoresOrdenadosPorId.addAll(jugadores);

		return jugadoresOrdenadosPorId;
	}

	public TreeSet<Jugador> getJugadores() {

		return this.jugadores;

	}

}
