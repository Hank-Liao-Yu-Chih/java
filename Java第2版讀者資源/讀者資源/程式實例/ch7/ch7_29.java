import java.util.Scanner;
public class ch7_29 {
	public static void main(String[] args) {
		int[] data = {6, 1, 5, 7, 3, 9, 4, 2, 8};
		Scanner scanner = new Scanner(System.in);
		System.out.printf("�п�J�j�M��: ");
		int key = scanner.nextInt();
		boolean notfind = true;
		
		for ( int i = 0; i < data.length; i++ )
			if (key == data[i]) {
				System.out.printf("��쪺���ޭȬO %d%n", i);
				notfind = false;
			}
		if (notfind == true)
			System.out.println("�䤣�즹�j�M��");
	}
}

