import myMath.*;								// �̻ݨD���O�ŧi
import myMath.subMath.*;						// �̻ݨD���O�ŧi
import myMath.subMath.divMath.*;				// �̻ݨD���O�ŧi
import java.util.Scanner;
public class ex19_4 {					
	public static void main(String args[]){
		int x, y;
		Scanner scanner = new Scanner(System.in);		
		System.out.print("�п�J��1�Ӿ�� x : ");
		x = scanner.nextInt();				
		System.out.print("�п�J��2�Ӿ�� y : ");
		y = scanner.nextInt();			
		
		CalAdd obj1 = new CalAdd();
		CalSub obj2 = new CalSub();
		CalMul obj3 = new CalMul();
		CalDiv obj4 = new CalDiv();
		System.out.println("x + y = " + obj1.add(x, y));	// ����[�k�B��
		System.out.println("x - y = " + obj2.sub(x, y));	// �����k�B��
		System.out.println("x * y = " + obj3.mul(x, y));	// ���歼�k�B��
		System.out.println("x / y = " + obj4.div(x, y));	// �����ư��k�B��
	}
}

