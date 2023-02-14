import java.util.Random;
import java.util.Scanner;


public class Reto3 {
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        Scanner lectura = new Scanner(System.in);

        int apuesta;
        int numero = aleatorio.nextInt(3);

        System.out.println("ingrese el numero 1 o 2 segun el numero al que quiera apostar");

        apuesta = lectura.nextInt();

        System.out.println("El numero aleatorio es: " + numero);

        if(apuesta == numero){
            System.out.println("Ganaste");
        }else{
            System.out.println("Perdiste");
        }


    }
}
