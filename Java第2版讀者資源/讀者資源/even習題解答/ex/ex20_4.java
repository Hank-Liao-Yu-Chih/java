import java.util.*;
public class ex20_4 {
	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		for ( ; ; ) {
			System.out.printf("�п�J2�Ӿ��(�Ʀr���Ϊťչj�}) : ");
			try {
				x1 = scanner.nextInt();
				x2 = scanner.nextInt();
				System.out.println("�Ʀr���k���G�O : " + (x1 / x2));
			}
			catch(ArithmeticException e) {
				System.out.println("���Ƭ�0�����`" + e);
			}
			catch(InputMismatchException e) {
				System.out.println("��J����������~" + e);
				String str = scanner.nextLine(); 			// Ū���ѤU���~�r��
			}
			System.out.printf("�O�_�~��(y/n) : ");
			char ch = scanner.next().charAt(0);
			if (ch == 'n')
				break;
		}
		System.out.println("�{������");
	}
}

