import java.util.Scanner;

public class Asists {
    public static void main(String[] args) {
       
        double nota1,nota2,nota3,asistencia,promedio;
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese la primera nota");
        nota1 = lectura.nextDouble();
        System.out.println("Ingrese la segunda nota");
        nota2 = lectura.nextDouble();
        System.out.println("Ingrese la tercera nota");
        nota3 = lectura.nextDouble();
        System.out.println("Ingrese procentaje de asistencia");
        asistencia = lectura.nextDouble();

        promedio = (nota1 + nota2 + nota3)/3;

        if(promedio == 3.5 && asistencia == 70){
              System.out.println("Aprobaste");
    
        }else{
            System.out.println("No aprobaste");
        }


        lectura.close();
    }
}
