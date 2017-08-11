package j68;

public class Punkt2D {
	int x,y;

	public Punkt2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punkt2D(){}
	
	public void move(int a, int b) {
		x=x+a;
		y=y+b;
	}
	public void print() {
		System.out.println("Wspó³rzêdne punktu: ["+x+","+y+"]");
	}
	

}
