package edu.unlam.taller;
 
import org.junit.Assert;
import org.junit.Test;
 
public class ItemTests {
    /*
     * Especificación de Items
     * ~~~~~~~~~~~~~~~~~~~~~~~
     * ConEspadaSkofnung: Esta espada aumenta en 5 pts el ataque
     * ConEscudoSvalinn: Este escudo otorga 10 pts de defensa
     * ConAnilloDraupnir: Este anillo multiplica el ataque x2
     */
   
    @Test
    public void quePuedoAgregarItemDeAtaque() {
 
        Personaje sigmund = new Humano();
        Assert.assertEquals(1, sigmund.calcularPuntosDeAtaque());
 
        // agrego item de ataque
        sigmund = new ConEspadaSkofnung(sigmund);
        System.out.println(sigmund.calcularPuntosDeAtaque());
        Assert.assertEquals(5 + 1, sigmund.calcularPuntosDeAtaque());
    }
 
    /*
    @Test
    public void quePuedoAgregarAmbosItems() {
 
        Personaje sigmund = new Humano();
        Assert.assertEquals(1, sigmund.calcularPuntosDeAtaque());
 
        // agrego item de ataque
        sigmund = new ConEspadaSkofnung(sigmund);
        Assert.assertEquals(5 + 1, sigmund.calcularPuntosDeAtaque());
 
        Assert.assertEquals(0, sigmund.calcularPuntosDeAtaque());
        sigmund = new ConEscudoSvalinn(sigmund);
        // agrego defensa
        Assert.assertEquals(10 + 0, sigmund.calcularPuntosDeAtaque());
        // y no pierdo ataque
        Assert.assertEquals(5 + 1, sigmund.calcularPuntosDeAtaque());
    }
    */
 
    /*
    @Test
    public void quePuedoAgregarDosTiposDeItem() {
        Personaje sigmund = new Humano();
        Assert.assertEquals(1, sigmund.obtenerPuntosDeAtaque());
 
        // agrego item de ataque
        sigmund = new ConEspadaSkofnung(sigmund);
        Assert.assertEquals(5 + 1, sigmund.obtenerPuntosDeAtaque());
 
        // agrego anillo multiplicador (x2)
        sigmund = new ConAnilloDraupnir(sigmund);
        Assert.assertEquals((5 + 1) * 2, sigmund.obtenerPuntosDeAtaque());
    }
    */
}