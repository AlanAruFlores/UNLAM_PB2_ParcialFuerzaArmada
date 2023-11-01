package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Vehiculo {
	private Integer codigo;
	private String modelo;
	private List<TipoDeBatalla> tipo;
	public Vehiculo(String codigo, String modelo) {
		super();

		this.codigo  = Integer.parseInt(codigo);
		this.modelo = modelo;
		this.tipo = new ArrayList<TipoDeBatalla>();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setTiposBatallas(TipoDeBatalla tipo) {
		this.tipo.add(tipo);
	}
	
	public List<TipoDeBatalla> getTiposDeBatalla(){
		return this.tipo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
	
	
}
