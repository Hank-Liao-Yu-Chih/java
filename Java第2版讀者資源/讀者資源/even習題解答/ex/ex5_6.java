import java.util.Scanner;
public class ex5_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("�п�J����(����) : ");
		double height = scanner.nextDouble();
		System.out.printf("�п�J�魫(����) : ");
		double weight = scanner.nextDouble();
		double bmi;
		bmi = weight / ((height / 100) * (height / 100));
		
		if (bmi < 18.5)
			System.out.printf("BMI = %4.2f �魫�L��%n", bmi);
		else if (bmi >= 18.5 && bmi < 24)
			System.out.printf("BMI = %4.2f �魫���`%n", bmi);
		else if (bmi >= 24 && bmi < 28)
			System.out.printf("BMI = %4.2f �魫�W��%n", bmi);
		else 
			System.out.printf("BMI = %4.2f �魫�έD%n", bmi);
	}
}

