package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Destructor extends Vehiculo implements Acuatico{

	private Double profundidad;
	public Destructor(Integer codigo, String modelo) {
		super(codigo.toString(), modelo);
		this.setTiposBatallas(TipoDeBatalla.NAVAL);
	}
	public Destructor(String codigo, String modelo) {
		super(codigo, modelo);
		this.setTiposBatallas(TipoDeBatalla.NAVAL);

	}
	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

}
