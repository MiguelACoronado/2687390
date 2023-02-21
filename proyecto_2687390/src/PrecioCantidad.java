import java.util.Scanner;

public class PrecioCantidad {
    public static void main(String[] args) {
        
        int cantidad,precio,contador,subTotal,acumulador,valorPago,vueltas,telefoniaMovil;

        Scanner lectura = new Scanner(System.in);

        contador = 0;

        acumulador = 0;

        for( int i = 1; i <= 5; i++){

            System.out.println("Escriba el precio del producto");

            precio = lectura.nextInt();

            System.out.println("Escriba la cantidad del producto");

            cantidad = lectura.nextInt();

            contador = contador +1;

            subTotal = precio * cantidad;

            acumulador = acumulador + subTotal;

        }

        System.out.println("El valor total a pagar es: " + acumulador);

        System.out.println("Ingrese el valor con el que va a cancelar la compra");

        valorPago = lectura.nextInt();

        vueltas = valorPago - acumulador;

        System.out.println("Tiene un cambio de: " + vueltas);

        System.out.println("Cuenta con telefonia movil exito? 1.Si tengo  2.No tengo");

        telefoniaMovil = lectura.nextInt();

        if(telefoniaMovil == 1){
            
            System.out.println("Ha obtenido " + contador + " minutos por su compra");

        }else{
            System.out.println("No pierdas mas minutos, adquiere ya tu telefonia móvil éxito");
        }



         

        lectura.close();
    }
}
