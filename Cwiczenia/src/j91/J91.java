package j91;
/* Napisz program pobieraj�cy od u�ytkownika liczb�. Je�eli u�ytkownik wpisze znak w miejsce liczby program powinien obd�u�y� wyj�tek i wykona� si� 
 ponownie oraz poprosi� o poprawne wpisanie warto�ci. */
 
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
			System.out.println("Podaj liczb� lub zako�cz - Q: ");
			try {
			liczba = input.nextInt();
			System.out.println("Poda�e� liczb� "+liczba);
			error = false;
			} catch(InputMismatchException e) {
				if(input.hasNext("Q")) { 
					break;
				}
				System.out.println("Nie poda�e� liczby ca�kowitej. Popraw warto��!");
				input.nextLine();
			}
		}
		System.out.println("KONIEC");
		input.close();
	}

}
