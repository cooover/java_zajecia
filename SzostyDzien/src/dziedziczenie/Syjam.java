package dziedziczenie;

public class Syjam extends Cat{
	
	public static void main(String[] args) {
		Syjam s1 = new Syjam();
		s1.umaszczenie = "bia³y";
		s1.liczbaNog = 4;
		System.out.println(s1.umaszczenie + " "+s1.liczbaNog);
		s1.makeSound();
	}
	
}
