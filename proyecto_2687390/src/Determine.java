import java.util.Scanner;


public class Determine {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int num;
        
        System.out.println("Ingrese un número");

        num = lectura.nextInt();
       

        if (num > 0){
            System.out.println("El numero " + num +" es positivo");
        }else if(num == 0){
            System.out.println("El numero " + num +" es neutro");
        }else{
            System.out.println("El numero " + num +" es negativo");
        }


        lectura.close();
    }
}


