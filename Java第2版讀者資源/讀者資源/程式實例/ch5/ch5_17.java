import java.util.Scanner;
public class ch5_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("�п�J����(����) : ");
		double height = scanner.nextDouble();
		System.out.printf("�п�J�魫(����) : ");
		double weight = scanner.nextDouble();
		double bmi;
		bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMI = " + bmi);
		if (bmi >= 18.5 && bmi < 24)
			System.out.println("�魫���`");
		else
			System.out.println("�魫�����`");				
	}
}

