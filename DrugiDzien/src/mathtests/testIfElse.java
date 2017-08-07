package mathtests;

public class testIfElse {

	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		int c = 5;
		if(a>b) {
			if(a>c) {
				System.out.println("A > B oraz A > C");
			}
			else {
				System.out.println("A > B ale A<C");
			}
		}
		else if(a==b){
			System.out.println("A==B");
		}
		else {
			System.out.println("A < B oraz A != B");
		}

	}

}
