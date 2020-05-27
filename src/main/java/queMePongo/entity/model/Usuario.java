package queMePongo.entity.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	String username;
	String password;

	List<Prenda> guardarropa;

	public Usuario() {
		this.guardarropa = new ArrayList<Prenda>();
	}

	public void guardarEnGuardarropa(Prenda prenda) {
		guardarropa.add(prenda);
	}
	
	public List<Prenda> getGuardarropa() {
		return this.guardarropa;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
