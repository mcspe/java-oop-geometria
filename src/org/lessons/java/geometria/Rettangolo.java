package org.lessons.java.geometria;

public class Rettangolo {
	
	public int base;
	public int altezza;
	
	Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public int calcolaArea() {
		return base * altezza;
	}
	
	public int calcolaPerimetro() {
		return 2 * base + 2 * altezza;
	}
	
	public void disegnaRett() {

		System.out.println(	"Base del rettangolo: " + base +
							"\nAltezza del rettangolo: " + altezza + 
							"\nPerimetro del rettangolo: " + calcolaPerimetro() +
							"\nArea del rettangolo: " + calcolaArea());
		
		for(int i = 0; i < altezza; i++) {
			
			String riga = "";
			char chEst = '0';
			char chInt;
			
			if (i == 0 || i == altezza - 1) {
				chInt = '0';
			} else {
				chInt = ' ';
			}
			
			for(int j = 0; j < base; j++) {
				if (j == 0 || j == base - 1) {
					riga += chEst;
				} else {
					riga += chInt;
				}
			}
			System.out.println(riga);
		}

		System.out.println("\n");
	}
}