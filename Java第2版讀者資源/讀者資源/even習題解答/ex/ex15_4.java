class Employee {
	String name;
	int age;
	String hometown;
	String country;
	Employee(String name, int age, String hometown, String country) {
		this.name = name;
		this.age = age;
		this.hometown = hometown;
		this.country = country;
	}
}	
public class ex15_4 {
	public static void main(String[] args) {
		Employee A = new Employee("John", 20, "�C�{", "����");
		Employee B = new Employee("Peter", 22, "�H��", "����");
		Employee C = new Employee("Kevin", 20, "�F��", "�饻");
		System.out.println("A = B : " + A.equals(B));  	// �ϥ�Object��equals
		System.out.println("A = C : " + A.equals(C));	// �ϥ�Object��equals
		System.out.println("B = C : " + B.equals(C));	// �ϥ�Object��equals
	}
}

