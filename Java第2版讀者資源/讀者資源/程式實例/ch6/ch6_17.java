import java.util.Scanner;
public class ch6_17 {
	public static void main(String[] args) {
		int chicken = 0;
		int rabbit;
		int i;
		while (true) {
			rabbit = 35 - chicken;
			if (2 * chicken + 4 * rabbit == 100) {
				System.out.printf("���� = %2d, �ߦ� = %2d ��%n", chicken, rabbit);
				break;
			}
			chicken += 1;
		}		
	}
} 


