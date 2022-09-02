public class ex7_4 {
	public static void main(String[] args) {
		double[][] degree = {
				{30, 28, 29, 31, 33, 35, 32},			// 程蔼放
				{20, 21, 19, 22, 23, 24, 20}			// 程放
		};
		double sum, average;							// 羆璸放㎝キА放

		double max = 0;
		for (int i = 0; i < degree[0].length; i++) 
			if (degree[0][i] > max)
				max = degree[0][i];
		System.out.printf("程蔼放 = %3.1f\n", max);
			
		double min = 99;
		for (int i = 0; i < degree[1].length; i++) 
			if (degree[1][i] < min)
				min = degree[1][i];
		System.out.printf("程放 = %3.1f\n", min);	
		
		System.out.printf("–ぱキА放 : ");	
		for (int i = 0; i < degree[0].length; i++) {
			sum = degree[0][i] + degree[1][i];			// 程て羆璸放			
			average = sum / 2;							// 放キА
			System.out.printf("%5.2f  ", average);
		}
	}
}

