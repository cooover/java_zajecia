package j94;

import java.io.FilterInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Napisz program kt�ry zbiera informacje o u�ytkownikach imi�, nazwisko, wiek. Je�eli kt�ra� z warto�ci jest b��dna nale�y zwr�ci� wyj�tek o tym �e
warto�� jest b��dna. Np.. puste imi� itd.. Nast�pnie po wy�wietleniu komunikatu wyj�tku nale�y ponowi� pr�b� pozyskania danej kt�ra by�a b��dna. 
Na koniec wszystkie dane o wpisanych u�ytkownikach trzeba zapisa� do pliku. I wy�wietli� zawarto�� pliku. */
public class J94 {
	
	public void odczytString(String nazwaDanej) {
		
	}
	public void odczytInt(int nazwaDanej) {
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		String imie, nazwisko;
		int wiek;
		User u1 = new User();
		while(true) {
			System.out.println("Podaj imi�: ");
			try {
				imie = input.nextLine();
				if (imie.isEmpty()) {
					throw new NullPointerException();
				}
				u1.setImie(imie);
				break;
			}catch(NullPointerException e) {
				System.out.println("Imi� nie mo�e by� puste!");
			}
		}
		while(true) {
			System.out.println("Podaj nazwisko: ");
			try {
				nazwisko = input.nextLine();
				if (nazwisko.isEmpty()) {
					throw new NullPointerException();
				}
				u1.setNazwisko(nazwisko);
				break;
			}catch(NullPointerException e) {
				System.out.println("Nazwisko nie mo�e by� puste!");
			}
		}
		while(true) {
			System.out.println("Podaj wiek: ");
			try {
				wiek = input.nextInt();
				u1.setWiek(wiek);
				break;
			} catch(InputMismatchException e) {
				System.out.println("Wiek musi byc liczb�!");
				input.nextLine();
			}
		}
		System.out.println(u1.getImie()+" "+u1.getNazwisko()+", "+u1.getWiek());
		input.close();
	}

}
