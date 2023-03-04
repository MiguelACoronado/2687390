import java.util.Random;
import java.util.Scanner;


public class reto9 {
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        Scanner lectura = new Scanner(System.in);

        int caraSello,valorGlobal,op,contador,apuesta,ganar,perder,ganarValorTotal,perderValorTotal;

        op = 0;

        contador = 0;

        ganar = 0;

        perder = 0;
        
        perderValorTotal = 0;

        ganarValorTotal = 0;



        System.out.println("Ingrese el valor total con el que desee ingresar al juego");

        valorGlobal = lectura.nextInt();

        System.out.println("Ingrese el valor que desee apostar");

        apuesta = lectura.nextInt();



        
     do{
        if(valorGlobal >= apuesta){

            int numero = aleatorio.nextInt(3);

                System.out.println("ingrese el numero 1(cara) o 2 (sello) segun el numero al que quiera apostar");

                caraSello = lectura.nextInt();
        
        
                switch(caraSello){
                    case 1:
        
                    System.out.println("Escogiste cara");
        
                    break;
        
                    case 2:
        
                    System.out.println("Escogiste sello");
        
                    break;
                }
                
                switch(numero){
                    case 1:
        
                    System.out.println("Salio cara");
        
                    break;
        
                    case 2:
        
                    System.out.println("Salio sello");
        
                    break;
                }
                
                if (caraSello == numero){
        
                    System.out.println("Ganaste");

                    ganar = apuesta * 2;


        
                }else{
        
                    System.out.println("Perdiste");

                    perder = valorGlobal - apuesta;
                }
        
        
        
        
                contador = contador + 1;
                
                ganarValorTotal = ganar + valorGlobal;

                perderValorTotal = perder;
                
    
    
                System.out.println("Desea seguir jugando? 1.Si 2.No");
    
                op = lectura.nextInt();
    
            



       }else if(valorGlobal < apuesta){

            System.out.println("No puedes apostar mas de lo que tienes intenta de nuevo :)");

        }
}while(op == 1);

        

        if(valorGlobal <= perderValorTotal){

            System.out.println("Quedaste con " + perderValorTotal + " dinero");
        }else{

            System.out.println("Jugaste " + contador + " veces");

            System.out.println("Acumulaste " + ganar + " dinero");

             System.out.println("Quedaste con " + ganarValorTotal + " en total");
        }
        
        





    
        
     lectura.close();
     
    }
}
