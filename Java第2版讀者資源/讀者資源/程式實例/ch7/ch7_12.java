public class ch7_12 {
	public static void main(String[] args) {
		int[] score = {90, 95, 80, 79, 92};		// ﹚竡厩ネΘ罿皚
		int max, min;
		max = min = score[0];					// 既﹚程籔程
		for ( int sc:score ) {					// foreach癹伴
			if ( sc > max ) 					// 狦ヘ玡じ程
				max = sc;						// 盢ヘ玡じ砞程
			if ( sc < min )						// 狦ヘ玡じ程
				min = sc;						// 盢ヘ玡じ砞程
		}
		System.out.println("Max = " + max);		// 程
		System.out.println("Min = " + min);		// 程	
	}
}

