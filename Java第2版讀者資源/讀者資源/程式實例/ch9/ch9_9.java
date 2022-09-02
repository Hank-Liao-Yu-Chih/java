class MyClass {
	int age;									// 闹
	String name;								// ﹎
	MyClass(int age) {							// 篶よ猭把计琌俱计	
		this.age = age; 						// 砞﹚闹
	}
	MyClass(String name) {						// 篶よ猭把计琌﹃
		this.name = name;						// 砞﹚﹎
	}
	MyClass(int age, String name) {				// 篶よ猭把计琌俱计㎝﹃
		this.age = age;							// 砞﹚闹
		this.name = name;						// 砞﹚﹎
	}
	void printInfo() {							// Θ跑计
		System.out.println(name);				// ﹎
		System.out.println(age);				// 闹
	}
}
public class ch9_9 {
	public static void main(String[] args) {
		MyClass A = new MyClass(20);
		A.printInfo();
		MyClass B = new MyClass("John");
		B.printInfo();
		MyClass C = new MyClass(25, "Lin");
		C.printInfo();
	}
}
 
