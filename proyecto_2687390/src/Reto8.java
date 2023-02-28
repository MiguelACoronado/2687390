import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        int vueltasrojo,vueltasazul,vueltasamarillo,valorPago,acumulador,contador,op,subTotal, precio, cantidad, colorbolita, rojo, rojo1, azul, azul1, amarillo, amarillo1;

        contador = 0;

        acumulador = 0;

        op = 0;

        do{

            System.out.println("Escriba el precio del producto");

            precio = lectura.nextInt();

            System.out.println("Escriba la cantidad del producto");

            cantidad = lectura.nextInt();

            contador = contador +1;

            subTotal = precio * cantidad;

            acumulador = acumulador + subTotal;

            System.out.println("Desea registrar un nuevo producto 1.Si 2.No");

            op = lectura.nextInt();

        }while(op == 1);

        System.out.println("El valor total a pagar es: " + acumulador);

        colorbolita = (int)Math.floor(Math.random()*4+1);

        rojo = (acumulador / 100) * 10;

        azul = (acumulador / 100) * 30;

        amarillo = (acumulador / 100) * 50;

        rojo1 = acumulador - rojo;

        azul1 = acumulador - azul;

        amarillo1 = acumulador - amarillo;

        if(acumulador > 50000){

            System.out.println("Empezaste a participar en el sorteo");

            switch(colorbolita){
                case 1:

                System.out.println("Su bolita es de color rojo, felicidades obtienes el 10% de descuento");
                System.out.println("El valor total de su compra es de: " + rojo1);

                break;

                case 2:
                
                System.out.println("Su bolita es de color azul, felicidades obtienes el 30% de descuento");
                System.out.println("El valor total de su compra es de: " + azul1);

                break;

                case 3:
                
                System.out.println("Su bolita es de color amarilla, felicidades obtienes el 50% de descuento");
                System.out.println("El valor total de su compra es de: " + amarillo1);

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

       switch(colorbolita){
        
        case 1:

        System.out.println("Ingrese el valor con el que va a cancelar la compra");
        valorPago = lectura.nextInt();
        vueltasrojo =  valorPago - rojo1;
        System.out.println("Sus vueltas son: " + vueltasrojo);

        break;

        case 2:

        System.out.println("Ingrese el valor con el que va a cancelar la compra");
        valorPago = lectura.nextInt();
        vueltasazul = valorPago- azul1;
        System.out.println("Sus vueltas son: " + vueltasazul);

        break;

        case 3:

        System.out.println("Ingrese el valor con el que va a cancelar la compra");

        
        valorPago = lectura.nextInt();
        vueltasamarillo = valorPago-amarillo1;
        System.out.println("Sus vueltas son: " + vueltasamarillo);

        break;

        case 4:

        System.out.println("Gracias por participar");
      

        break;

        

       }

       
        lectura.close();
    }
}
