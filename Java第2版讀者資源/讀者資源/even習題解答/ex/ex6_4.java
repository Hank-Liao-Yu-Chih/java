import java.util.Scanner;
public class ex6_4 {
	public static void main(String[] args) {
		int i;				
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("�п�J�s�ڥ��� : ");
		double money = scanner.nextDouble();	
		System.out.print("�п�J�s�ڦ~�� : ");
		int year = scanner.nextInt();
		System.out.print("�п�J�s�ڦ~�Q�v : ");
		double rate = scanner.nextDouble();
		
		for (i = 1; i <= year; i++){
			money = money * (1 + rate);
			System.out.printf("�� %d �~�����M %8.1f%n", i, money);
		}
	}
}

