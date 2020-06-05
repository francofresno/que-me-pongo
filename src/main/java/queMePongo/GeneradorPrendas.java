package queMePongo;

import queMePongo.entity.model.Guardarropa;
import queMePongo.entity.model.Prenda;
import queMePongo.entity.model.Usuario;
import queMePongo.exceptions.InvalidPrendaException;

public class GeneradorPrendas {

	public void guardarNuevaPrenda(Prenda prenda, Guardarropa guardarropa) throws InvalidPrendaException {
		validarPrenda(prenda);
		guardarropa.guardarEnGuardarropa(prenda);
	}

	private void validarPrenda(Prenda prenda) throws InvalidPrendaException {
		if (!prenda.hasTipo()) {
			throw new InvalidPrendaException("La prenda no tiene un tipo declarado");
		}

		if (!prenda.hasCategoria()) {
			throw new InvalidPrendaException("La prenda no tiene una categoria declarada");
		}

		if (!prenda.hasMaterial()) {
			throw new InvalidPrendaException("La prenda no tiene un material declarado");
		}

		if (!prenda.hasPrimColor()) {
			throw new InvalidPrendaException("La prenda no tiene un color primario declarado");
		}
		
		if (prenda.getCategoria() != prenda.getTipo().getCategoria()) {
			throw new InvalidPrendaException("La categoria de la prenda no se consigue con su tipo");
		}
	}

}
