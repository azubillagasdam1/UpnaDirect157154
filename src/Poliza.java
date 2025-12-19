/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ordenador Aitor
 */
public class Poliza {
      private Aseguradora aseguradoraResultado;
      
       public Poliza(Cliente cliente, Bien bien){
        int menorPrima = Integer.MAX_VALUE; //Nos da el numero mas grande posible
        
        Aseguradora[] aseguradoras = new Aseguradora[3];
        
        aseguradoras[0] = new Mafro(bien,cliente);
        aseguradoras[1] = new LineaIndirecta(bien,cliente);
        aseguradoras[2] = new Adasles(bien,cliente);
        
        for(int i = 0; i < 3; i++){
            if(aseguradoras[i].prima()< menorPrima ){
                menorPrima = aseguradoras[i].prima();
                aseguradoraResultado = aseguradoras[i];
            }
            else if(aseguradoras[i].prima() == menorPrima){
                if(comision(aseguradoras[i]) > comision(aseguradoraResultado)){
                    menorPrima = aseguradoras[i].prima();
                    aseguradoraResultado = aseguradoras[i];
                }
            }
        }
    }
        private int comision(Aseguradora a){
        if(a.prima() < 1000){
            return (int)(a.prima() * 0.01);
        } else if(a.nombre().equals("Mafro")){
            return (int)(a.prima() * 0.03);
        }else if(a.nombre().equals(("Linea Indirecta"))){
            return (int)(a.prima() * 0.04);
        }else {
        return (int)(a.prima() * 0.05);
        }
    }
    
    public String mostrarPoliza(){
        return  aseguradoraResultado.nombre().toUpperCase() + " | " + aseguradoraResultado.prima() + " | " + comision(aseguradoraResultado);
    }
}

