import java.util.Scanner;
public class ch5_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("�п�J���b�t�� : ");
		double v = scanner.nextDouble();
		
		if (v < 7.9)
			System.out.println("�H�y�ìP�L�k�i�J�Ӫ�");
		else if (v == 7.9)
			System.out.println("�H�y�ìP�i�H��¶�a�y�@��ιB��");
		else if (v > 7.9 && v < 11.2)
			System.out.println("�H�y�ìP�i�H��¶�a�y�@���ιB��");
		else if (v >= 11.2 && v < 16.7)
			System.out.println("�H�y�ìP�i�H��¶�Ӷ�����");
		else
			System.out.println("�H�y�ìP�i�H�����Ӷ��t");		
	}
}

