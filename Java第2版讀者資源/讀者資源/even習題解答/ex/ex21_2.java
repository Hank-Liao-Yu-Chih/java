class HorseRacing extends Thread {					// �~��Thread���O
	private String name;
	HorseRacing(String name) {						// �غc��k
		super(name);								// �]�w�W��
	}
	public void run() {								// �w�qrun��k
		for (int i = 1; i <= 15; i++) 
			System.out.println(getName() + " ���b�]�� " + i + " ��  ... ");
	}
}
public class ex21_2 {	
    public static void main(String args[]){
		HorseRacing t1 = new HorseRacing("Horse1");	// �إ߰��������
		HorseRacing t2 = new HorseRacing("Horse2");	// �إ߰��������
		HorseRacing t3 = new HorseRacing("Horse3");	// �إ߰��������
		HorseRacing t4 = new HorseRacing("Horse4");	// �إ߰��������
		HorseRacing t5 = new HorseRacing("Horse5");	// �إ߰��������
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start(); 		
	}
}

