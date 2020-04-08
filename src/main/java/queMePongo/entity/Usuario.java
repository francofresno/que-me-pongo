package queMePongo.entity;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	List<Prenda> guardarropa;

	public Usuario() {
		this.guardarropa = new ArrayList<Prenda>();
	}

	public void guardarEnGuardarropa(Prenda prenda) {
		guardarropa.add(prenda);
	}

}
