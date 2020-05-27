package queMePongo.entity.model;

import java.util.List;

public class Sugerencia {
	List<Prenda> sugerencia;

	public Sugerencia(List<Prenda> sugerencia) {
		this.sugerencia = sugerencia;
	}

	public List<Prenda> getSugerencia() {
		return sugerencia;
	}

	public void setSugerencia(List<Prenda> sugerencia) {
		this.sugerencia = sugerencia;
	}

}
