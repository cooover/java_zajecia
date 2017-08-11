package j68;

public class Testowa {

	public static void main(String[] args) {
		Punkt2D p11 = new Punkt2D();
		p11.print();
		p11.move(-2, 4);
		p11.print();
		Punkt2D p12 = new Punkt2D(2,4);
		p12.print();
		p12.move(-2, 4);
		Punkt3D p1 = new Punkt3D();
		p1.print();
		p1.move(-2, 4);
		p1.print();
		Punkt3D p2 = new Punkt3D(3,5,5);
		p2.print();
		p2.move(-2,4,6);
		p2.print();
	}

}
