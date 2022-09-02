interface Shape {										// �w�q����Shape
	double PI = 3.14;									// �w�q������Ʀ���
	double vulumn( );									// �w�q��H��k
}
class Cube implements Shape {							// �w�qCube��@Shape
	protected double height, width, length;							
	Cube(double height, double width, double length) {	// �غc��k		
		this.height = height;
		this.width = width;
		this.length = length;
	}
	public double vulumn() {							
		return height * width * length;
	}
}
class Cylinder implements Shape {						// �w�qCylinder��@Shape
	protected double r, height;							// �w�q�b�|r			
	Cylinder(double r, double height) {					// �غc��k		
		this.r = r;
		this.height = height;
	}
	public double vulumn() {							
		return PI * r * r * height;						// PI�Opublic�i�H������
	}
}
public class ex17_2 {
	public static void main(String[] args) {
		Cube cube = new Cube(2, 3, 10);					// �w�qcube����
		Cylinder cylinder = new Cylinder(2, 10);		// �w�qcyliner����
		System.out.println("��������n     : " + cube.vulumn());
		System.out.println("��W��n         : " + cylinder.vulumn());
	}
}

