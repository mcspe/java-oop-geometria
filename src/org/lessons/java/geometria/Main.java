package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for(int i = 1; i <= 3; i++) {
			
			System.out.println("Rettangolo " + i);
			System.out.print("Definisci la base del rettangolo: ");
			int base = sc.nextInt();
			System.out.print("Definisci l'altezza del rettangolo: ");
			int altezza = sc.nextInt();
			
			Rettangolo rett = new Rettangolo(base, altezza);
			rett.disegnaRett();
			
		}
		
		sc.close();

	}

}
