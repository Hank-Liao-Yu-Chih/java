import circles.*;						// �����O�פJ�ŧi
import java.util.Scanner;
public class ex19_6 {					
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);		
		System.out.print("�п�J��b�| : ");
		double r = scanner.nextDouble();				// Ū���b�|
		Cal obj = new Cal();		
		obj.area(r);
		obj.circumference(r);
	}
}

