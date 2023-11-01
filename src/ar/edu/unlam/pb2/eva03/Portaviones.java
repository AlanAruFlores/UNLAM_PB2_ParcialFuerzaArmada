package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Portaviones extends Vehiculo implements Acuatico{
	private Double profundidad;

	public Portaviones(Integer codigo, String modelo) {
		super(codigo.toString(), modelo);
		this.profundidad = 0.0;
		this.setTiposBatallas(TipoDeBatalla.NAVAL);
	}

	public Portaviones(String codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad = 0.0;
		this.setTiposBatallas(TipoDeBatalla.NAVAL);


	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}
}
