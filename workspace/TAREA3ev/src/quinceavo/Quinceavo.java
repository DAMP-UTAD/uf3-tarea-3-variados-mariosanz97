package quinceavo;

import java.util.Scanner;

public class Quinceavo {

	public static void main(String[] args) {

		int x = 0;
		Scanner notas = new Scanner(System.in);

		while (x < 10) {
			System.out.print("Notas alumnos; ");
			int nota1 = notas.nextInt();
			x++;

			if (nota1 >= 7) {
				System.out.println("Tiene mas o igual que un 7,su nota es: "
						+ nota1);

			} else {
				System.out.println("Tiene menos que un 7,su nota es: " + nota1);
			}

		}

	}

}
