package TypySekwencyjne;

public class testTablice {

	public static void main(String[] args) {
		
		int[][] tab = new int[3][3];
		tab[0][0] = 1;
		tab[0][1] = 2;
		
		int[][] tab2 = { {1,2,3}, {4,5,6}, {7,8,9} };
		for(int i=0; i<tab2.length; i++ ) {
			for(int j=0; j<tab2.length; j++) {
				System.out.print(tab2[i][j]);
			}
			System.out.println();
		}
		
		String[][][] tab3 = 	{
								{{"a1","a2"}, {"a3","a4"}},
								{{"b1","b2"}, {"b3","b4"}}
								};
		System.out.println(tab3[0][0][0]);
		System.out.println(tab3[1][0][1]);
		System.out.println(tab2.length);//dlugosc pierwszego wymiaru
		System.out.println(tab2[1].length);// dlugosc drugiego wymiaru (nie ma znaczenia czy w kwadratowym nawiasie bedzie 0,1, czy 2..)
		int[][] tab4 = { {1,2,3,4,5}, {4,5,6,4,5}, {7,8,9,4,5} };
		for(int i=0; i<tab4.length; i++ ) {
			for(int j=0; j<tab4[0].length; j++) {
				System.out.print(tab4[i][j]);
			}
			System.out.println();
		}
		System.out.println(tab4.length);
		System.out.println(tab4[1].length);
		//tablica z imionami i nazwiskami
		String[] firstNames = {"Karol", "Basia", "Kasia"};
		String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};
		String[][] firstLast = {firstNames, lastNames};
		/*for(int i=0;i<firstNames.length; i++) {
			for(int j=0; j<lastNames.length;j++) {
				if(i== j) {
				System.out.print(firstNames[i]+" "+lastNames[j]);
				}
			}
			System.out.println();
		}*/
		for(int i=0;i<firstNames.length; i++) {
				System.out.print(firstLast[0][i]);
				System.out.print(" ");
				System.out.print(firstLast[1][i]);
				System.out.println();
		}
	}
}


