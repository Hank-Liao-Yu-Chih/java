class Car {
	private int maxSpeed;
	private int year;
	private String brand;
	private String color;	
	public void setMaxSpeed(int maxSpeed) {			// �]�w�̰��t�פ�k
		this.maxSpeed = maxSpeed;
	}
	public void setYear(int year) {					// �]�w�����~��
		this.year = year;
	}
	public void setBrand(String brand) {			// �]�w���l�~�P��k
		this.brand = brand;
	}
	public void setColor(String color) {			// �]�w���l�C���k
		this.color = color;
	}
	public void printCarInfo() {
		System.out.println("�����~�P : " + brand +
		                   "\n�����~�� : " + year + 
						   "\n���l�̰��ɳt : " + maxSpeed +
						   "\n���l�~�[�C�� : " + color);
	}
}
class Sentra extends Car {							// �~��Car���O
	public void SentraShow() {						// Sentra���O�ۦ���k
		Engine sentraEngine = new Engine();			// Composition
		sentraEngine.starting();					// �����Ұ�
		sentraEngine.running();						// �����B��
		sentraEngine.stopping();					// ��������
	}
}
class Engine {										// �OSentra���O���ݩ�
	public void starting() {						// Engine���O�ۦ���k
		System.out.println("�����Ұ�");
	}
	public void running() {							// Engine���O�ۦ���k
		System.out.println("�����B��");
	}
	public void stopping() {						// Eigine���O�ۦ���k
		System.out.println("��������");
	}
}
public class ex14_6 {
	public static void main(String[] args) {
		Sentra sentra = new Sentra();		
		sentra.setYear(2020);						// �ϥ��~��Car��k
		sentra.setBrand("BMW");						// �ϥ��~��Car��k
		sentra.setMaxSpeed(220);					// �ϥ��~��Car��k
		sentra.setColor("�Ŧ�");					// �ϥ��~��Car��k
		sentra.printCarInfo();						// �~��Car��k�C�L��T
		sentra.SentraShow();						// �i�ܤ����B�@
	}
}

