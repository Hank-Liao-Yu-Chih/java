import java.util.Scanner;
public class ex10_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�Ĥ@�Ӯy�Ъ��n�� : ");
		double x1 = scanner.nextDouble();					  
		System.out.print("�п�J�Ĥ@�Ӯy�Ъ��g�� : ");
		double y1 = scanner.nextDouble();
		System.out.print("�п�J�ĤG�Ӯy�Ъ��n�� : ");
		double x2 = scanner.nextDouble();					  
		System.out.print("�п�J�ĤG�Ӯy�Ъ��g�� : ");
		double y2 = scanner.nextDouble();
		double r = 6371;									// �a�y�b�|
		
		double d;
		d = r * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+
		                  Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*
			              Math.cos(Math.toRadians(y1-y2)));
		
		System.out.println("distance = " + d);				
	}
}

