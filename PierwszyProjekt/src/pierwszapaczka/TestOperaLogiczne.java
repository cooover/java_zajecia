package pierwszapaczka;

public class TestOperaLogiczne {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		System.out.println("X>Y " + (x>y));
		System.out.println("X<Y " + (x<y));
		System.out.println("X!=Y " + (x!=y));
		System.out.println("X==Y " + (x==y));
		System.out.println(!(x>y));
		System.out.println((x>y)||(x<y));
		System.out.println((x>y)&&(x<y));
		int wynik = x<y?x:y;
		System.out.println(wynik);

	}

}
