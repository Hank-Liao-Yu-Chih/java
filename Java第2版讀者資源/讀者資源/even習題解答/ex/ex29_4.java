import javax.swing.*;								// 匯入類別庫
import java.awt.*;
import java.awt.event.*;										
public class ex29_4 {	
	static JFrame jfrm = new JFrame("ex29_4");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JLabel lab1 = new JLabel();				// 定義標題標籤
	static JLabel lab2 = new JLabel();				// 定義總金額標籤
	static JCheckBox jcb1 = new JCheckBox(); 		// 定義牛肉麵核取方塊
	static JCheckBox jcb2 = new JCheckBox();		// 定義肉絲麵核取方塊
	static JCheckBox jcb3 = new JCheckBox(); 		// 定義陽春麵核取方塊
	static JCheckBox jcb4 = new JCheckBox();		// 定義皮蛋豆腐核取方塊
	static JCheckBox jcb5 = new JCheckBox();		// 定義豆干核取方塊
	static JButton btn = new JButton("買單");		// 定義買單按鈕
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			int amount = 0;
			if (jcb1.isSelected()) 					// 牛肉麵 
				amount += 150;
			if (jcb2.isSelected()) 					// 肉絲麵
				amount += 100;
			if (jcb3.isSelected()) 					// 陽春麵 
				amount += 60;
			if (jcb4.isSelected()) 					// 皮蛋豆腐
				amount += 30;
			if (jcb5.isSelected()) 					// 皮蛋豆腐
				amount += 10;
			lab2.setText("總金額 : "+Integer.toString(amount));	
		}
	}	
	public static void main(String[] args) {
		ct.setLayout(null);							// 設定流動版面配置null		
// 設定標籤
		lab1.setText("餐飲計價系統");
		lab2.setText("總金額 : ");
// 設定核取方塊
		jcb1.setText("牛肉麵 : 150元");			// 設定牛肉麵核取方塊內容
		jcb2.setText("肉絲麵 : 100元");			// 設定肉絲麵核取方塊內容
		jcb3.setText("陽春麵 : 60元");			
		jcb4.setText("皮蛋豆腐 : 30元");
		jcb5.setText("豆干 : 10元");
// 設定版面
		lab1.setBounds(50,50,150,20);
		jcb1.setBounds(100,100,150,20);
		jcb2.setBounds(100,130,150,20);
		jcb3.setBounds(100,160,150,20);
		jcb4.setBounds(100,190,150,20);
		jcb5.setBounds(100,220,150,20);
		lab2.setBounds(100,250,150,20);
		btn.setBounds(200,280,80,20);
// 將元件放入內容窗格		
		ct.add(lab1);							// 在內容窗格建立標題標籤
		ct.add(lab2);							// 在內容窗格建立總金額標籤
		ct.add(jcb1);							// 在內容窗格建立牛肉麵核取方塊
		ct.add(jcb2);							// 在內容窗格建立肉絲麵核取方塊						
		ct.add(jcb3);							
		ct.add(jcb4);							
		ct.add(jcb5);														
		ct.add(btn);							// 在內容窗格建立按鈕	
// 執行註冊
		btn.addActionListener(new myListener());	// --- 註冊	
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(450, 380);						// 寬450, 高380
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

