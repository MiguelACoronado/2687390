import java.util.Scanner;


public class Verification {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int age;

        System.out.println("Ingrese su edad");

        age = lectura.nextInt();

        if (age >= 18){
            System.out.println("Puede ingresar");
        }else{
            System.out.println("No puede ingresar");
        }


        lectura.close();
    }
}
