/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upnadirect157154;

/**
 *
 * @author Ordenador Aitor
 */
public final class UpnaDirect157154 {

    private UpnaDirect157154() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando Programa...");
        Presentador presentador = new Presentador(new VistaConsola());
        presentador.crearPoliza();
        presentador.mostrarPoliza();
        System.out.println("Cerrando Programa...");
    }
    
}