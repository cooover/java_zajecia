package klasyAbstrakcyjne;

public class Jablka extends Owoce {
	String odmiana="nieznana";
	
	@Override
	public void printInfo() {
		System.out.println(owoce+" "+dojrzaly+" "+odmiana);
		
	}
	@Override
	public void przyklad() {
		System.out.println("z interfejsu");
		
	}	
	public void zmien(String odmiana) {
		this.odmiana = odmiana;
	}
	
	public static void main(String[] args) {
		Jablka j1 = new Jablka();
		j1.printInfo();
		j1.zmien("Ligol");
		j1.dojrzewanie();
		j1.printInfo();
		j1.przyklad();
	}



}
