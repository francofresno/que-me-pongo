package queMePongo.apis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import queMePongo.interfaces.IServicioClima;

// Esta clase tiene la lógica que permite el consumo de la API
public class AccuWeatherAPI implements IServicioClima {
	
	public List<Map<String, Object>> getWeather(String city, String country) {
		return new ArrayList<Map<String, Object>>();
	}
	
	public Double getTemperaturaActual(String city, String country) {
		return (Double) this.getWeather(city, country).get(0).get("Temperature");
	}
	
	// Some awesome logic :D
}
