package dzien1;

public class J10 {

	public static void main(String[] args) {
		String napis1 = "tUtAj";
		String napis2 = "JeSt";
		String napis3 = napis1+" " +napis2;
		StringBuffer napis4 = new StringBuffer(napis3);
		napis4.append("bardzo goraco");
		System.out.println(napis4.toString().substring(0, napis1.length()+napis2.length()+1));

	}

}
