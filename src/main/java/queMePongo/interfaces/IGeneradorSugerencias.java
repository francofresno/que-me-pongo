package queMePongo.interfaces;

import java.util.List;

import queMePongo.entity.model.Prenda;
import queMePongo.entity.model.Sugerencia;

public interface IGeneradorSugerencias {
	
	public List<Sugerencia> generarSugerenciasDesde(List<Prenda> prendasAptas);

}
