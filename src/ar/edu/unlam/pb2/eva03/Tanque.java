package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.Interfaces.*;

public class Tanque extends Vehiculo implements Terrestre {

	private Double velocidad;

	public Tanque(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.velocidad = 0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}
	
	
}
