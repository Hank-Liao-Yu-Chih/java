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
	@Override
	public String toString() {
		return this.name + "���~" + this.age + "�a�m�O" + this.hometown + "���y�O" + this.country;
	}
}	
public class ex15_6 {
	public static void main(String[] args) {
		Employee A = new Employee("John", 20, "�C�{", "����");
		System.out.println("�C�X���� A : " + A);  	
	}
}

