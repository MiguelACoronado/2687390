import java.util.Scanner;


public class SumRest {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int num1,num2,sum,rest;
        
        System.out.println("Ingrese numero 1");

        num1 = lectura.nextInt();
       
        System.out.println("Ingrese numero 2");
        
        num2 = lectura.nextInt();
        
        sum = num1 + num2;

        rest = num1 - num2;

        if (num1 > num2){
            System.out.println("La suma de los dos números es: " + sum);
        }else{
            System.out.println("La resta de los dos números es: " + rest);
        }


        lectura.close();
    }
}