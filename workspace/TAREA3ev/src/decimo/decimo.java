package decimo;

import java.util.Scanner;

public class decimo {

	public static void main(String[] args) {
		Scanner dia1 = new Scanner(System.in);

		System.out.print("Numero uno: ");
		int num1 = dia1.nextInt();

		Scanner mes1 = new Scanner(System.in);
		System.out.print("Numero dos: ");
		int num2 = mes1.nextInt();

		Scanner año1 = new Scanner(System.in);
		System.out.print("Numero tres: ");
		int num3 = año1.nextInt();

		
		if (num1<10 & num2<10 & num3<10) {
			System.out.println("Son menores de 10 ");
		} 

	}

}
