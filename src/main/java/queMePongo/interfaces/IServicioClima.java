package queMePongo.interfaces;

import java.util.List;
import java.util.Map;

public interface IServicioClima {
	public List<Map<String, Object>> getWeather(String city, String country);
	public Double getTemperaturaActual(String city, String country);
}
