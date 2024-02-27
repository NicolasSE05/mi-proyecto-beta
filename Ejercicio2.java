
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

public static void main(String[] args) {
       Scanner entrada= new Scanner (System.in);
       System.out.println("numero de llantas" );
       int llantas;
       llantas = entrada.nextInt();
       entrada.nextLine();
               
         int precioa = 100;
         int preciob = 75;
         int precioc = 50;
         int total = 0;
          
        if (llantas <5){
            total = (llantas*precioa);
        }else if (llantas >=5 && llantas <=10){
            total = (llantas*preciob);
        }if (llantas >10){
            total = (llantas*precioc);
        }
System.out.println("cantidad a pagar es:" + total);
            
    }
    
}

