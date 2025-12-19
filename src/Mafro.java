/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ordenador Aitor
 */
public class Mafro implements Aseguradora{

    int prima;
    
     public Mafro(Bien b, Cliente c){
        if(b.getTipo() == Bien.TIPO_VEHICULO && c.esJoven()){
            prima = (int)(b.getValor() * 0.05);
        }
        else if(b.getTipo() == Bien.TIPO_VIVIENDA && b.getValor()> 200000 && c.getSalario() < 20000){
            prima = (int)(b.getValor()* 0.02);
        }
        else{
            prima = (int)(b.getValor()* 0.03);
        }
    }
    
    
    @Override
    public int prima() {
        return this.prima;
    }

    @Override
    public String nombre() {
       return "Mafro";
    }
    
}
