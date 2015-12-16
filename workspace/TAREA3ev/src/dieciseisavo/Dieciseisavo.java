package dieciseisavo;

import java.util.Scanner;

public class Dieciseisavo {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

		System.out.println("Cuantos numeros de alturas desea introducir? ");
		int num1 = num.nextInt();

		int x = 0;

		while (num1 > x) {
			System.out.println("Altura: ");
			int num2 = num.nextInt();
			
			
			x++;

			if (num1==x) {
				
				int numm=num2/x;
				System.out.println("Promedio es: "+numm);
			}
		}
		

		

	}

}
