import java.util.Scanner;

public class HombreMujer {

    public static void main(String[] args) {
        
        int contadorHombre,contadorMujer;

        Scanner lectura = new Scanner(System.in);

        contadorHombre = 0;

        contadorMujer = 0;

        for( int i = 1; i <= 10; i++){

            System.out.println("Escriba si es 1.Hombre o 2.Mujer");

           int sexo = lectura.nextInt();


          switch(sexo){
            case 1:

            contadorHombre = contadorHombre + 1;

            break;

            case 2:

            contadorMujer = contadorMujer + 1;

            break;

            default:

            System.out.println("numero incorrecto");

            break;
          }


            

           

        }

         System.out.println("hay " + contadorHombre + " hombres en el grupo y " + contadorMujer + " mujeres en el grupo");

        lectura.close();
    }
    
}
