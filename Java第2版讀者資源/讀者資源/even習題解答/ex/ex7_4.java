public class ex7_4 {
	public static void main(String[] args) {
		double[][] degree = {
				{30, 28, 29, 31, 33, 35, 32},			// �̰��ū�
				{20, 21, 19, 22, 23, 24, 20}			// �̧C�ū�
		};
		double sum, average;							// �`�p�ūשM�����ū�

		double max = 0;
		for (int i = 0; i < degree[0].length; i++) 
			if (degree[0][i] > max)
				max = degree[0][i];
		System.out.printf("�̰��� = %3.1f\n", max);
			
		double min = 99;
		for (int i = 0; i < degree[1].length; i++) 
			if (degree[1][i] < min)
				min = degree[1][i];
		System.out.printf("�̧C�� = %3.1f\n", min);	
		
		System.out.printf("�C�ѥ����ū� : ");	
		for (int i = 0; i < degree[0].length; i++) {
			sum = degree[0][i] + degree[1][i];			// �̪���`�p�ū�			
			average = sum / 2;							// �ūץ���
			System.out.printf("%5.2f  ", average);
		}
	}
}

