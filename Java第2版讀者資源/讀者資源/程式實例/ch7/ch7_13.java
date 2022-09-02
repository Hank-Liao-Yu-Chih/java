public class ch7_13 {
	public static void main(String[] args) {
		int[] score = {90, 58, 80, 49, 92};					// ﹚竡厩ネΘ罿皚
		int passingScore = 60;								// 程夹非だ计
		for ( int i = 0; i < score.length; i++ ) {					
			if ( score[i] < passingScore )					// 狦程夹非だ计
				System.out.printf("score[%d] = %d\n", i, score[i]);		// だ计
		}
	}
}

