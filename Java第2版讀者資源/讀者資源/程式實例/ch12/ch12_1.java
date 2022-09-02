public class ch12_1 {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '5';		
		System.out.println("A 琌糶ダ " + Character.isUpperCase(ch1));
		System.out.println("A 琌糶ダ " + Character.isLowerCase(ch1));
		System.out.println("A 琌ダじ " + Character.isLetter(ch1));
		System.out.println("A 琌计じ " + Character.isDigit(ch1));
		System.out.println("5 琌计じ " + Character.isDigit(ch2));
		System.out.println("5 琌ダ┪计 " + Character.isLetterOrDigit(ch2));
		System.out.println("A 琌ダ┪计 " + Character.isLetterOrDigit(ch1));
	}
}

