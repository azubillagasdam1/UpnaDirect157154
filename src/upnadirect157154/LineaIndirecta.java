package upnadirect157154;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ordenador Aitor
 */
public class LineaIndirecta implements Aseguradora{
   private  int prima;
    
  public LineaIndirecta(Bien b, Cliente c){
       
        if ( (b.getTipo() == Bien.TIPO_VEHICULO && b.getValor() < 20000) || 
             (b.getTipo() == Bien.TIPO_VIVIENDA && b.getValor() < 150000) ) {
            
            prima = (int)(b.getValor() * 0.04);
        } 
        else if (b.getTipo() == Bien.TIPO_VEHICULO && b.getValor() >= 20000 && c.esMayor()) {
            
            prima = (int)(b.getValor() * 0.06);
        }
        else {
            prima = (int)(b.getValor() * 0.03);
        }
    }
    
    @Override
    public int prima(){
        return prima;
    } 
    
    @Override
    public String nombre(){
        return "Linea Indirecta";
    }
}
