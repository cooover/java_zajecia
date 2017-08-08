package dzien4;

import java.util.Random;

public class J45 {

	public static void main(String[] args) {
		int[][] tab = new int[5][5];
		Random gen = new Random();
		int[][] wyn = new int[2][5];
		for(int i=0;i<tab.length;i++) {
			for(int j=0; j<tab[0].length;j++) {
				tab[i][j]=gen.nextInt(11)-5;
			}
		}
		for(int i=0; i<tab.length; i++ ) {
			for(int j=0; j<tab[0].length; j++) {
				System.out.print(tab[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------");
		int min = tab[0][0];
		for(int j=0;j<tab.length;j++) {
			for(int i=0; i<tab.length;i++) {
				if(tab[i][j]< min) {
					min=tab[i][j];
				}
			}
			wyn[0][j]=min;
			System.out.println("Minimun dla "+(j+1)+" kolumny: "+min);
			min=0;
		}
		int max = tab[0][0];
		for(int j=0;j<tab.length;j++) {

			for(int i=0; i<tab.length; i++) {
				if(tab[i][j]>=max) {
					max=tab[i][j];
				}
			}
			wyn[1][j]=max;
			System.out.println("Maksimum dla "+(j+1)+" kolumny: "+max);
			max=0;
		}
		for(int i=0; i<wyn.length; i++ ) {
			for(int j=0; j<wyn[0].length; j++) {
				System.out.print(wyn[i][j]+"\t");
			}
			System.out.println();
		}
	}
//zle dziala, sprawdzic w domu
		

	

}
