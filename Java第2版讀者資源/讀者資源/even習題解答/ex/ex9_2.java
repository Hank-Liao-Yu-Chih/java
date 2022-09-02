class TaipeiBank {
	private String name;					// �}��̩m�W
	private int balance;					// �s�ڪ��B
	private double rate = 30.0;				// �ײv
	private double service_charge = 0.01;	// ����O�v
	public TaipeiBank(String name) {
		this.name = name;					// �]�w�}��̩m�W
		this.balance = 0;					// �]�w�}����B�O0
	}
	public void saveMoney(int money) {		// �s��
		this.balance += money;
	}
	public void withdrawMoney(int money) {	// ����
		this.balance -= money;
	}
	public double taiwan_to_usa(int nt) {	// ���׭p��
		if ( this.balance >= 10000 )		// �p�G�s�ڤj��ε���10000��
			this.service_charge = 0.008;	// ����O�v0.008
		return cal_rate(nt);
	}
	private double cal_rate(int nt) {		// �u��p�⴫�ת��B
		double result;
		result = (nt - nt * service_charge) / rate;	// ���׵��G
		return result;						// �^�Ǵ��׵��G
	}
	public void get_balance() {				// �C�X�}��̪��s�ھl�B
		System.out.println(name + " �ثe�s�ھl�B " + balance);
	}
}
public class ex9_2 {
	public static void main(String[] args) {
		TaipeiBank A = new TaipeiBank("Hung");
		int nt = 30000;
		int dollar = 5000;
		A.saveMoney(dollar);				// �s��5000
		System.out.println("��s�ڬO " + dollar);
		System.out.println(nt + " �x���i�H�I�� " + A.taiwan_to_usa(nt) 
							+ " ���� ");
		dollar = 15000;					
		A.saveMoney(dollar);				// �s��15000
		System.out.println("��s�ڬO " + dollar);
		System.out.println(nt + " �x���i�H�I�� " + A.taiwan_to_usa(nt) 
							+ " ���� ");
	}
}


