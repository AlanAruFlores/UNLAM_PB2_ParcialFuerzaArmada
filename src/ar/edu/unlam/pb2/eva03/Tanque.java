package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Tanque extends Vehiculo implements Terrestre {
	private Double velocidad;
	
	public Tanque(Integer codigo, String modelo) {
		super(codigo.toString(), modelo);
		this.velocidad = 0.0;
		this.setTiposBatallas(TipoDeBatalla.TERRESTRE);
	}

	public Tanque(String codigo, String modelo) {
		super(codigo, modelo);
		this.velocidad = 0.0;
		this.setTiposBatallas(TipoDeBatalla.TERRESTRE);

	}

	@Override
	public Double getVelocidad() {
		return velocidad;
	}

}
