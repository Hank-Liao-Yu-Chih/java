import java.awt.*;									// �פJ���O�w
import javax.swing.*;
import java.awt.geom.*;
public class ex30_4 extends JPanel {				// JPanel���O	
	public void paintComponent(Graphics g) {		// ø�Ϥ�k	
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);					// �W�h�e���M��������e
		g2d.setPaint(new GradientPaint(50,150,Color.yellow,290,250,Color.blue));							
		g2d.fill(new Rectangle2D.Float(50.0f,50.0f,240.0f,50.0f));	// ��R�x��
		
		g2d.setPaint(new GradientPaint(50,150,Color.blue,290,250,Color.green));			
		g2d.fill(new Ellipse2D.Double(125.0d,150.0d,100.0d,100.0d));	// ��R���	
	}	
	public static void main(String[] args) {
		JFrame frm = new JFrame("ex30_4");
		Container ct = frm.getContentPane();		// ���e����
		ct.add(new ex30_4(),BorderLayout.CENTER);	// �N�e�����J���e����
		frm.setSize(350, 320);						// �e350, ��350	
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);						// ��ܵ���
	}
}

