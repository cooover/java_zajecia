package dzien4;

import java.util.Random;

public class J44 {

	public static void main(String[] args) {
		Random gen = new Random();
		int[] tab = new int[20];
		for(int i=0;i<tab.length;i++) {
			tab[i]=gen.nextInt(10)+1;
		}
		for (int j:tab) {
			System.out.print(j+" ");
		}
		System.out.println();
		for(int i=1; i<11; i++) {
			int w = 0;
			for(int j:tab) {
				if(i==j) {
					w++;
				}
			}
			if (w!=0) {
			System.out.println("Liczba " +i+" powtarza siê "+w+" razy.");	
			}
		}
		
	}

}
