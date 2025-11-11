package ejercicio17;
import java.util.Scanner;

public class pedirdieznumyponerelmayorymenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc;
		sc= new Scanner(System.in);
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int num =0;
		
		for (int i=0; i<10;i++) {
				
		System.out.println("Introduce diez numeros para saber cual es el numero mayor y cual es el numero menor");
		num = sc.nextInt();
		
		if (num>mayor) {
			mayor=num;
		}
		if (num<menor) {
			menor=num;
		}
		}
		System.out.println("El numero mayor es: "+mayor);
		System.out.println("El numero menor es: "+menor);
		
		sc.close();
	}


}
