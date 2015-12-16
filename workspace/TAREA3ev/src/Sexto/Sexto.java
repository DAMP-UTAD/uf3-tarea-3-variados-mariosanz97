package Sexto;

import java.util.Scanner;

public class Sexto {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

		System.out.print("Mete numero: ");
		int num1 = num.nextInt();

		if (num1 > 99) {
			System.out.println("El numero tiene tres cifras");
		} else if (num1 > 9) {
			System.out.println("El numero tiene dos cifras");
		} else {
			System.out.println("El numero tiene una cifra");
		}

	}

}
