package queMePongo.constants;

public enum TipoPrenda {
	
	PANUELO(CategoriaPrenda.ACCESORIOS, 50),
	ANTEOJOS_SOL(CategoriaPrenda.ACCESORIOS, 50),
	REMERA(CategoriaPrenda.PARTE_SUPERIOR, 50),
	CAMISA(CategoriaPrenda.PARTE_SUPERIOR, 50),
	MUSCULOZA(CategoriaPrenda.PARTE_SUPERIOR, 50),
	PANTALON(CategoriaPrenda.PARTE_INFERIOR, 50),
	POLLERA(CategoriaPrenda.PARTE_INFERIOR, 50),
	ZAPATOS(CategoriaPrenda.CALZADO, 50),
	ZAPATILLAS(CategoriaPrenda.CALZADO, 50),
	BOTAS(CategoriaPrenda.CALZADO, 50),
	CROCS(CategoriaPrenda.CALZADO, 50);

	private CategoriaPrenda categoria;
	private Integer temperaturaMax;
	
	TipoPrenda(CategoriaPrenda categoria, Integer temperaturaMax) {
		this.categoria = categoria;
		this.temperaturaMax = temperaturaMax;
	}
	public CategoriaPrenda getCategoria() {
		return categoria;
	}
	public Integer getTemperaturaMax() {
		return temperaturaMax;
	}
	
}
