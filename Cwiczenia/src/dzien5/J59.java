package dzien5;

public class J59 {
	double p1;
	char p2;
	
	public J59(double p1) {
		super();
		this.p1 = p1;
		System.out.println(p1);
	}

	public J59(char p2) {
		super();
		this.p2 = p2;
		System.out.println(p2);
	}
	
	public J59(double p1, char p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		System.out.println(p1+" "+p2);
	}

	public J59(char p2, double p1) {
		super();
		this.p2 = p2;
		this.p1 = p1;
		System.out.println(p2+" "+p1);
	}
	public static void main(String[] args) {
		J59 obiekt1 = new J59(2);
		J59 obiekt2 = new J59('h');
		J59 obiekt3 = new J59(2,'h');
		J59 obiekt4 = new J59('h',2);
	
		

	}

}
