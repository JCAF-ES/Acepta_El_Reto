package aceptaElReto;

import java.util.Scanner;

public class AceptaElReto148Nochevieja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int horas;
		int min;
		String time;
		
		do {
			time = sc.nextLine();

			if (!time.equals("00:00")) {
				String[] horasYMinutos = time.split(":");

				horas = Integer.parseInt(horasYMinutos[0]);
				min = Integer.parseInt(horasYMinutos[1]);

				int minutoshoras = 1440 - ((horas* 60 ) + min);

				System.out.println(minutoshoras);
			}
		} while (!time.equals("00:00"));
		sc.close();
	}
}
