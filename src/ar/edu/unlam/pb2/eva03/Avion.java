package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {

	private Double altura;
	public Avion(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.altura = 0.0;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return this.altura;
	}

}
