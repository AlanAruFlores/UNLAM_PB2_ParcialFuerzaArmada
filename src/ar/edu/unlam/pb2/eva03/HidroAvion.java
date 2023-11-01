package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class HidroAvion extends Avion implements Acuatico{

	private Double profundidad;
	
	public HidroAvion(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad = 0.0;
		this.setTiposBatallas(TipoDeBatalla.NAVAL);
		this.setTiposBatallas(TipoDeBatalla.AIRE);
	}

	public HidroAvion(String codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad = 0.0;
		this.setTiposBatallas(TipoDeBatalla.NAVAL);
		this.setTiposBatallas(TipoDeBatalla.AIRE);
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

}
