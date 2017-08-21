package j84;
/* Napisz aplikację, która będzie pozwalała wczytać informacje o pracownikach firmy, albo pobierając je od użytkownika, albo wczytując je z dysku.
Klasy, które powinna posiadać aplikacja:
	Person - klasa reprezentująca osobę (imię nazwisko)
	Employee - klasa reprezentująca pracownika (imię, nazwisko, wypłata) - rozszerza klasę Person
	Company - klasa przechowująca tablicę pracowników, powinna móc przechowywać informacje o 3 pracownikach
	CompanyApp - klasa, która pozwala wczytywać dane od użytkownika i zapisać je na dysku lub odczytać dane z dysku i wyświetlić je na ekranie. */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CompanyApp {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Company comp = new Company();
		File plik = new File("pracownicy.txt");
		
		String end = "";
		int i = 0;
		
		while(true) {
			System.out.println("Co chcesz zrobić?\n(1) - zapis\n(2) - odczyt\n(3) - koniec");
			end = input.nextLine();
			if(end.equals("1")){      // zapis
				FileWriter zapisz = new FileWriter(plik, true); // dopisywanie do pliku -> true
				while(i<comp.getPracownicy().length) {
					Employee emp = new Employee();
					System.out.println("Podaj imię pracownika: ");
					end = input.nextLine();
					emp.setImie(end);
					zapisz.write(end+" ");
					System.out.println("Podaj nazwisko pracownika: ");
					end = input.nextLine();
					emp.setNazwisko(end);
					zapisz.write(end+", ");
					System.out.println("Podaj wypłatę pracownika: ");
					end = input.nextLine();
					emp.setWyplata(end);
					zapisz.write(end+"\n");
					i++;
				}
				zapisz.close();
			}else if (end.equals("2")){      // odczyt
				Scanner odczyt = new Scanner(plik);
				while(odczyt.hasNextLine()) {
					System.out.println(odczyt.nextLine());
				}
				odczyt.close();
	
			}else if (end.equals("3")){      // koniec
				break;
			}
		}
		input.close();

	}

}
