public class ch7_27 {
	public static void main(String[] args) {
		int[][] degree = {
				{25, 27, 29, 28, 26, 30, 28},			// 程蔼放
				{23, 25, 27, 26, 24, 28, 26},			// キА放
				{21, 23, 25, 24, 22, 26, 24}			// 程放
		};
		double sum, average;							// 羆璸放㎝キА放				
		String str = "";
		for (int i = 0; i < degree.length; i++) {
			sum = 0;									// 程て羆璸放
			for (int de:degree[i])
				sum += de;								// 放羆㎝
			average = sum / degree[i].length;			// 放キА
			switch (i) {
				case 0:
					str = "程蔼放キА : ";
					break;
				case 1:
					str = "キА放キА : ";
					break;
				case 2:
					str = "程放キА : ";
					break;
			}
			System.out.printf("%s %5.2f\n", str, average);
		}
	}
}

