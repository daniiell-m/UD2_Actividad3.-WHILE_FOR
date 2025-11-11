package ejercicio22;
import java.util.Scanner;
public class visualizarmenutresnumsiintroducecuatroterminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc;
		sc = new Scanner(System.in);
		int num;
		System.out.println("MENU");
		System.out.println("1.- OPCION 1");
		System.out.println("2.- OPCION 2");
		System.out.println("2.- OPCION 3");
		num=sc.nextInt();
		
		switch(num) {
		case 1:
		System.out.println("Has escogido la opcion 1");
		break;
		case 2:
		System.out.println("Has escogido la opcion 2");
		break;
		case 3:
		System.out.println("Has escogido la opcion 3");
		break;
		default:
			System.out.println("Adios");
	}
		sc.close();
	}
}
