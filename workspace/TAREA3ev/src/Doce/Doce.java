package Doce;

import java.util.Scanner;

public class Doce {

	public static void main(String[] args) {

		Scanner coorxx = new Scanner(System.in);

		System.out.print("Coordenada x: ");
		int coorx = coorxx.nextInt();

		System.out.print("Coordenada y: ");
		int coory = coorxx.nextInt();

		if (coorx != 0 & coory != 0) {
			System.out.println("");
			System.out.println("Funciona");
			System.out.println("");

		} else {
			System.out.println("Tiene que ser diferente de 0 ");
		}

		while (coorx != 0 & coory != 0) {

			if (coorx > 0 & coory > 0) {
				System.out.println("Esta en el cuadrante 1");
				coorx = 0;
			} else {
				System.out.println("Esta en el cuadrante 2");

			}
		}

	}

}
