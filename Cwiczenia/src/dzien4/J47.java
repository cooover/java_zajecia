package dzien4;

public class J47 {

	public static void main(String[] args) {
		int[][] tab = new int[3][3];
		//int[][] tab2 = {{1,2,3},{4,5,6,},{7,8,9}};
		int[][] wyn = new int[3][3];
		for(int i=0; i<tab.length; i++) {
			for(int j=0; j<tab.length; j++) {
				if(i==j) {
					tab[i][j]=1;
				}
			}
		}
		for(int i=0; i<tab.length; i++) {
			for(int j=0; j<tab.length; j++) {
				wyn[i][j]=tab[i][j]+tab[i][j];
			}
		}
		for(int i=0; i<tab.length; i++ ) {
			for(int j=0; j<tab.length; j++) {
				System.out.print(tab[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("\t+");
		System.out.println();
		for(int i=0; i<tab.length; i++ ) {
			for(int j=0; j<tab.length; j++) {
				System.out.print(tab[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("\t=");
		System.out.println();
		for(int i=0; i<wyn.length; i++ ) {
			for(int j=0; j<wyn.length; j++) {
				System.out.print(wyn[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
