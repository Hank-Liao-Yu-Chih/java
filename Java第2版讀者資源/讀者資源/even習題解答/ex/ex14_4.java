class MyMath {										// �B�z��b�|�������
	protected int square(int x) {
		return x*x;
	}
}
class Cylinder {
	protected MyMath obj;							// Aggregation
	public double getVolume(int radius, int height) {
		obj = new MyMath();							// �إ�MyMath����
		int rSquare = obj.square(radius);			// �{���X�i���ƨϥ�
		return Math.PI*rSquare*height;				// �^�Ƕ�W��n
	}
}
public class ex14_4 {
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder();			// �إ�Cylinder����
		double volume = cylinder.getVolume(10, 5);	// �p���W��n
		System.out.printf("��W��n�O : %6.2f\n", volume);
	}
}

