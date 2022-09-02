public class ch12_5 {
	public static void main(String[] args) {
		char ch = '1';
		System.out.println("1 16秈い┮计" + Character.digit(ch, 16));
		System.out.println("9 16秈い┮计" + Character.digit('9', 16));
		System.out.println("A 16秈い┮计" + Character.digit('A', 16));
		System.out.println("F 16秈い┮计" + Character.digit('F', 16));
		System.out.println("G 16秈い┮计" + Character.digit('G', 16));
	}
}

