interface Bird {						// �w�qBird����
	void birdFly();						// ��HbirdFly��k
}
interface Airplane {					// �w�qAirplane����
	void airplaneFly(); 				// ��HairplaneFly��k
}
interface FlyingBall {					// �w�qFlyingBall����
	void ballFly(); 					// ��HballFly��k
}
class Fly implements Bird, Airplane, FlyingBall {	// �w�qFly���O��@Bird,Airplane,FayingBall
	public void birdFly() {				// ��@birdFly��k
		System.out.println("���ίͻH��");	
	}
	public void airplaneFly() {			// ��@airplaneFly��k
		System.out.println("�����Τ�����");	
	}
	public void ballFly() {				// ��@ballFly��k
		System.out.println("����y�βy��");	
	}
}
public class ex17_4 {
	public static void main(String[] args) {
		Fly obj = new Fly();			// �إ�obj����
		obj.birdFly();
		obj.airplaneFly();
		obj.ballFly();
	}
}

