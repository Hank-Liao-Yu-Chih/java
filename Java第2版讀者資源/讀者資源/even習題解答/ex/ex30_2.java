import java.awt.*;	
import java.util.Random;								// �פJ���O�w
public class ex30_2 extends Frame {
	static ex30_2 frm = new ex30_2();			
	public void paint(Graphics g) {						// paint()��k
		Random ran = new Random();
		Insets ins = getInsets();						// ���oø�ϰ�
		int width = getWidth() - (ins.left+ins.right);	// ���oø�ϰϼe��
		int height = getHeight() - (ins.top+ins.bottom);// ���oø�ϰϰ���
		int color = ran.nextInt(5);
		switch (color) {
			case 0: g.setColor(Color.red);
					break;
			case 1: g.setColor(Color.green);
					break;	
			case 2: g.setColor(Color.blue);
					break;	
			case 3: g.setColor(Color.yellow);
					break;		
			case 4: g.setColor(Color.gray);
					break;
		}
		g.drawRect(ins.left,ins.top,width-1,height-1);	// ø�s�x��
	}	
	public static void main(String[] args) {
		frm.setTitle("ch30_5");							// �������D
		frm.setSize(200, 160);							// �e200, ��160	
		frm.setVisible(true);							// ��ܵ���
	}
}

