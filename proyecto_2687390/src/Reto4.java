import java.util.Scanner;


public class Reto4 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escoge una opcion para jugar contra la maquina");


		int seleccionCompu = (int)(Math.random() * 3) + 1;
		System.out.println("La maquina ya escogio");

		System.out.print("Escoge tu opcion 1.Piedra, 2.Papel, 3=.ijera: ");
		int seleccionUsuario = lectura.nextInt();

		System.out.print("La computadora habia escogido: ");
		switch ( seleccionCompu )
		{
			case 1:
				System.out.println("Piedra");
				switch ( seleccionUsuario )
				{
					case 1: System.out.println("Empataron!"); break;
					case 2: System.out.println("Ganaste!"); break;
					case 3: System.out.println("La computadora ha ganado!"); break;
				}
				break;

			case 2:
				System.out.println("Papel");
				switch ( seleccionUsuario )
				{
					case 1: System.out.println("La computadora ha ganado!"); break;
					case 2: System.out.println("Empataron!"); break;
					case 3: System.out.println("Ganaste!"); break;
				}
				break;

			case 3:
				System.out.println("Tijera");
				switch ( seleccionUsuario )
				{
					case 1: System.out.println("Ganaste!"); break;
					case 2: System.out.println("La computadora ha ganado!"); break;
					case 3: System.out.println("Empataron!"); break;
				}
				break;

                
    }
                lectura.close();
}

}
