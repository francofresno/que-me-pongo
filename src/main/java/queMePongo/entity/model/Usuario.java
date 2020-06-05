package queMePongo.entity.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Usuario {

	List<Guardarropa> guardarropas;
	Prenda borrador;

	public Usuario() {
		this.guardarropas = new ArrayList<Guardarropa>();
	}

	public void guardarBorrador(Prenda prenda) {
		this.borrador = prenda;
	}
	
	public Optional<Guardarropa> buscarGuardarropa(String criterio) {
		return this.guardarropas.stream().filter(guardarropa -> guardarropa.getCriterio() == criterio).findAny();
	}

}
