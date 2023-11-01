package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Submarino extends Vehiculo implements Acuatico {

	private Double profundidad;
	public Submarino(Integer codigo, String modelo) {
		super(codigo.toString(), modelo);
		this.profundidad = 0.0;
		this.setTiposBatallas(TipoDeBatalla.NAVAL);
	}

	public Submarino(String codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad = 0.0;
		this.setTiposBatallas(TipoDeBatalla.NAVAL);

	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

}
