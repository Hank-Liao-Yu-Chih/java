public class ex13_2 {
	public static void main(String[] args) {
		String str1 = "I love Java";
		String str2 = "0952-909-090";
		String str3 = "134-3981-1391";
		String pattern = "\\d{3}-\\d{4}-\\d{4}";
		System.out.println("I love Java :�O���������X" + str1.matches(pattern));
		System.out.println("0952-909-090:�O���������X" + str2.matches(pattern));
		System.out.println("134-3981-1391:�O���������X" + str3.matches(pattern));
	}
}

