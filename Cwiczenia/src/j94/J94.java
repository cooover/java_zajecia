package j94;

import java.io.FilterInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Napisz program który zbiera informacje o u¿ytkownikach imiê, nazwisko, wiek. Je¿eli któraœ z wartoœci jest b³êdna nale¿y zwróciæ wyj¹tek o tym ¿e
wartoœæ jest b³êdna. Np.. puste imiê itd.. Nastêpnie po wyœwietleniu komunikatu wyj¹tku nale¿y ponowiæ próbê pozyskania danej która by³a b³êdna. 
Na koniec wszystkie dane o wpisanych u¿ytkownikach trzeba zapisaæ do pliku. I wyœwietliæ zawartoœæ pliku. */
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
			System.out.println("Podaj imiê: ");
			try {
				imie = input.nextLine();
				if (imie.isEmpty()) {
					throw new NullPointerException();
				}
				u1.setImie(imie);
				break;
			}catch(NullPointerException e) {
				System.out.println("Imiê nie mo¿e byæ puste!");
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
				System.out.println("Nazwisko nie mo¿e byæ puste!");
			}
		}
		while(true) {
			System.out.println("Podaj wiek: ");
			try {
				wiek = input.nextInt();
				u1.setWiek(wiek);
				break;
			} catch(InputMismatchException e) {
				System.out.println("Wiek musi byc liczb¹!");
				input.nextLine();
			}
		}
		System.out.println(u1.getImie()+" "+u1.getNazwisko()+", "+u1.getWiek());
		input.close();
	}

}
