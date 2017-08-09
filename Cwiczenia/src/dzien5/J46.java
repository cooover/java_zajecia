package dzien5;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Podaj liczbê ca³kowit¹: ");
		int a = input.nextInt();
		int[] tab = new int[32];
		int i=tab.length-1;
		while (i!=0){
			tab[i]=a%2;;
			a=a/2;
			i--;
		}
		for(int j :tab) {
			System.out.print(j+" ");
		}
		input.close();
	}
}