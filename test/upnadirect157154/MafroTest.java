/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect157154;

/**
 *
 * @author Ordenador Aitor
 */

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class MafroTest {
    
    int anhoActual = LocalDate.now().getYear();

    /**
     * Vehiculo y joven, 5%
     * Valor 10.000€ -> Prima esperada: 500€
     */
    @Test
    public void testVehiculoJoven() {
        Bien coche = new Bien(10000, Bien.TIPO_VEHICULO);
        Cliente joven = new Cliente(anhoActual - 19, 10000); // 19 años
        
        Mafro seguro = new Mafro(coche, joven);
        
        assertEquals(500, seguro.prima());
    }

    /**
     * Vehiculo y adulto,
     * Valor 10.000€ -> Prima esperada: 300€
     */
    @Test
    public void testEstandar() {
        Bien coche = new Bien(10000, Bien.TIPO_VEHICULO);
        Cliente adulto = new Cliente(anhoActual - 40, 20000); // 40 años
        
        Mafro seguro = new Mafro(coche, adulto);
        
        assertEquals(300, seguro.prima());
    }
}
