
public class StringLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		capitalize("kevin");
		wheresWaldo("Stripped waldo");
		firstThingFirst("doggy", "cat");
		soLong("bean", "pea");
		reverse("abcdefg");
		afterMath("Good math class");
		letterSize("Java");
	}

	public static void capitalize(String a) {
		String s1 = a.substring(0, 1).toUpperCase();
		String s2 = a.substring(1).toLowerCase();
		System.out.println(s1 + s2);

	}

	public static void wheresWaldo(String str) {
		int hereIsWaldo = str.indexOf("waldo");
		System.out.println(hereIsWaldo);
	}

	public static void firstThingFirst(String name1, String name2) {

		if (name1.equals(name2)) {
			System.out.println(name1 + " " + name2);
		} else {
			System.out.println(name2 + " " + name1);
		}

	}

	public static void reverse(String str) {

		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
	}

	public static void soLong(String a, String b) {
		int b1 = b.length();
		int a1 = a.length();

		if (a1 < b1) {
			System.out.println(b);
		} else if (a1 == b1) {
			System.out.println("a1,b1");
		} else {
			System.out.println(a);
		}

	}

	public static void afterMath(String phrase) {
		String s1  = phrase.substring(2);;
		if (s1.contains("math"))
			System.out.println(s1.substring(2));

	}

	public static void letterSize(String j) {
		String kev = "";
		for (int i = 0; i < j.length(); i++) {
			System.out.println("\n" + j.charAt(i));
		}
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


