package dzien4;

import java.util.Random;

public class J43 {

	public static void main(String[] args) {
		int[] tab = new int[10];
		Random gen = new Random();
		for(int i=0;i<tab.length;i++) {
			tab[i]=gen.nextInt(20)-10;
		}
		for (int j:tab) {
			System.out.print(j+" ");
		}
		int w = tab[0];
		for (int j:tab) {
			if(j>w) {
				w=j;
			}
		}
		System.out.println();
		System.out.println("Najwi�kszy element tablicy to: "+w);
		int m = tab[0];
		for (int j:tab) {
			if(j<m) {
				m=j;
			}
		}
		System.out.println("Najwi�kszy element tablicy to: "+m);
		float suma = 0;
		for (int j:tab) {
			suma = suma+j;
		}
		float srednia = suma/tab.length;
		System.out.println("�rednia  = "+srednia);
		int w_od_sr=0;
		int m_od_sr=0;
		for (int j:tab) {
			if(j<srednia) {
				m_od_sr++;
			} else if(j>srednia){
				w_od_sr++;
			}
		}
		System.out.println("Liczba element�w wi�kszych od �redniej: "+w_od_sr+" a liczba element�w mniejszych od �redniej: "+m_od_sr);
		System.out.println("Odwrotna kolejno��:");  
		for (int j =tab.length-1; j>=0; j--) {
			System.out.print(tab[j]+" ");
		}
	}
}
