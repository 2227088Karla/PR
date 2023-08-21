
package prog_paradigmas;
import java.util.Scanner;
public class Prog_paradigmas {
    // KNGH ICO i2
    public static void main(String[] args) {
        int numero;//se le da un valor al numero
        Scanner lector= new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        numero = lector.nextInt();//el usuario ingresa un numero
        if(numero%2 == 0){ /*hace la operacion y comparacion 
            para saber si un numero es par o impar*/
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
    }
}
