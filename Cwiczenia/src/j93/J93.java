package j93;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.util.Scanner;

public class J93 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		String path ="";
		boolean error = true;
		while(error) {
			System.out.println("Podaj œcie¿kê dostêpu do pliku J81: ");
			try {
			path = input.nextLine();
			File testFile = new File(path);
			Scanner odczyt = new Scanner(testFile);
			while(odczyt.hasNextLine()) {
				System.out.println(odczyt.nextLine());
			}
			error=false;
			odczyt.close();
			}catch(FileNotFoundException e) {
				System.out.println("Podano blêdn¹ œcie¿kê!");
			}
		}
		input.close();
	}

}
