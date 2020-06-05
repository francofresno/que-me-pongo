package queMePongo.entity.model;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import queMePongo.interfaces.IPropuestaModificacion;

public class Guardarropa {
	List<Prenda> prendas;
	List<Usuario> compartidos;
	List<IPropuestaModificacion> propuestasModificacion;
	List<IPropuestaModificacion> propuestasAceptadas;
	String criterio;

	public void guardarEnGuardarropa(Prenda prenda) {
		this.prendas.add(prenda);
	}
	
	public void compartirCon(Usuario usuario) {
		this.compartidos.add(usuario);
	}
	
	public void proponerModificacion(IPropuestaModificacion propuesta) {
		this.propuestasModificacion.add(propuesta);
	}

	public List<IPropuestaModificacion> verPropuestasModificacion() {
		return this.propuestasModificacion;
	}
	
	public void aceptarPropuesta(IPropuestaModificacion propuesta) {
		IPropuestaModificacion propuestaModificacion = buscarPropuesta(propuesta, this.propuestasModificacion);
		propuestaModificacion.aceptarPropuesta();
		this.propuestasAceptadas.add(propuestaModificacion);
	}
	
	public void rechazarPropuesta(IPropuestaModificacion propuesta) {
		IPropuestaModificacion propuestaModificacion = buscarPropuesta(propuesta, this.propuestasModificacion);
		propuestaModificacion.rechazarPropuesta();
	}
	
	public void deshacerModificacion(IPropuestaModificacion propuesta) {
		IPropuestaModificacion propuestaAceptada= buscarPropuesta(propuesta, this.propuestasAceptadas);
		this.propuestasAceptadas.remove(propuestaAceptada);
	}
	
	private IPropuestaModificacion buscarPropuesta(IPropuestaModificacion propuesta, List<IPropuestaModificacion> propuestas) {
		Optional<IPropuestaModificacion> o = propuestas.stream().filter(propuestaModificacion -> { return propuestaModificacion.equals(propuesta); }).findAny();
		return o.orElseThrow();
	}

	public List<Prenda> getPrendas() {
		return prendas;
	}

	public void setPrendas(List<Prenda> prendas) {
		this.prendas = prendas;
	}

	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

}
