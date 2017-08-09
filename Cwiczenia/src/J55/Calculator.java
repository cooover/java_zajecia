package J55;

public class Calculator {
	public void printType(int a) {
		System.out.println("int");
	}

	public void printType(double a) {
		System.out.println("double");
	}
	
	public int dodaj(int a, int b) {
		return a+b;
	}
	public int odejmij(int a, int b) {
		return a-b;
	}
	public int dodaj(int a, int b, int e) {
		return a+b+e;
	}
	public int odejmij(int a, int b, int e) {
		return a-b-e;
	}
	public double dodaj(double c, double d) {
		return c+d;
	}
	public double odejmij(double c, double d) {
		return c-d;
	}
	public double dodaj(double c, double d, double f) {
		return c+d+f;
	}
	public double odejmij(double c, double d, double f) {
		return c-d-f;
	}

	
}
