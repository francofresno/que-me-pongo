package queMePongo.constants;

public enum TipoPrenda {
	
	PANUELO(CategoriaPrenda.ACCESORIOS),
	ANTEOJOS_SOL(CategoriaPrenda.ACCESORIOS),
	REMERA(CategoriaPrenda.PARTE_SUPERIOR),
	CAMISA(CategoriaPrenda.PARTE_SUPERIOR),
	MUSCULOZA(CategoriaPrenda.PARTE_SUPERIOR),
	PANTALON(CategoriaPrenda.PARTE_INFERIOR),
	POLLERA(CategoriaPrenda.PARTE_INFERIOR),
	ZAPATOS(CategoriaPrenda.CALZADO),
	ZAPATILLAS(CategoriaPrenda.CALZADO),
	BOTAS(CategoriaPrenda.CALZADO),
	CROCS(CategoriaPrenda.CALZADO);

	private CategoriaPrenda categoria;
	
	TipoPrenda(CategoriaPrenda categoria) {
		this.categoria = categoria;
	}
	public CategoriaPrenda getCategoria() {
		return categoria;
	}
	
}
