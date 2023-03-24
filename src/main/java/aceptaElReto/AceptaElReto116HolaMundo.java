package aceptaElReto;

import java.util.Scanner;

public class AceptaElReto116HolaMundo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(0<=t && t<=5)
			for(int i=0;i<t;i++)
				System.out.println("Hola mundo.");
			
	}
}
