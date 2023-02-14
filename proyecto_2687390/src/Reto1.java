import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        double grades, celsius;
        
        System.out.println("Ingrese los grados Farenheit");

        grades = lectura.nextDouble();

        System.out.println("La temperatura ingresada es: " + grades);

        celsius = (grades - 32) / 1.8; 

        System.out.println(grades+" en temperatura celsius es: "+celsius);


        lectura.close();
    }
}
