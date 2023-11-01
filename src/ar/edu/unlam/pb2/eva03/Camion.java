package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Camion extends Vehiculo implements Terrestre {


	private Double velocidad;

	public Camion(Integer codigo, String modelo) {
		super(codigo.toString(), modelo);
		this.velocidad = 0.0;
		setTiposBatallas(TipoDeBatalla.TERRESTRE);
	}
	
	public Camion(String codigo, String modelo) {
		super(codigo, modelo);
		this.velocidad = 0.0;
		setTiposBatallas(TipoDeBatalla.TERRESTRE);

	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

}
