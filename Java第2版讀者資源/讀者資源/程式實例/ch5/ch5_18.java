import java.util.Scanner;
public class ch5_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("�п�J�褸�X�ͦ~ : ");
		int year = scanner.nextInt();
		year -= 1900;
		switch (year % 12) {
			case 0: System.out.printf("�A���ͨv�O : ��"); break;
			case 1: System.out.printf("�A���ͨv�O : ��"); break;
		    case 2: System.out.printf("�A���ͨv�O : ��"); break;
			case 3: System.out.printf("�A���ͨv�O : ��"); break;
			case 4: System.out.printf("�A���ͨv�O : �s"); break;
		    case 5: System.out.printf("�A���ͨv�O : �D"); break;
			case 6: System.out.printf("�A���ͨv�O : ��"); break;
			case 7: System.out.printf("�A���ͨv�O : ��"); break;
		    case 8: System.out.printf("�A���ͨv�O : �U"); break;
			case 9: System.out.printf("�A���ͨv�O : ��"); break;
			case 10: System.out.printf("�A���ͨv�O : ��"); break;
		    case 11: System.out.printf("�A���ͨv�O : ��"); break;
		}			
	}
}

