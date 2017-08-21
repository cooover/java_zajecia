package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PlikiOperacje {

	public static void main(String[] args) throws FileNotFoundException {
		File plik = new File("Pliczek1.txt");
		Scanner odczyt = new Scanner(plik);
		String text = odczyt.nextLine();
		System.out.println(text);
		String text2 = odczyt.nextLine();
		System.out.println(text2);		
		odczyt.close();
		
		PrintWriter zapis = new PrintWriter(plik); // moze byc nazwa pliku zamiast nazwy obiektu czyli "Pliczek1.txt"
		zapis.println("Zawartoœæ zapisu");
		
		zapis.close();
	}

}
