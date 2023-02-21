import java.util.Scanner;

public class PrecioCantidad {
    public static void main(String[] args) {
        
        int cantidad,precio;

        Scanner lectura = new Scanner(System.in);

        for( int i = 1; i <= 5; i++){

            System.out.println("Escriba el precio del producto");

            precio = lectura.nextInt();

            System.out.println("Escriba la cantidad del producto");

            cantidad = lectura.nextInt();
        }


        lectura.close();
    }
}
