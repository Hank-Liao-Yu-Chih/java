import java.util.Scanner;
public class ex6_8 {
	public static void main(String[] args) {	
        Scanner scanner = new Scanner(System.in);
		System.out.printf("�п�J���� : ");
		int height = scanner.nextInt();	
		System.out.printf("�п�J�e�� : ");
		int width = scanner.nextInt();
				
		for ( int i = 1; i <= height; i++ ) {			
			for ( int j = 1; j <= width; j++ ) 
				System.out.print("*");	
			System.out.println();
		}				
	}
} 

