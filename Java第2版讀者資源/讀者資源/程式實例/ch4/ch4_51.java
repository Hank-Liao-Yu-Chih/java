import java.util.Scanner;
public class ch4_51 {
	public static void main(String[] args) {
		int c;
		double f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�п�J���ū� : ");
		c = scanner.nextInt();
		f = c * 9 / 5 + 32;
		System.out.printf("�ؤ�ū׬O : %6.2f", f);
	}
}

