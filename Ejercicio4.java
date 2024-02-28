
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        System.out.println("Numero de kilos comprados");
        int manzana;
        manzana = entrada.nextInt();
        entrada.nextLine();
        
       int kilos = 50;
       int precio = 0;
       int total = 0;
       
       if (manzana >=0 && manzana<=2 ){
        precio = (manzana * kilos);
        total =(int)(precio + 0);
       }else if (manzana >2 && manzana<=5);{
        precio = (manzana*kilos);
        total =(int)(precio*0.1);
        }if (manzana >5 && manzana <=10 ){
        precio = (manzana*kilos);
        total =(int)(precio * 0.15);
       }else if (manzana >10 );{
        precio = (manzana*kilos);
        total = (int)(precio * 0.20);
        }
       System.out.println("el valor de debe pagar es:" + total);
    }
       
       
       
        
        
                
    }
    

