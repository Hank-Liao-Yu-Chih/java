public class ex12_6 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "Java";
		
		int val = str1.compareTo(str2);
		if (val == 0)			
			System.out.println("compareTo���G           : " + "true");
		else
			System.out.println("compareTo���G           : " + "false");
		val = str1.compareToIgnoreCase(str2);
		if (val == 0)	
			System.out.println("compareToIgnoreCase���G : " + "true");
		else
			System.out.println("compareToIgnoreCase���G : " + "false");
		System.out.println("equals���G              : " + str1.equals(str2));
		System.out.println("equalsIgnoreCase���G    : " + str1.equalsIgnoreCase(str2));	
	}
}

