public class ch12_19 {
	public static void main(String[] args) {
		String str1 = "¯«óç";
		String str2 = "«L«Q";
		String str3 = str1.concat(str2);
		String str4 = str1 + str2;
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);		
	}
}

