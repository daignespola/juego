package edu.unlam.taller;

public class ConEspadaSkofnung extends PersonajeEquipado{
	int ataquebase; 
	
	public ConEspadaSkofnung(Personaje sigmund){
		energia = sigmund.getEnergia();
		salud = sigmund.getSalud();
		ataquebase = sigmund.calcularPuntosDeAtaque();
	}

	@Override
	protected int obtenerPuntosDeAtaque() {
		return ataquebase+5;
	}
	
	@Override
	protected boolean puedeAtacar() {
		return true;
	}

	@Override
	protected int calcularPuntosDeAtaque() {
		// TODO Auto-generated method stub
		return 0;
	}
}
