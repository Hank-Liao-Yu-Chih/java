import java.util.Scanner;
public class ch5_9 {
	public static void main(String[] args) {
		double price;
		int age;
		int ticket = 100;						// 夹非布基
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("璸衡布基");
		System.out.print("叫块闹 : ");
		age = scanner.nextInt();				// 弄闹戈
		if (age >= 80 || age <= 6) {
			price = ticket * 0.2;				// 璸衡ゴ 2 ч布基		
			System.out.print("布基琌 : " + price);
		} else if (age >= 60 || age <= 12) {
			price = ticket * 0.5;				// 璸衡ゴ 5 ч布基
			System.out.print("布基琌 : " + price);
		} else {
			price = ticket;						// ぃゴч布基
			System.out.print("布基琌 : " + price);
		}
	}
}

