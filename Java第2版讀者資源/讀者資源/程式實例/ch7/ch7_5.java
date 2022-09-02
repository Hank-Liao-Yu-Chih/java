public class ch7_5 {
	public static void main(String[] args) {
		double average;				// キА放	
		double total = 0;			// 放羆㎝
		double[] degree = {25, 22, 24, 20, 26, 21, 21};
		
		for ( int i = 0; i < degree.length; i++ )
			total += degree[i];					// 璸衡放羆㎝
		average =  total / degree.length;	 	// 璸衡キА放
		System.out.printf("秅キА放 : %5.2f", average);			
	}
}

