import java.util.Random;
import java.util.Scanner;


public class Reto3 {
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        Scanner lectura = new Scanner(System.in);

        int apuesta;
        int numero = aleatorio.nextInt(3);

        System.out.println("ingrese el numero 1(cara) o 2 (sello) segun el numero al que quiera apostar");

        apuesta = lectura.nextInt();

        

        if (apuesta == 1 ){
            System.out.println("Escogiste cara");
        }else if(apuesta == 2){
            System.out.println("Escogiste sello");
        }

        if(numero == 1){
            System.out.println("Salio cara");
        }else if(numero == 2){
            System.out.println("Salio sello");
        }


       /* if(numero == 1 && apuesta == 1){
            System.out.println("Ganaste, escogiste sello");
        }else if(numero == 2 && apuesta == 2){
            System.out.println("Ganaste, escogiste cara");
        }else if( numero == 1 && apuesta == 2){
            System.out.println("Perdiste, escogiste sello");
        }else if( numero == 2 && apuesta == 1){
            System.out.println("Perdiste, escogiste cara");
        } */





    
        
     lectura.close();
     
    }
}
