import java.awt.*;							// �פJ���O�w
public class ex26_6 {	
	static Frame frm = new Frame("ch26_6");
	static Label lab = new Label("�w��i�JDeepMind�t��");
	static Label lab1 = new Label("�b�� : ");
	static Label lab2 = new Label("�K�X : ");
	static TextField txt1 = new TextField("Editable");
	static TextField txt2 = new TextField("marked by symbol");
	static Button btn1 = new Button("�T�w");
	static Button btn2 = new Button("����");
	public static void main(String[] args) {
		frm.setLayout(null);				// ���������t�m
		frm.setSize(300, 220);				// �e300, ��220
		frm.setBackground(Color.yellow); 	// �����I���O����
		lab.setForeground(Color.blue);		// ��r�O�Ŧ�
		lab.setLocation(30, 30);			// �]�w��r�϶�
		lab.setSize(150, 50);
		lab1.setForeground(Color.blue);		// ��r�O�Ŧ�
		lab1.setLocation(30, 80);			// �]�w��r�϶�
		lab1.setSize(50, 30);
		lab2.setForeground(Color.blue);		// ��r�O�Ŧ�
		lab2.setLocation(30, 120);			// �]�w��r�϶�
		lab2.setSize(50, 30);
			
		txt1.setBounds(80, 80, 150, 20);
		txt2.setBounds(80, 120, 150, 20);		
		txt2.setEchoChar('*');				// �]�wtxt3�H*���N��J
		btn1.setBounds(80, 160, 60, 40);	// �]�w���s��m�P�j�p
		btn2.setBounds(170, 160, 60, 40);	// �]�w���s��m�P�j�p
		frm.add(txt1);						// �Ntxt1�[�J����
		frm.add(txt2);						// �Ntxt2�[�J����
		frm.add(lab);
		frm.add(lab1);
		frm.add(lab2);
		frm.add(btn1);
		frm.add(btn2);
		frm.setVisible(true);				// ��ܵ���		
	}
}

