import java.awt.*;							// �פJ���O�w
public class ex26_4 {	
	static Frame frm = new Frame("ex26_4");
	static Label lab = new Label("���Ӭ�ޤj��");	
	public static void main(String[] args) {
		frm.setLayout(null);				// ���������t�m
		frm.setSize(300, 200);				// �e300, ��200
		frm.setBackground(Color.gray); 		// �����I���O�Ǧ�		
		lab.setForeground(Color.black);		// ��r�O�¦�
		lab.setBackground(Color.yellow);	// ��r�I���O����
		lab.setAlignment(Label.CENTER);		// ��r�m��
		lab.setLocation(50, 80);			// �]�w��r�϶�
		lab.setSize(150, 50);				// �]�w��r�϶�
		lab.setFont(new Font("Serief", Font.BOLD+Font.ITALIC, 18));		
		frm.add(lab);						// �N����lab�[�J����						
		frm.setVisible(true);				// ��ܵ���		
	}
}

