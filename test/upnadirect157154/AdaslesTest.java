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

public class AdaslesTest {
    
    // Auxiliar para calcular años dinámicamente
    int anhoActual = LocalDate.now().getYear();

    /**
     * Vehiculo y joven, debe cobrar 6%
     * Valor 10.000€ -> Prima esperada: 600€
     */
    @Test
    public void testVehiculoJoven() {
        Bien coche = new Bien(10000, Bien.TIPO_VEHICULO);
        Cliente joven = new Cliente(anhoActual - 18, 10000); // 18 años
        
        Adasles seguro = new Adasles(coche, joven);
        
        assertEquals(600, seguro.prima());
    }

    /**
     * Vivienda, debe cobrar 2%
     * Valor 100.000€ -> Prima esperada: 2.000€
     */
    @Test
    public void testViviendaCualquiera() {
        Bien casa = new Bien(100000, Bien.TIPO_VIVIENDA);
        Cliente adulto = new Cliente(anhoActual - 40, 20000);
        
        Adasles seguro = new Adasles(casa, adulto);
        
        assertEquals(2000, seguro.prima());
    }
}