package ejercicio19;
import java.util.Scanner;

public class variableconvaloraleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc;
		sc = new Scanner(System.in); //lector de Scanner
		
		int aleatorio = 0;
		int max = 100;
		int NumVeces = 1;
		int min = 0;
		
		aleatorio = (int)Math.floor(Math.random() * (max - min +1) + min);
		
		System.out.println(aleatorio);
			System.out.println("Introduce un numero entre el 0 y el 100");
			int numIntroducido = sc.nextInt();
			
			while(aleatorio!=numIntroducido) {
				if(numIntroducido<aleatorio) {
					System.out.println("el numero que busca es mas grande");
				}else {
					System.out.println("el numero que busca es mas pequeño");
					
				}
				NumVeces++;
				numIntroducido = sc.nextInt();
			}
			System.out.println("Adivinaste el numero!");
			System.out.println("Los intentos requeridos para adivinar el numero fueron: "+NumVeces);
		sc.close();
	}

}
