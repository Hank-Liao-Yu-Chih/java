public class ch6_12 {
	public static void main(String[] args) {
		int sum = 0;				// 羆㎝
		for ( int i = 1; i <= 10; i++ ) {
			if ( i % 2 == 0 )		// 狦单0玥琌案计
				continue;
			sum += i;				// 籔ヘ玡羆㎝
		}
		System.out.println("1-10计羆㎝琌 : " + sum);		
	}
}

