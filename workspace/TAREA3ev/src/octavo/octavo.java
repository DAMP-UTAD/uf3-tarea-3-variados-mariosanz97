package octavo;

import java.util.Scanner;

public class octavo {

	public static void main(String[] args) {

		System.out.println("Mete una fecha ");

		Scanner dia1 = new Scanner(System.in);
		System.out.print("Dia (1-31): ");
		int dia = dia1.nextInt();

		Scanner mes1 = new Scanner(System.in);
		System.out.print("Mes (1-12): ");
		int mes = mes1.nextInt();

		if (dia == 25) {

			if (mes == 12) {
				System.out.println("La fecha es de navidad ");
			} else {
				System.out.println("no es navidad");
			}

		}
	}
}
