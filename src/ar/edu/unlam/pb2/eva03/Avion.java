package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Avion extends Vehiculo implements Volador {

	private Double altura;
	public Avion(Integer codigo, String modelo) {
		super(codigo.toString(), modelo);
		this.altura = 0.0;
		setTiposBatallas(TipoDeBatalla.AIRE);
	}

	public Avion(String codigo, String modelo) {
		super(codigo, modelo);
		this.altura = 0.0;
		setTiposBatallas(TipoDeBatalla.AIRE);

	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return this.altura;
	}

}
