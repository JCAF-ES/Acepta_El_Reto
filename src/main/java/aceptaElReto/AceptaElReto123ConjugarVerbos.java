package aceptaElReto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AceptaElReto123ConjugarVerbos {

	public static void main(String[] args) {
		int num, i;
		Scanner scan = new Scanner(System.in);
		List<Palabra> palabras = new ArrayList<>();
		String array[] = { "yo", "tu", "el", "nosotros", "vosotros", "ellos" };
		String linea;
		String listaVerbos[];
		Palabra palabra;

		do {
			linea = scan.nextLine();
			listaVerbos = linea.split(" ");
			palabra = new Palabra(listaVerbos[0], listaVerbos[1]);
			palabras.add(palabra);
		} while (!palabra.tiempoVerbal.equals("T"));

		i = 0;
		while (i < palabras.size()) {
			num = tipo(palabras.get(i).verbo);
			conjugar(num, palabras.get(i).verbo, palabras.get(i).tiempoVerbal, array);
			i++;
		}
		scan.close();
	}

	public static int tipo(String verbo) {
		if (verbo.endsWith("ar")) {
			return 1;
		} else if (verbo.endsWith("er")) {
			return 2;
		} else if (verbo.endsWith("ir")) {
			return 3;
		} else
			return -1;
	}

	public static void conjugar(int tipo, String verbo, String tiempoVerbal, String array[]) {
		String verbito = verbo.substring(0, verbo.length() - 2);
		switch (tipo) {
		case 1:
			switch (tiempoVerbal) {
			case "A":
				System.out.println(array[0] + " " + verbito + "o");
				System.out.println(array[1] + " " + verbito + "as");
				System.out.println(array[2] + " " + verbito + "a");
				System.out.println(array[3] + " " + verbito + "amos");
				System.out.println(array[4] + " " + verbito + "ais");
				System.out.println(array[5] + " " + verbito + "an");
				break;
			case "P":
				System.out.println(array[0] + " " + verbito + "e");
				System.out.println(array[1] + " " + verbito + "aste");
				System.out.println(array[2] + " " + verbito + "o");
				System.out.println(array[3] + " " + verbito + "amos");
				System.out.println(array[4] + " " + verbito + "asteis");
				System.out.println(array[5] + " " + verbito + "aron");
				break;
			case "F":
				System.out.println(array[0] + " " + verbito + "are");
				System.out.println(array[1] + " " + verbito + "aras");
				System.out.println(array[2] + " " + verbito + "ara");
				System.out.println(array[3] + " " + verbito + "aremos");
				System.out.println(array[4] + " " + verbito + "areis");
				System.out.println(array[5] + " " + verbito + "aran");
				break;
			default:
				break;
			}
			break;
		case 2:
			switch (tiempoVerbal) {
			case "A":
				System.out.println(array[0] + " " + verbito + "o");
				System.out.println(array[1] + " " + verbito + "es");
				System.out.println(array[2] + " " + verbito + "e");
				System.out.println(array[3] + " " + verbito + "emos");
				System.out.println(array[4] + " " + verbito + "eis");
				System.out.println(array[5] + " " + verbito + "en");
				break;
			case "P":
				System.out.println(array[0] + " " + verbito + "i");
				System.out.println(array[1] + " " + verbito + "iste");
				System.out.println(array[2] + " " + verbito + "io");
				System.out.println(array[3] + " " + verbito + "imos");
				System.out.println(array[4] + " " + verbito + "isteis");
				System.out.println(array[5] + " " + verbito + "ieron");
				break;
			case "F":
				System.out.println(array[0] + " " + verbito + "ere");
				System.out.println(array[1] + " " + verbito + "eras");
				System.out.println(array[2] + " " + verbito + "era");
				System.out.println(array[3] + " " + verbito + "eremos");
				System.out.println(array[4] + " " + verbito + "ereis");
				System.out.println(array[5] + " " + verbito + "eran");
				break;
			default:
				break;
			}
			break;
		case 3:
			switch (tiempoVerbal) {
			case "A":
				System.out.println(array[0] + " " + verbito + "o");
				System.out.println(array[1] + " " + verbito + "es");
				System.out.println(array[2] + " " + verbito + "e");
				System.out.println(array[3] + " " + verbito + "imos");
				System.out.println(array[4] + " " + verbito + "is");
				System.out.println(array[5] + " " + verbito + "en");
				break;
			case "P":
				System.out.println(array[0] + " " + verbito + "i");
				System.out.println(array[1] + " " + verbito + "iste");
				System.out.println(array[2] + " " + verbito + "io");
				System.out.println(array[3] + " " + verbito + "imos");
				System.out.println(array[4] + " " + verbito + "isteis");
				System.out.println(array[5] + " " + verbito + "ieron");
				break;
			case "F":
				System.out.println(array[0] + " " + verbito + "ire");
				System.out.println(array[1] + " " + verbito + "iras");
				System.out.println(array[2] + " " + verbito + "ira");
				System.out.println(array[3] + " " + verbito + "iremos");
				System.out.println(array[4] + " " + verbito + "ireis");
				System.out.println(array[5] + " " + verbito + "iran");
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
	}
}

class Palabra {
	public String verbo;
	public String tiempoVerbal;

	public Palabra(String verbo, String tiempoVerbal) {
		super();
		this.verbo = verbo;
		this.tiempoVerbal = tiempoVerbal;
	}
};
