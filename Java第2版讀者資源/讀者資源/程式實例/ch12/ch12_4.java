public class ch12_4 {
	public static void main(String[] args) {
		char ch1 = '\n';
		System.out.println("\\n 琌北じ" + Character.isISOControl(ch1));
		ch1 = '\t';
		System.out.println("\\t 琌北じ" + Character.isISOControl(ch1));
		System.out.println("@   琌北じ" + Character.isISOControl('@'));
		System.out.println("%   琌北じ" + Character.isISOControl('%'));
	}
}

