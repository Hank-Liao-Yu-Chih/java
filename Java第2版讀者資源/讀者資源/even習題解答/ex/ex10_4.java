import java.util.Scanner;
import java.util.Random;
public class ex10_4 {
	public static void main(String[] args) {
		int number;										// �S�O��
		int[] lottery = new int[50];
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("�п�J�ʶR�¤O�m�ƶq : ");
		int num = scanner.nextInt();					// Ū���ʶR�¤O�m���ƶq
		
		for ( int i = 1; i <= num; i++) {				// �B�z�D��		
			System.out.printf("%d : \t", i);			// ��X�ĴX�ո��
			for ( int n = 1; n <= 49; n++)				// �B�zlottery[n]=n, n = 1-49
				lottery[n] = n;
			int counter = 1;							// �U�ռƦr�s��
			while ( counter <= 6 ) {					// �@�զ�6�ӼƦr
				int lotteryNum = rand.nextInt(49) + 1; 	// ���ͥD���X
				if (lottery[lotteryNum] == 0)			// �p�G�O0��ܦ��Ʀr�w�g����
					continue;							// ��^while�j��
				else {
					System.out.printf("%d  \t", lotteryNum);	// ���ͷs���D���Ʀr
					lottery[lotteryNum] = 0;			// �N���}�C���޳]��0
					counter++;							// �N�D���Ʀr�s���[1
				}
			}
			number = rand.nextInt(8) + 1;
			System.out.printf("   �S�O�� : %d%n", number);
		}
	}
}

