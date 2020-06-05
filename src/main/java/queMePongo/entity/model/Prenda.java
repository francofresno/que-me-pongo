package queMePongo.entity.model;

import queMePongo.constants.CategoriaPrenda;
import queMePongo.constants.Color;
import queMePongo.constants.MaterialPrenda;
import queMePongo.constants.TipoPrenda;

public class Prenda {

	private TipoPrenda tipo;
	private CategoriaPrenda categoria;
	private MaterialPrenda material;
	private Color primColor;
	private Color secColor;

	public TipoPrenda getTipo() {
		return tipo;
	}

	public void setTipo(TipoPrenda tipo) {
		this.tipo = tipo;
	}

	public CategoriaPrenda getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaPrenda categoria) {
		this.categoria = categoria;
	}

	public MaterialPrenda getMaterial() {
		return material;
	}

	public void setMaterial(MaterialPrenda material) {
		this.material = material;
	}

	public Color getPrimColor() {
		return primColor;
	}

	public void setPrimColor(Color primColor) {
		this.primColor = primColor;
	}

	public Color getSecColor() {
		return secColor;
	}

	public void setSecColor(Color secColor) {
		this.secColor = secColor;
	}

	public boolean hasTipo() {
		return tipo != null;
	}

	public boolean hasCategoria() {
		return categoria != null;
	}

	public boolean hasMaterial() {
		return material != null;
	}

	public boolean hasPrimColor() {
		return primColor != null;
	}

	@Override
	public boolean equals(Object o) {

		if (o == this) {
			return true;
		}

		if (!(o instanceof Prenda)) {
			return false;
		}

		Prenda prendaObj = (Prenda) o;
		
		return this.tipo.equals(prendaObj.getTipo()) 
				&& this.categoria.equals(prendaObj.getCategoria()) 
				&& this.material.equals(prendaObj.getMaterial())
				&& this.primColor.equals(prendaObj.getPrimColor())
				&& this.secColor.equals(prendaObj.getSecColor());
	}
	
}
