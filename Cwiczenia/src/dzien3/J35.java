package dzien3;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Poda liczbê: ");
		int A = input.nextInt();
		if(A>0) {
		int potega = 0;
		while(potega<=A) {
			System.out.print(Math.pow(2,potega)+" ");
			potega++;
		}
		}else {
			System.out.print("Liczba powinna byæ wiêksza od 0!");
		}
		input.close();
	}

}
