package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		convoy = new HashSet<Vehiculo>();
		batallas = new HashMap<String, Batalla>();
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		convoy.add(vehiculo);
	}
	
	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		batallas.put(nombre, new Batalla(latitud, longitud, tipo));
	}

	public Batalla getBatalla(String nombre) throws BatallaInexistente {
		if(this.batallas.get(nombre) == null)
			throw new BatallaInexistente();
		
		return this.batallas.get(nombre);
	}

	public void presentarBatalla() {
		// TODO Auto-generated method stub	
	}

	public Boolean enviarALaBatalla(String nombreBatalla, Integer nroVehiculo) throws VehiculoInexistente, BatallaInexistente, VehiculoIncompatible {
		Vehiculo v = buscarVehiculoPorNro(nroVehiculo);
		Batalla b = getBatalla(nombreBatalla);
		esCompatible(v, b);
		
		b.setVehiculoEnLaBatalla(v);
		return true;
	} 
	private Boolean esCompatible(Vehiculo v, Batalla b) throws VehiculoIncompatible {
		List<TipoDeBatalla> tiposDeVehiculo = v.getTiposDeBatalla();
		for(TipoDeBatalla tV: tiposDeVehiculo) {
			if(tV == b.getTipo())
				return true;
		}
		throw new VehiculoIncompatible();
	}
	
	public Vehiculo buscarVehiculoPorNro(Integer nroVehiculo) throws VehiculoInexistente {
		for(Vehiculo v : this.convoy) {
			if(v.getCodigo() == nroVehiculo)
				return v;
		}
		
		throw new VehiculoInexistente();
	}

}
