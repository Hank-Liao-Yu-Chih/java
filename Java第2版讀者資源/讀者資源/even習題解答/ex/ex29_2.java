import javax.swing.*;									// �פJ���O�w
import java.awt.*;	
import java.awt.event.*;									
public class ex29_2 {	
	static JFrame jfrm = new JFrame("ex29_2");
	static JButton btn1 = new JButton("Yellow");
	static JButton btn2 = new JButton("Green");
	static JButton btn3 = new JButton("Blue");
	static Container ct  = jfrm.getContentPane();		// ���o���e���檫��
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			JButton btn = (JButton) e.getSource();		// ���o�ҫ�����
			if (btn == btn1)
				ct.setBackground(Color.yellow);			// �I����e����
			else if(btn == btn2)
				ct.setBackground(Color.green);			// �I����e���
			else if(btn == btn3)
				ct.setBackground(Color.blue);			// �I����e�Ŧ�			
		}
	}
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());					// �]�w�y�ʪ����t�m
		ct.add(btn1);									// �b���e����إ߫��s
		ct.add(btn2);									// �b���e����إ߫��s
		ct.add(btn3);									// �b���e����إ߫��s
		btn1.addActionListener(new myListener());		// --- ���U
		btn2.addActionListener(new myListener());		// --- ���U
		btn3.addActionListener(new myListener());		// --- ���U
		ct.setBackground(Color.green);					// ���e���橳��O���
		jfrm.setSize(300, 160);							// �e300, ��160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);							// ��ܵ���
	}
}

