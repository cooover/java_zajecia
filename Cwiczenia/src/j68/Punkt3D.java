package j68;

public class Punkt3D extends Punkt2D {
	int z;

	public Punkt3D(int x, int y, int z) {
		super(x, y); // wywolanie konstruktora z klasy nadrzednej
		this.z = z;
	}

	public Punkt3D() {
		super();
		this.z=0;
	}
	public void move(int a, int b, int c) {
		super.move(a, b); // wywolanie metody z klasy nadrzednej
		z=z+c;
	}
	public void print() {
		System.out.println("Wspó³rzêdne punktu: ["+x+","+y+","+z+"]");
	}

}
