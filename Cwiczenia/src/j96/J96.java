package j96;

import java.io.FilterInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Napisz program w kt�rym u�ytkownik wpisuje ci�g znak�w a potem mo�e wy�wietli� znak z podanego indeksu. Zagwarantuj dzia�anie programu bez 
wzgl�du na wpisywane dane przez u�ytkownika.
*/
public class J96 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		String [] liczby = new String[10];
		String dec = "";
		int index;
		int i = 0;
		while(true) {
			try {
			System.out.println("Podaj element tablicy lub wci�nij Q aby wyj��: ");
			dec=input.nextLine();
			if(dec.equals("Q")){
				System.out.println("KONIEC WPISYWANIA");
				break;
			} else {
				if(i!=liczby.length) {
				liczby[i]=dec;
				i++;
				} 
				if(i==liczby.length){
					throw new ArrayIndexOutOfBoundsException();
				}
			}
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Tablica si� sko�czy�a.");
				break;
			}
		}
		while(true) {
			try {
			System.out.println("Wybierz element tablicy, kt�ry chcesz wy�wietli� lub wci�nij 0 aby wyj��");
			index = input.nextInt();
			if(index==0){
				System.out.println("KONIEC");
				break;
			}
			if(index>i){
				throw new ArrayIndexOutOfBoundsException();
			}
			System.out.println(liczby[index-1]);
			} catch(InputMismatchException e) {
				System.out.println("Nale�y poda� liczb� ca�kowit�");
				input.nextLine();
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Podany indeks wykracza poza rozmiar tablicy");
				input.nextLine();
			}
		}
		input.close();
	}

}
