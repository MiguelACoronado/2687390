import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        
        int number1, number2, result;
             
             System.out.println("Ingrese un número");

        number1 = lectura.nextInt();

             System.out.println("El número que ingresaste es: " + number1);

           System.out.println();

           System.out.println("Ingrese otro número");

        number2 = lectura.nextInt();

           System.out.println("El número que ingresaste es: " + number2);
        
        result = number1 + number2;
             
           System.out.println("La suma entre " + number1 + " y " + number2 + " es: " + result );

        String name;

        lectura.nextLine();//Limpieza de Buffer

           System.out.println("Ingrese su nombre");

        name = lectura.nextLine();

           System.out.println("El nombre ingresado es: " + name);
        


        lectura.close();
    }
}
