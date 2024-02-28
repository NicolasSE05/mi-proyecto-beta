/*8.El Seguro Social requiere clasificar a las personas que se jubilaran en el año 2004.
Existen tres tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad
adulta. Las personas adscritas a la jubilación por edad deben tener 60 años o más y
una antigüedad en su empleo de menos de 25 años. Las personas adscritas a la
jubilación por antigüedad joven deben tener menos de 60 años y una antigüedad en su
empleo de 25 años o más. Las personas adscritas a la jubilación por antigüedad adulta
deben tener 60 años o más y una antigüedad en su empleo de 25 años o más.
*/
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio8 {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad , antiguedad;
        System.out.println("ingrese su edad:");
        edad = entrada.nextInt();
        System.out.println("ingrese su antiguedad");
        antiguedad = entrada.nextInt();
        
        if (edad >= 60 && antiguedad < 25){
        System.out.println("te corresponde una jubilacion por edad");
    }
        else if(edad<60 && antiguedad >=25){
        System.out.println("Te corresponde una jubilacion joven");
    }
        if (edad >= 60 && antiguedad >=25){
            System.out.println("te corresponde una jubilacion vieja");
     }
    }
    
}
