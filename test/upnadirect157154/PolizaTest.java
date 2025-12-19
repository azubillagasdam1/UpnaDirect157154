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

public class PolizaTest {

    @Test
    public void testCasoPracticaExamen() {
       
        Cliente cliente = new Cliente(2005, 15000);
        Bien bien = new Bien(30000, Bien.TIPO_VEHICULO);
        
        Poliza poliza = new Poliza(cliente, bien);
        
        String resultadoEsperado = "LINEA INDIRECTA | 900 | 9";
        String resultadoObtenido = poliza.mostrarPoliza();
        
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}