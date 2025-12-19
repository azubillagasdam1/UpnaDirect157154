package upnadirect157154;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ordenador Aitor
 */
public class Presentador {
    private VistaConsola vista;
    private Poliza poliza;
    
    
    public Presentador(VistaConsola v){
        vista = v;
    }
    
    public void crearPoliza(){
        
      Cliente cliente = vista.introducirCliente();
      Bien bien = vista.introducirBien();
      poliza  = vista.instanciarPoliza(bien, cliente);

    }
    
    public void mostrarPoliza(){
        vista.imprimirPoliza(poliza);
    }
    
    
}

