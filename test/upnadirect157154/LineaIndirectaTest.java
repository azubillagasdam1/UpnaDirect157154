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

public class LineaIndirectaTest {
    
    int anhoActual = LocalDate.now().getYear();

    /**
     * Vehiculo de menos de 20000€, 4%
     * Valor 10.000€ -> Prima esperada: 400€
     */
    @Test
    public void testVehiculoBarato() {
        Bien coche = new Bien(10000, Bien.TIPO_VEHICULO);
        Cliente cliente = new Cliente(anhoActual - 40, 20000);
        
        LineaIndirecta seguro = new LineaIndirecta(coche, cliente);
        
        assertEquals(400, seguro.prima());
    }

    /**
     * Vehiculo de mas de 20000€ y persona mayor, 6%
     * Valor 30.000€ -> Prima esperada: 1.800€
     */
    @Test
    public void testVehiculoCaroMayor() {
        Bien coche = new Bien(30000, Bien.TIPO_VEHICULO);
        Cliente mayor = new Cliente(anhoActual - 70, 20000); // 70 años
        
        LineaIndirecta seguro = new LineaIndirecta(coche, mayor);
        
        assertEquals(1800, seguro.prima());
    }
    
    /**
     * Vivienda de mas de 150000€, 6%
     * Valor 200.000€ -> Prima esperada: 6.000€
     */
    @Test
    public void testViviendaCara() {
        Bien casa = new Bien(200000, Bien.TIPO_VIVIENDA);
        Cliente cliente = new Cliente(anhoActual - 40, 20000);
        
        LineaIndirecta seguro = new LineaIndirecta(casa, cliente);
        
        assertEquals(6000, seguro.prima());
    }
}

