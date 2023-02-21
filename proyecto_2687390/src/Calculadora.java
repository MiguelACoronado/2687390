import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        double numero1,numero2,suma,resta,multiplicacion,division,potencia,raiz_cuadrada1, raiz_cuadrada2;

        int operacion;

    
        Scanner lectura=new Scanner(System.in);
        
        System.out.println("Ingrese un numero");

        numero1 = lectura.nextDouble();

        System.out.println("Ingrese otro numero");

        numero2 = lectura.nextDouble();

     
        System.out.println("1.suma 2.resta 3.multiplicacion 4.division 5.potencia 6.raiz cuadrada");

        operacion = lectura.nextInt();

        switch(operacion){
            case 1:

            suma =  numero1 + numero2;

            System.out.println("la suma entre " + numero1 + " y " + numero2 + " es: " + suma);

            break;

            case 2:

            resta =  numero1 - numero2;

            System.out.println("la resta entre " + numero1 + " y " + numero2 + " es: " + resta);

            break;

            case 3:

            multiplicacion =  numero1 * numero2;

            System.out.println("la multipliacion entre " + numero1 + " y " + numero2 + " es: " + multiplicacion);

            break;

            case 4:

            division =  numero1 / numero2;

            System.out.println("la division entre " + numero1 + " y " + numero2 + " es: " + division);

            break;

            case 5:

            potencia =  Math.pow(numero1, numero2);

            System.out.println("la potencia entre " + numero1 + " y " + numero2 + " es: " + potencia);

            break;

            case 6:

            raiz_cuadrada1 =  Math.sqrt(numero1);
            raiz_cuadrada2 =  Math.sqrt(numero2);
            
            System.out.println("la raiz cuadrada de :" + numero1 + "es: " + raiz_cuadrada1);

            System.out.println("la raiz cuadrada de :" + numero2 + "es: " + raiz_cuadrada2);

            break;


            default:

            System.out.println("no corresponde a ninguna operación");

            break;
        }
        

    
            
           lectura.close();    
        }
       

        }




  /* suma = numero1 + numero2;

        resta = numero1 - numero2;

        multiplicacion = numero1 * numero2;

        division = numero1 / numero2; */






