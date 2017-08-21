package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Napisz program który odczytuje kolejne linie z pliku tekstowego i wypisuje je na ekranie je¿eli w danej linii wystêpuje wiêcej ni¿ 
 3 litery a i 2 litery o lub gdy wystêpuje ci¹g znaków „allow” */

public class J81 {

	public static void main(String[] args) throws FileNotFoundException {
		File plik = new File("C:\\Users\\Hanka\\Desktop\\J81.txt"); // albo mozna wpisac tylko "J81.txt" jesli jest w tym samym folderze
		Scanner odczyt = new Scanner(plik);
		
		while(odczyt.hasNextLine()) {
			String line  = odczyt.nextLine();
			String LC = line.toLowerCase();
			int licznikA = 0;
			int licznikO = 0;
			for(int i = 0; i<LC.length(); i++) {
				if(LC.charAt(i)=='a') {
					licznikA++;					
				}
				if(LC.charAt(i)=='o') {
					licznikO++;
				}
			}
			if((licznikA>=3 && licznikO>=2) || (LC.contains("allow"))) {
				System.out.println(line);
			}
		}
		odczyt.close();
	}
}
