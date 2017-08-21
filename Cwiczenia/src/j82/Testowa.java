package j82;

/* Stw�rz klas� Book, kt�ra b�dzie mia�a pola nazwa, autor, rokWydania.
Odczytaj z pliku dane nazwa, autor, rokWydania kt�re b�d� przedzielone przecinkiem i stw�rz obiekty klasy Book na podstawie danych odczytanych
z pliku. Nast�pnie wypisz dane wszystkich stworzonych obiekt�w typu Book. */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Testowa {
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Book> myBooks = new ArrayList<>();
		File myFile = new File("Ksiazki.txt");
		Scanner odczyt = new Scanner(myFile);
		odczyt.useDelimiter(",|\r?\n");
		while(odczyt.hasNextLine()) {
			String odczytNazwa = odczyt.next(); // odczytam z aktualnego wiersza pierwsza pozycje ktora zostala usieta delimiterem
			String odczytAutor = odczyt.next(); 
			String odczytRok = odczyt.next(); 
			
			Book nextBook = new Book(odczytNazwa, odczytAutor, odczytRok);
			myBooks.add(nextBook);
		}
		System.out.println("Moje ksi��ki: ");
		System.out.println("-------------------");
		for(Book b:myBooks) {
			System.out.println("Nazwa: "+b.getNazwa()+"\nAutor: "+b.getAutor()+"\nRok wydania: "+b.getRok());
			System.out.println("-----------------------");
		}
		odczyt.close();
	}

}
