import java.awt.*;							// �פJ���O�w
public class ex26_2 {	
	static Frame frm = new Frame("MyWin");
	public static void main(String[] args) {
		frm.setSize(300, 180);				// �e300, ��180
		frm.setLocation(400, 200);			// ���W���y��(200, 100)
		frm.setVisible(true);				// ��ܵ���

// ���o�������A��
		System.out.println("����x�b�y�� : " + frm.getX());
		System.out.println("����y�b�y�� : " + frm.getY());
		System.out.println("��������    : " + frm.getHeight());
		System.out.println("�����e��    : " + frm.getWidth());
		System.out.println("�����W��    : " + frm.getName());
		System.out.println("�����I����  : " + frm.getBackground());
	}
}

