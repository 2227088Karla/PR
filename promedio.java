
package prog_paradigmas;
//KNGH ICO i2
import java.util.Scanner;

public class promedio {
 //Programa que saca el promedio de tres numeros
    public static void main(String[] args) {
        
        //se declaran las variables
        int promedio, num1, num2, num3;
        Scanner leer = new Scanner(System.in);
        
        //el usuario introduce los tres numeros
        System.out.println("ingresa un numero entero");
        num1=leer.nextInt();
        System.out.println("ingresa un segundo numero entero");
        num2=leer.nextInt();
        System.out.println("ingresa un tercer numero entero");
        num3=leer.nextInt();
        
        //se hace la operacion para sacar el promedio
        promedio=(num1+num2+num3)/3;
        System.out.println("El promedio de los tres numeros es: "+promedio);
    }
}
