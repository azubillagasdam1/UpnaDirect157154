/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ordenador Aitor
 */
public class Bien {
    
    public static final int TIPO_VEHICULO = 1;
    public static final int TIPO_VIVIENDA = 2;
    
    private int valor;
    private int tipo; // 1 para vehiculo y 2 para vivienda
    
    
     public Bien(int valor, int tipo){
        this.valor = valor;
        this.tipo = tipo;
    }
      public int getValor(){
        return this.valor;
    }
    
    public int getTipo(){
        return this.tipo;
    }
}


