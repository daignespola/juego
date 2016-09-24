package edu.unlam.taller;

public abstract class PersonajeEquipado extends Personaje{
	
	
	@Override
	protected abstract int obtenerPuntosDeAtaque();

	@Override
	protected abstract boolean puedeAtacar();
}
