public class ex7_2 {
	public static void main(String[] args) {
		int[] data = {23, 99, 38, 9, 10, 22, 87, 25, 77};			
		int tmp;									
		for ( int i = 0; i < (data.length - 1); i++ )  {
			for ( int j = 0; j < (data.length - 1); j++ ) {
				if ( data[j] < data[j+1] ) {		// �o�ͫe��������᭱�����p
					tmp = data[j];
					data[j] = data[j+1];			// ���j�������ȩ�e��
					data[j+1] = tmp;				// ���p�������ȩ�᭱
				}
			}
		}
		System.out.printf("�̤j�� = %d%n", data[0]);
		System.out.printf("�̤p�� = %d%n", data[data.length-1]);
		int middle = data.length / 2;
		System.out.printf("������ = %d%n", data[middle]);
	}
}

