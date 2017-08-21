package j91;
/* Napisz program pobieraj¹cy od u¿ytkownika liczbê. Je¿eli u¿ytkownik wpisze znak w miejsce liczby program powinien obd³u¿yæ wyj¹tek i wykonaæ siê 
 ponownie oraz poprosiæ o poprawne wpisanie wartoœci. */
 
import java.io.FilterInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J91 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		int liczba=0;
		boolean error = true;
		while(error) {
			System.out.println("Podaj liczbê lub zakoñcz - Q: ");
			try {
			liczba = input.nextInt();
			System.out.println("Poda³eœ liczbê "+liczba);
			error = false;
			} catch(InputMismatchException e) {
				if(input.hasNext("Q")) { 
					break;
				}
				System.out.println("Nie poda³eœ liczby ca³kowitej. Popraw wartoœæ!");
				input.nextLine();
			}
		}
		System.out.println("KONIEC");
		input.close();
	}

}
