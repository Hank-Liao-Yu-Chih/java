abstract class MyMath {									// ��H���O
	abstract int add(int num1, int num2);				// ��Hadd��k
	abstract int add(int num1, int num2, int num3);		// ��Hadd��k
	abstract int mul(int num1, int num2);				// ���k
	abstract int mul(int num1, int num2, int num3);		// ���k
	void output() {										// ���鴶�q��k
		System.out.println("�ڪ��p�⾹");
	}
}
class MyTest extends MyMath {							// �w�qMyMath�l���OMyTest
	public int add(int num1, int num2) {				// ���s�w�qadd��k
		return num1 + num2;
	}
	public int add(int num1, int num2, int num3) {		// ���s�w�qadd��k
		return num1 + num2 + num3;
	}
	public int mul(int num1, int num2) {				// ���s�w�qmul��k
		return num1 * num2;
	}
	public int mul(int num1, int num2, int num3) {		// ���s�w�qmul��k
		return num1 * num2 * num3;
	}
}
public class ex16_4 {
	public static void main(String[] args) {
		MyMath obj = new MyTest();				// Upcasting
		obj.output();
		System.out.println("�[�k���G : " + obj.add(3, 8));
		System.out.println("�[�k���G : " + obj.add(3, 8, 10));
		System.out.println("���k���G : " + obj.mul(3, 8));
		System.out.println("���k���G : " + obj.mul(3, 8, 10));
	}
}

