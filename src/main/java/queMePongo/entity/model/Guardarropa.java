package queMePongo.entity.model;

import java.util.List;

public class Guardarropa {
	List<Prenda> prendas;
	List<Usuario> compartidos;

	public List<Prenda> getPrendas() {
		return prendas;
	}

	public void setPrendas(List<Prenda> prendas) {
		this.prendas = prendas;
	}
	
	public void compartirCon(Usuario usuario) {
		this.compartidos.add(usuario);
	}
	
}
