import java.util.*;
public class ex24_4 {
    public static void main(String[] args) {
		char ch;
		var map = new HashMap<String, String>(); 
		map.put("Taipei", "�x�_");
		map.put("Tokyo", "�F��");
		map.put("Singapore", "�s�[�Y");
		map.put("Chicago", "�ۥ[��");
		map.put("Beijing", "�_��");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			System.out.printf("�п�J�d���� : ");
			String key = scanner.next();
		    
			if (map.containsKey(key))
				System.out.println(map.get(key));
			else
				System.out.println("�d�L���r");
			System.out.printf("�O�_�~��(y/n) : ");
			ch = scanner.next().charAt(0);
			if (ch == 'n')
				break;
		}
    }
}

