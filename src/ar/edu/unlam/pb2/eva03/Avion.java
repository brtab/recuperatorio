package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.Interfaces.Vehiculo;
import ar.edu.unlam.pb2.eva03.Interfaces.Volador;

public class Avion extends Vehiculo implements Volador {

	private Double altura;

	public Avion(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.altura = 0.0;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}
}
