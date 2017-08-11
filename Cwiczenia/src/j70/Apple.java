package j70;

public class Apple extends Fruit {
	String odmiana;

	public Apple(String odmiana) {
		kategoria = "Jab³ko";
		this.odmiana = odmiana;
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("Odmiana: "+odmiana);
	}
}
