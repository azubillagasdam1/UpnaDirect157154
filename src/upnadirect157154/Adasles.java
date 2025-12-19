package upnadirect157154;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ordenador Aitor
 */
public class Adasles implements Aseguradora{
   private int prima;
    
    
    public Adasles(Bien b, Cliente c){
        
        if (b.getTipo() == Bien.TIPO_VEHICULO && (c.esJoven()|| c.esMayor())) {
            
            prima = (int)(b.getValor() * 0.06);
        }
        else {
            prima = (int)(b.getValor() * 0.02);
        }
    }
    
     @Override
    public int prima(){
        return prima;
    } 
    
    @Override
    public String nombre(){
        return "Adasles";
    }
}
