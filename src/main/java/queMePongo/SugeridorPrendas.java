package queMePongo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import queMePongo.entity.model.Guardarropa;
import queMePongo.entity.model.Prenda;
import queMePongo.entity.model.Sugerencia;
import queMePongo.entity.model.Usuario;
import queMePongo.interfaces.IGeneradorSugerencias;
import queMePongo.interfaces.IServicioClima;

public class SugeridorPrendas {
	private IServicioClima apiClima;
	private IGeneradorSugerencias generadorSugerencias;

	public SugeridorPrendas(Usuario currentUser, IServicioClima apiClima, IGeneradorSugerencias generadorSugerencias ) {
		this.apiClima = apiClima;
		this.generadorSugerencias = generadorSugerencias;
	}
	
	public Map<String, Object> obtenerCondicionesClimaticas(String city, String country) {
		return this.apiClima.getWeather(city, country).get(0);
	}
	
	public List<Sugerencia> generarSugerencias(String city, String country, Guardarropa guardarropa) {
		List<Prenda> prendasAptas = this.getPrendasAptas(city, country, guardarropa);
		return this.generadorSugerencias.generarSugerenciasDesde(prendasAptas);
	}
	
	private List<Prenda> getPrendasAptas(String city, String country, Guardarropa guardarropa) {
		return guardarropa.getPrendas()
				.stream()
				.filter(prenda -> prenda.getTipo().getTemperaturaMax() <= this.apiClima.getTemperaturaActual(city, country))
				.collect(Collectors.toList());
	}
}
