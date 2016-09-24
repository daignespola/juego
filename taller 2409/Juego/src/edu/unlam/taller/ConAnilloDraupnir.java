package edu.unlam.taller;

public class ConAnilloDraupnir extends PersonajeEquipado{
	@Override
	protected int calcularPuntosDeAtaque() {
		return 1;
	}

	@Override
	protected boolean puedeAtacar() {
		return energia >= 10;
	}
}
