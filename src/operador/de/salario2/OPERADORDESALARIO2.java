
package operador.de.salario2;

import java.awt.BorderLayout;
import java.util.Scanner;

public class OPERADORDESALARIO2 {

    
    public static void main(String[] args) {
        
        int Sbase = 1000, CantAuto;
        double ValorAuto, Comision, porcentaje, Stotal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INTRODUZCA LA CANTIDAD DE AUTOS");
        CantAuto = entrada.nextInt();
         
        System.out.println("INTRODUZCA EL VALOR DEL AUTO");
        ValorAuto = entrada.nextDouble();
        
        Comision = 150*CantAuto;
        porcentaje = CantAuto*ValorAuto*0.05;
        
        Stotal = Sbase +Comision+porcentaje;
        
        System.out.println("\nEL SALARIO TOTAL ES DE " +Stotal );
        
        
       
        
        
        
        
    }
    
}
