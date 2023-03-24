package aceptaElReto;

import java.util.Scanner;

public class AceptaElReto107LaFiestaAburrida {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String lista[] = new String[n];

		sc.nextLine();
		for (i = 0; i < n; i++)
			lista[i] = sc.nextLine();

		for (i = 0; i < n; i++) {
			lista[i] = lista[i].replace("Soy ", "");
			System.out.println("Hola, " + lista[i] + ".");
		}
	}
}
