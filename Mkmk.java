package prog_paradigmas;
import java.util.Scanner;

public class Mkmk {
//KNGH ICO i2
    public static void main(String[] args) {
        System.out.println("Programa que compara dos numeros");
        
        //se declaran las variables
        int num1, num2;
        Scanner lector = new Scanner(System.in);
        
        //el usuario ingresa los valores
        System.out.println("Ingresa el primer numero entero:");
        num1=lector.nextInt();
        System.out.println("Ingresa el segundo numero entero:");
        num2=lector.nextInt();
        
        //se comparan los numeros
        if(num1>num2){
            System.out.println("El primer numero es mayor");
        }else{
            System.out.println("El segundo numero es mayor");
        }
    }

}
