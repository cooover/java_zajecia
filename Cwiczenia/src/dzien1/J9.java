package dzien1;

public class J9 {

	public static void main(String[] args) {
		String napis1 = "tUtAj ";
		String napis2 = "JeSt ";
		String napis3 = napis1+napis2;
		StringBuffer napis4 = new StringBuffer(napis3);
		napis4.append("bardzo goraco");
		System.out.println(napis4.toString().length());
		System.out.print(napis3.charAt(2)); 
		System.out.println(napis3.charAt(5)); 
		System.out.println(napis4.toString().charAt(napis4.toString().length()-3));
	}

}
