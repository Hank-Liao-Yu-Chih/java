import java.util.Scanner;
public class ch6_17 {
	public static void main(String[] args) {
		int chicken = 0;
		int rabbit;
		int i;
		while (true) {
			rabbit = 35 - chicken;
			if (2 * chicken + 4 * rabbit == 100) {
				System.out.printf("Âû¦³ = %2d, ¨ß¦³ = %2d °¦%n", chicken, rabbit);
				break;
			}
			chicken += 1;
		}		
	}
} 


