import java.awt.*;										// �פJ���O�w
import java.awt.event.*;								// �]����Event
public class ex28_2 {	
	static Frame frm = new Frame("ex28_2");
	static MenuBar mb = new MenuBar();					// �إ�MenuBar
	static Menu menu1 = new Menu("Font");				// �إ�Menu Font
	static Menu menu2 = new Menu("Color");				// �إ�Menu
	static MenuItem mI1_1 = new MenuItem("Bold");			// �إ�MenuItem
	static MenuItem mI1_2 = new MenuItem("Italic");		// �إ�MenuItem
	static MenuItem mI1_3 = new MenuItem("Plain");		// �إ�MenuItem
	static MenuItem mI1_4 = new MenuItem("Exit");			// �إ�MenuItem
	static MenuItem mI2_1 = new MenuItem("Green");			// �إ�MenuItem
	static MenuItem mI2_2 = new MenuItem("Blue");		// �إ�MenuItem
	static MenuItem mI2_3 = new MenuItem("Yellow");		// �إ�MenuItem
	static Label lab = new Label("Java",Label.CENTER);	// �إ�Label
// ����ƥ��ť�̩M�֦��ƥ�B�z��
	static class myListener implements ActionListener{	// �������O
		public void actionPerformed(ActionEvent e) {	// �ƥ�B�z��
			MenuItem item = (MenuItem) e.getSource();	// ���o�ҫ��ﶵ
			if (item == mI1_1)							// �p�Gtrue�إ�BOLD
				lab.setFont(new Font("Times New Roman",Font.BOLD,36));		
			else if (item == mI1_2)						// �p�Gtrue�إ�ITALIC
				lab.setFont(new Font("Times New Roman",Font.ITALIC,36));			
			else if (item == mI1_3)						// �p�Gtrue�إ�PLAIN
				lab.setFont(new Font("Times New Roman",Font.PLAIN,36));	
			else if (item == mI2_1)						
				lab.setForeground(Color.green);
			else if (item == mI2_2)						
				lab.setForeground(Color.blue);
			else if (item == mI2_3)						
				lab.setForeground(Color.yellow);
			else if (item == mI1_4)
				frm.dispose();							// ��������
		}
	}
	public static void main(String[] args) {
		mb.add(menu1);									// �bMenuBar�[�JFile Menu
		mb.add(menu2);									// �bMenuBar�[�JFile Menu
		menu1.add(mI1_1);								// �NBold�[�JFile Menu		
		menu1.add(mI1_2);								// �NItalic�[�JFile Menu
		menu1.add(mI1_3);								// �NPlain�[�JFile Menu
		menu1.addSeparator();							// �W�[���j�u
		menu1.add(mI1_4);								// �NExit�[�JFile Menu
		
		menu2.add(mI2_1);										
		menu2.add(mI2_2);									
		menu2.add(mI2_3);									
		mI1_1.addActionListener(new myListener());		// --- ���U
		mI1_2.addActionListener(new myListener());		// --- ���U
		mI1_3.addActionListener(new myListener());		// --- ���U
		mI1_4.addActionListener(new myListener());		// --- ���U	
		mI2_1.addActionListener(new myListener());		// --- ���U
		mI2_2.addActionListener(new myListener());		// --- ���U
		mI2_3.addActionListener(new myListener());		// --- ���U
		
		lab.setFont(new Font("Times New Roman",Font.PLAIN,36));		
		frm.add(lab);									// �NLabel�[�J����
		frm.setSize(250, 160);							// �e250, ��160
		frm.setMenuBar(mb);								// �]�wfrm�\���Omb����
		frm.setVisible(true);							// ��ܵ���
	}
}

