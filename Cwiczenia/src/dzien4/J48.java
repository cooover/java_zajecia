package dzien4;

public class J48 {

	public static void main(String[] args) {
		int[][] tab = new int[10][10];
		
		for (int i =0 ; i<10; i++) {
			for (int j = 0; j<10; j++) {
				tab[i][j]=(i+1)*(j+1);
				System.out.print(tab[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
