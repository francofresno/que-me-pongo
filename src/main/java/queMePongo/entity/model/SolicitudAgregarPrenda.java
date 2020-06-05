package queMePongo.entity.model;

import queMePongo.interfaces.IPropuestaModificacion;

public class SolicitudAgregarPrenda implements IPropuestaModificacion {

	Prenda prenda;
	boolean estaAceptada;

	@Override
	public boolean isAgregarPrenda() {
		return true;
	}

	@Override
	public void aceptarPropuesta() {
		this.estaAceptada = true;
	}

	@Override
	public void rechazarPropuesta() {
		this.estaAceptada = false;
	}

	@Override
	public boolean equals(Object o) {

		if (o == this) {
			return true;
		}

		if (!(o instanceof SolicitudAgregarPrenda)) {
			return false;
		}

		SolicitudAgregarPrenda solicitudObj = (SolicitudAgregarPrenda) o;

		return this.prenda.equals(solicitudObj.getPrenda());
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

}
