/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ordenador Aitor
 */
public class Bien {
    int valor;
    int tipo; // 1 para vivienda y 2 para vehiculo
    
    
     public Bien(int valor, int tipo){
        this.valor = valor;
        this.tipo = tipo;
    }
      public int valor(){
        return this.valor;
    }
    
    public int tipo(){
        return this.tipo;
    }
}


