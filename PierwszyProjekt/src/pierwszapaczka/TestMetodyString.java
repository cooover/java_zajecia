package pierwszapaczka;

public class TestMetodyString {

	public static void main(String[] args) {
		String words = " Jeden dwa trzy cztery pi�� sze�� siedem ";
		String sub1 = words.substring(2, 7);
		String sub2 = words.replaceAll("dwa", "hehe");
		String sub3 = words.trim();
		char charat = words.charAt(2);
		String[] tab = {};
		System.out.println(words);
		System.out.println("words.substring(2, 7)");
		System.out.println(sub1);
		System.out.println("words.replaceAll(\"dwa\", \"hehe\")");
		System.out.println(sub2);
		System.out.println("words.trim()");
		System.out.println(sub3);
		System.out.println("words.charAt(2)");
		System.out.println(charat);
		StringBuffer nowyBuffer = new StringBuffer(words);
		nowyBuffer.append("dodany ci�g znak�w");
		System.out.println(nowyBuffer.toString());
		System.out.println(tab);
	}

}
