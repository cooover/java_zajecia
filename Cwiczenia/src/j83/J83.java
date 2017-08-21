package j83;
/* Napisz program który bêdzie pobiera³ ci¹gi znaków od u¿ytkownika i bêdzie je zapisywa³ w kolejnych liniach pliku tekstowego dopóki u¿ytkownik
nie wpisze „koniec”
Nastêpnie wyœwietl ca³y zawartoœæ pliku do którego zosta³ wpisany tekst. */

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
			System.out.println("Podaj linijkê tekstu: ");
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
