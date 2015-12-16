package diecisieteavo;

import java.util.Scanner;

public class diecisieteavo {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Cuantos empleados trabajan? ");
		int num1 = num.nextInt();

		int x = 0;

		while (num1 > x) {
			
			System.out.println("Cuanto cobra: ");
			int cobra = num.nextInt();
			
			x++;
			if (cobra>=100 & cobra <=300) {
				System.out.println("Cobra entre 100 y 300");
				
			}else if (cobra>300)
				System.out.println("Cobra mas de 300");
			System.out.println("");
		}
			
			
		}
	
		
		

	}


