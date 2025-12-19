package upnadirect157154;


/**
 *
 * @author Ordenador Aitor
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Cliente
 */
public class ClienteTest {

    @Test
    public void clienteJovenEsJoven() {
        Cliente cliente = new Cliente(2010, 0);
        assertTrue(cliente.esJoven());
    }


    @Test
    public void clienteJovenNoEsMayor() {
        Cliente cliente = new Cliente(2010, 0);
        assertFalse(cliente.esMayor());
    }

   
    @Test
    public void clienteMayorEsMayor() {
        Cliente cliente = new Cliente(1950, 0);
        assertTrue(cliente.esMayor());
    }
    
 
    @Test
    public void clienteMayorNoEsJoven() {
        Cliente cliente = new Cliente(1950, 0);
        assertFalse(cliente.esJoven());
    }
    
    
    @Test
    public void salarioCliente() {
        Cliente cliente = new Cliente(0, 2000);
        assertTrue(cliente.getSalario() == 2000);
    }
    
}