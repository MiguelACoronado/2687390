import java.util.Scanner;

public class Budjet {
    public static void main(String[] args) {
        
        double   ancho,largo,presupuesto,area;
    
        Scanner lectura=new Scanner(System.in);    
       

        System.out.println("Ingrese el ancho");

    ancho = lectura.nextDouble();


        System.out.println("Ingrese el largo");

    largo = lectura.nextDouble();


    area = largo * ancho;

    presupuesto = area * 45000;

        System.out.println("La superficie por cubrir es de " + largo + "m de largo x " + ancho + "m de ancho, con " + area + "m de area total, el presupuesto del proyecto es " + presupuesto);

    
    lectura.close();
    }
    









}
