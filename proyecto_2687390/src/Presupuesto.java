import java.util.Scanner;

public class Presupuesto {
    public static void main(String[] args) {
        

        Scanner lectura = new Scanner(System.in);

        int spent,budjet,totals,op;

        op = 1;

        totals = 0;

        budjet = 100000;

        while(op == 1 ){
            System.out.println("Ingrese el gasto");
    
            spent = lectura.nextInt();

            budjet = budjet - spent;
 
            System.out.println("el gasto fue de " + spent + " y le queda un total de " + budjet);

            totals = totals + 1;
            
            if(totals <= 3){
            
                System.out.println("Desea registrar otro gasto 1.si 2.no");

            op = lectura.nextInt();
           
           
           
          
               

           }
    
            }
    
            lectura.close();
    }
}
