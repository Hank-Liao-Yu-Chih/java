import java.util.Scanner;
public class ex12_2 {
	public static void main(String[] args) {
		char ch;
		String str = "abcdefghijklmnopqrstuvwxyz";
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("�п�J�r�� : ");
		ch = scanner.next().charAt(0);

		int index = str.indexOf(ch);
		if (index != -1)
			System.out.println("���ަ�m = " + index);
		else
			System.out.println("��J���~");
	}
}

