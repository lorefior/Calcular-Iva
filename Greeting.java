package com.calculo.Iva;

public class Greeting {
	private float producto;
	private float iva;
	private float Vfinal;

	public float getProducto() {
		return producto;
	}

	public void setProducto(float producto) {
		this.producto = producto;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}
	
	public float getVfinal() {
		return Vfinal;
	}

	public void setVfinal(float vfinal) {
		Vfinal = vfinal;
	}
	public void IvaProducto(float producto) {
		this.iva = ((producto * 21) / 100);
	}
	

	public void ValorFinal(float sueldo) {
		this.Vfinal = (iva + producto);
	}

}