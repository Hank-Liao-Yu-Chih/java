public class ch10_14 {
	public static void main(String[] args) {
		double r = 6371;									// �a�y�b�|
		double x1 = 22.2838; 								// ������ɨ����n��
		double y1 = 114.1731; 								// ������ɨ����g��
		double x2 = 25.0452; 								// �x�_�����n��
		double y2 = 121.5168; 								// �x�_�����g��
		double d;
		d = r * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+
		                  Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*
			              Math.cos(Math.toRadians(y1-y2)));
		
		System.out.println("distance = " + d);				
	}
}

