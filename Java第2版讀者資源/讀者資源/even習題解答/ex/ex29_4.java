import javax.swing.*;								// �פJ���O�w
import java.awt.*;
import java.awt.event.*;										
public class ex29_4 {	
	static JFrame jfrm = new JFrame("ex29_4");
	static Container ct  = jfrm.getContentPane();	// ���o���e���檫��
	static JLabel lab1 = new JLabel();				// �w�q���D����
	static JLabel lab2 = new JLabel();				// �w�q�`���B����
	static JCheckBox jcb1 = new JCheckBox(); 		// �w�q�����Ѯ֨����
	static JCheckBox jcb2 = new JCheckBox();		// �w�q�׵��Ѯ֨����
	static JCheckBox jcb3 = new JCheckBox(); 		// �w�q���K�Ѯ֨����
	static JCheckBox jcb4 = new JCheckBox();		// �w�q�ֳJ���G�֨����
	static JCheckBox jcb5 = new JCheckBox();		// �w�q���z�֨����
	static JButton btn = new JButton("�R��");		// �w�q�R����s
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			int amount = 0;
			if (jcb1.isSelected()) 					// ������ 
				amount += 150;
			if (jcb2.isSelected()) 					// �׵���
				amount += 100;
			if (jcb3.isSelected()) 					// ���K�� 
				amount += 60;
			if (jcb4.isSelected()) 					// �ֳJ���G
				amount += 30;
			if (jcb5.isSelected()) 					// �ֳJ���G
				amount += 10;
			lab2.setText("�`���B : "+Integer.toString(amount));	
		}
	}	
	public static void main(String[] args) {
		ct.setLayout(null);							// �]�w�y�ʪ����t�mnull		
// �]�w����
		lab1.setText("�\���p���t��");
		lab2.setText("�`���B : ");
// �]�w�֨����
		jcb1.setText("������ : 150��");			// �]�w�����Ѯ֨�������e
		jcb2.setText("�׵��� : 100��");			// �]�w�׵��Ѯ֨�������e
		jcb3.setText("���K�� : 60��");			
		jcb4.setText("�ֳJ���G : 30��");
		jcb5.setText("���z : 10��");
// �]�w����
		lab1.setBounds(50,50,150,20);
		jcb1.setBounds(100,100,150,20);
		jcb2.setBounds(100,130,150,20);
		jcb3.setBounds(100,160,150,20);
		jcb4.setBounds(100,190,150,20);
		jcb5.setBounds(100,220,150,20);
		lab2.setBounds(100,250,150,20);
		btn.setBounds(200,280,80,20);
// �N�����J���e����		
		ct.add(lab1);							// �b���e����إ߼��D����
		ct.add(lab2);							// �b���e����إ��`���B����
		ct.add(jcb1);							// �b���e����إߤ����Ѯ֨����
		ct.add(jcb2);							// �b���e����إߦ׵��Ѯ֨����						
		ct.add(jcb3);							
		ct.add(jcb4);							
		ct.add(jcb5);														
		ct.add(btn);							// �b���e����إ߫��s	
// ������U
		btn.addActionListener(new myListener());	// --- ���U	
// �]�w�����j�p�M�i�H��ܻP�����{��					
		jfrm.setSize(450, 380);						// �e450, ��380
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// ��ܵ���
	}
}

