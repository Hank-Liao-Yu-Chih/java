public class ch7_31 {
	public static void main(String[] args) {
		double[] data = {5, 6, 8, 9};			
		double sum = 0;									
		for ( int i = 0; i < data.length; i++ )
			sum += data[i];
		double average = sum / data.length; 				// �p�⥭����
		System.out.printf("������ = %4.2f%n", average);
		
		double var = 0;
		for (int i = 0; i < data.length; i++)
			var += Math.pow((data[i] - average), 2);
		var = var / data.length; 							// �p���ܲ���
		System.out.printf("�ܲ��� = %4.2f%n", var);
				
		double dev = 0;
		for (int i = 0; i < data.length; i++)
			dev += Math.pow((data[i] - average), 2);
		dev = Math.pow((dev / data.length), 0.5); 			// �p��зǮt
		System.out.printf("�зǮt = %4.2f%n", dev);
	}
}

