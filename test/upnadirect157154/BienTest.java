/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect157154;
/**
 *
 * @author Ordenador Aitor
 */

import org.junit.Test;
import static org.junit.Assert.*;
public class BienTest {

    @Test
    public void testCrearVehiculo() {
    
        Bien coche = new Bien(20000, Bien.TIPO_VEHICULO);
        
        assertEquals(Bien.TIPO_VEHICULO, coche.getTipo());
        assertEquals(20000, coche.getValor());
    }


    @Test
    public void testCrearVivienda() {

        Bien casa = new Bien(150000, Bien.TIPO_VIVIENDA);
         
       assertEquals(Bien.TIPO_VIVIENDA, casa.getTipo());
        assertEquals(150000, casa.getValor());
    }
}
