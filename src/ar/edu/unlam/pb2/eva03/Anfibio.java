package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico{

	private Double velocidad;
	private Double profundidad;
	public Anfibio(Integer codigo, String modelo) {
		super(codigo.toString(), modelo);
		this.velocidad = 0.0;
		this.profundidad = 0.0;
		this.setTiposBatallas(TipoDeBatalla.NAVAL);
		this.setTiposBatallas(TipoDeBatalla.TERRESTRE);
	}

	public Anfibio(String codigo, String modelo) {
		super(codigo, modelo);
		this.velocidad = 0.0;
		this.profundidad = 0.0;	
		this.setTiposBatallas(TipoDeBatalla.NAVAL);
		this.setTiposBatallas(TipoDeBatalla.TERRESTRE);
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public Double getProfundidad() {
		return profundidad;
	}

}
