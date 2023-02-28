import java.util.Scanner;

public class reto_7 {
public static void main(String[]args){
double descuento=0;
double montototal=0;
double venta=0;

Scanner lectura= new Scanner(System.in);
System.out.println("Introduzca la cantidad de la venta");
venta=lectura.nextDouble();
System.out.println("La venta es de: "+ venta);

if(venta>=100){
descuento=venta*0.20;
}else{
if(venta>=50){
descuento=venta*.10;
}else{
descuento=0;
}

System.out.println ("El descuento es de: " + descuento);
montototal= venta-descuento;
System.out.println ("El monto total de la venta es de: " + montototal);
}
lectura.close();
}
}