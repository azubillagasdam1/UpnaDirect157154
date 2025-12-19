package upnadirect157154;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author Ordenador Aitor
 */
public class VistaConsola {
    
    private Scanner scan;

    public VistaConsola() {
        scan = new Scanner(System.in);
    }
    
    
        public Cliente introducirCliente(){
        Cliente cliente;
        int anoNacimiento;
        int salario;


        System.out.print("Introduce ano de nacimiento: ");
        anoNacimiento = scan.nextInt();

        while(anoNacimiento < 1900 || anoNacimiento > LocalDate.now().getYear()){
            System.out.print("Introduzca un ano valido positivo y menor al ano actual: ");
            anoNacimiento = scan.nextInt();
        }

        System.out.print("Introduce salario: ");
        salario = scan.nextInt();

        while(salario < 0){
            System.out.print("Introduzca un salario valido, numero entero y positivo): ");
            salario = scan.nextInt(); 
        }

  
        // Limpiamos buffer
        scan.nextLine(); 

        cliente = new Cliente(anoNacimiento,salario);
        
        return cliente;
    }
        
        
        
        public Bien introducirBien(){
        Bien bien;
        int tipo;
        int valor;

        System.out.print("Para asegurar vehiculo introduzca '1'; Para asegurar vivienda introduzca '2': ");
        tipo = scan.nextInt();

        while(tipo!=Bien.TIPO_VEHICULO && tipo!=Bien.TIPO_VIVIENDA){
            System.out.print("Introduzca un valor valido '1' o '2': ");
            tipo = scan.nextInt();
        }

        if(tipo==Bien.TIPO_VEHICULO){
            System.out.print("Introduzca el valor del vehiculo [0 / 50000]: ");
            valor = scan.nextInt();
            // Limpiamos buffer 
            scan.nextLine(); 
            
            while(0 > valor || valor > 50000 ){
                System.out.print("Introduzca un valor valido [0 / 50000]: ");
                valor = scan.nextInt();
                scan.nextLine();
            }
            bien = new Bien(valor,Bien.TIPO_VEHICULO);
        }
        else{
            System.out.print("Introduzca el valor de la vivienda, mayor a 50000: ");
            valor = scan.nextInt();
            scan.nextLine(); 
            
            while(valor < 50000 ){
                System.out.print("Introduzca un valor valido,  mayor a 50000): ");
                valor = scan.nextInt();
                scan.nextLine();
            }
            bien = new Bien(valor,Bien.TIPO_VIVIENDA);
        }

        return bien;
    }
        
        public Poliza instanciarPoliza(Bien bien,Cliente cliente){
        return new Poliza(cliente,bien);
    }

    public void imprimirPoliza(Poliza poliza){
        System.out.println(poliza.mostrarPoliza());
    }
        
        
}