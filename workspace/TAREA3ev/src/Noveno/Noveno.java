package Noveno;

import java.util.Scanner;

public class Noveno {

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

		
		if (num1==num2 & num2==num1) {
			int num4=num1+num2;
			int num5=num4*num3;
			System.out.println("Son iguales, la suma es, "+num5);
		} else {

		}
		
		
		
	}

}
