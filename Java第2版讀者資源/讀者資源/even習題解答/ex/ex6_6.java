public class ex6_6 {
	public static void main(String[] args) {				
		outerloop: for ( int i = 1; i <= 10; i++ ) {		// ��outerloop�j��аO
			for ( int j = 10; j >= 1; j-- ) {
				System.out.print("*");						// �C�L����
				if ( j <= i ) {
					System.out.println("");					// �U����X����
					continue outerloop;						// �o�@��outerloop�j�餤��
				}
			}		
		}				
	}
} 

