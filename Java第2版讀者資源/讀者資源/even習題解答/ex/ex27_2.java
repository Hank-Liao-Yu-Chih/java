import java.awt.*;									// �פJ���O�w
import java.awt.event.*;							// �]����ActionEvent���O
public class ex27_2 {	
	static Frame frm = new Frame("ex27_2");
	static Button btn1 = new Button("����");
	static Button btn2 = new Button("�ڵ�");
	static Button btn3 = new Button("����");
	static TextField txt = new TextField("                 ");
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			Button btn = (Button) e.getSource();		// ���o�ҫ�����
			if (btn == btn1)
				txt.setText("�A���F�����s, �P�§A");
			else if(btn == btn2)
				txt.setText("�A���F�ڵ��s, �P�§A");
			else {
				txt.setText("�A���F�����s, �U�^��");
				System.exit(0);							// �{��������������
			}	
		}
	}
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());				// �y�ʦ������t�m
		frm.setSize(200, 120);							// �e200, ��120
		btn1.addActionListener(new myListener());		// --- ���U
		btn2.addActionListener(new myListener());		// --- ���U
		btn3.addActionListener(new myListener());		// --- ���U
		
		txt.setBounds(80, 80, 150, 120);
		
		frm.add(btn1);									// �N�����s�[�J����	
		frm.add(btn2);									// �N�ڵ��s�[�J����
		frm.add(btn3);									// �N�����s�[�J����
		frm.add(txt);
		frm.setVisible(true);							// ��ܵ���	
	}	
}

