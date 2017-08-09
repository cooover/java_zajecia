package obiekty;

public class TestObiekty {
	static String p = "zmienna globalna";
	
	static void info() {
		int b = 2;
		if(true) {
			int c = 3;
		}
		System.out.println("Jestem w metodzie info");
		System.out.println("w info (p): "+p);
	}
	
	public static void main(String[] args){
		int a = 1;
		for(int i = 1; i <= 9; i++) {
			// zakres lokalny w petli for
			System.out.println("w pêtli (i): " +i);
			a++;
			System.out.println("wewn¹trz (a): "+a);
		}
		// zmienna i nie jest widoczna poza petla
		// System.out.println(i);
		System.out.println("na zewn¹trz (a): "+a);
		System.out.println("w main (p): "+p);
		// wywolanie metody
		info();
	}

}
