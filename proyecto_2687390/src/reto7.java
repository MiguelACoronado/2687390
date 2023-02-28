import java.util.Scanner;

public class reto7 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        int precioCompra, colorbolita, rojo, azul, amarillo;

        System.out.println("Ingrese el precio de su compra");
        precioCompra= lectura.nextInt();

        colorbolita = (int)Math.floor(Math.random()*4+1);

        rojo = (precioCompra / 100) * 10;

        azul = (precioCompra / 100) * 30;

        amarillo = (precioCompra / 100) * 50;

        if(precioCompra > 50000){

            switch(colorbolita){
                case 1:

                System.out.println("Su bolita es de color rojo, felicidades obtienes el 10% de descuento");
                System.out.println("El valor total de su compra es de: " + rojo);

                break;

                case 2:
                
                System.out.println("Su bolita es de color azul, felicidades obtienes el 30% de descuento");
                System.out.println("El valor total de su compra es de: " + azul);

                break;

                case 3:
                
                System.out.println("Su bolita es de color amarilla, felicidades obtienes el 50% de descuento");
                System.out.println("El valor total de su compra es de: " + amarillo);

                break;

                case 4:
                
                System.out.println("Su bolita es de color blanca, felicidades su compra es totalmente gratuita");

                break;

                default:

                System.out.println("Registre la compra de nuevo");
            }
        }else{
            System.out.println("Su compra no cumple los requisitos para participar en el juego");
        }
        lectura.close();
    }
}
