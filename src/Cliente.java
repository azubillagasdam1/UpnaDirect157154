
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ordenador Aitor
 */
public class Cliente {
     int anoNacimiento;
     int salario;
    
    
    public Cliente(int ano, int salario){
        this.anoNacimiento = ano;
        this.salario = salario;
    }
    
       public boolean esJoven(){
        return (LocalDate.now().getYear() - this.anoNacimiento) <= 20;
    }
    
    public boolean esMayor() {
        return (LocalDate.now().getYear() - this.anoNacimiento) >= 60;
    }
    
    public int salario(){
        return this.salario;
    }
}
