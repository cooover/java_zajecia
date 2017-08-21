package j83;
/* Napisz program kt�ry b�dzie pobiera� ci�gi znak�w od u�ytkownika i b�dzie je zapisywa� w kolejnych liniach pliku tekstowego dop�ki u�ytkownik
nie wpisze �koniec�
Nast�pnie wy�wietl ca�y zawarto�� pliku do kt�rego zosta� wpisany tekst. */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class J83 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		File plik = new File("plikJ83.txt");
		PrintWriter zapis = new PrintWriter(plik);
		String a = "";
		while(!a.toLowerCase().equals("koniec")) {
			System.out.println("Podaj linijk� tekstu: ");
			a=input.nextLine();
			if(!a.toLowerCase().equals("koniec")) {
				zapis.println(a);
			}
		}
		input.close();
		zapis.close();
		Scanner odczyt = new Scanner(plik);
		while(odczyt.hasNextLine()) {
			String line  = odczyt.nextLine();
			System.out.println(line);
		}
		odczyt.close();		
	}

}
