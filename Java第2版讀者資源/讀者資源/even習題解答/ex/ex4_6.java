import java.util.Scanner;
public class ex4_6 {
	public static void main(String[] args) {
		int f;
		double c;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�п�J�ؤ�ū� : ");
		f = scanner.nextInt();
		c = (f - 32) * 5 / 9;
		System.out.printf("���ū׬O : %6.2f", c);
	}
}

