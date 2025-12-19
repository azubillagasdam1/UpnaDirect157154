/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ordenador Aitor
 */

import java.util.Scanner;
import java.time.LocalDate;

public class VistaConsola {
    
    private Scanner scan;

    public VistaConsola() {
        scan = new Scanner(System.in);
    }
    
    
        public Cliente introducirCliente(){
        Cliente cliente;
        int anoNacimiento;
        int salario;


        System.out.print("Introduce año de nacimiento: ");
        anoNacimiento = scan.nextInt();

        while(anoNacimiento < 1900 || anoNacimiento > LocalDate.now().getYear()){
            System.out.print("Introduzca un año valido positivo y menor al año actual: ");
            anoNacimiento = scan.nextInt();
        }

        System.out.print("Introduce salario: ");
        salario = scan.nextInt();

        while(salario < 0){
            System.out.print("Introduzca un salario valido, numero entero y positivo): ");
            salario = scan.nextInt(); 
        }

  
        // para que no falle la lectura del texto en el siguiente método.
        scan.nextLine(); 

        cliente = new Cliente(anoNacimiento,salario);
        
        return cliente;
    }
}
