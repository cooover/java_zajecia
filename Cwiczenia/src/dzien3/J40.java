package dzien3;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J40 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.print("Podaj wysoko�� choinki ");
		int h = input.nextInt();
		
		for(int w =0;w<=h;w++) {
			for(int j=1; j<=h-w; j++) {
				System.out.print(" ");
			}
			for(int i=h; i>(h-2*w+1);i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
	}

}
