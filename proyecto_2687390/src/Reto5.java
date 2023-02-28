import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        String nombre, apellido, nombrecompleto;
        
        System.out.println("Escriba su nombre");

        nombre = lectura.nextLine();

        System.out.println("Escriba su apellido");

        apellido = lectura.nextLine();

        System.out.println("La cantidad de letras en el nombre es de: " + nombre.length() + " y la cantidad de letras en el apellido es de: " + apellido.length());

        System.out.println(nombre.toUpperCase() + " " + apellido.toLowerCase());

        nombrecompleto= nombre + apellido;

        System.out.println("El nombre completo es: " + nombrecompleto);

        String sCadena = nombre;

        String sSubCadena = sCadena.substring(0,2);

        System.out.println(sSubCadena + apellido.toLowerCase());

    }
}
