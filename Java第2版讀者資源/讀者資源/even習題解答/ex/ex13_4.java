import java.util.Scanner;
import java.util.regex.*;
public class ex13_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String pattern = new String();		// ���W��F���r�ꪫ��
		String str = new String();			// ���զr�ꪫ��
		System.out.print("�п�J���W��F���r�� : ");
		pattern = scanner.next();
			
		while (true) {	
			System.out.print("�п�J���զr�� : ");
			str = scanner.next();	
			System.out.println("��ﵲ�G " + Pattern.matches(pattern, str));
			System.out.printf("�O�_�~��(y/n)? ");
			char torf = scanner.next().charAt(0);
			if (torf != 'y')
				break;
		}
	}
}

