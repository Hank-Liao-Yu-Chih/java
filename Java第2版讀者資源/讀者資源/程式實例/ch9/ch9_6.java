class MyClass {
	int age;									// 闹
	String name;								// ﹎
	MyClass(int a) {							// 篶よ猭把计琌俱计	
		age = a; 								// 砞﹚闹
	}
	MyClass(String str) {						// 篶よ猭把计琌﹃
		name = str;								// 砞﹚﹎
	}
	MyClass(int a, String str) {				// 篶よ猭把计琌俱计㎝﹃
		age = a;								// 砞﹚闹
		name = str;								// 砞﹚﹎
	}
	void printInfo() {							// Θ跑计
		System.out.println(name);				// ﹎
		System.out.println(age);				// 闹
	}
}
public class ch9_6 {
	public static void main(String[] args) {
		MyClass A = new MyClass(20);
		A.printInfo();
		MyClass B = new MyClass("John");
		B.printInfo();
		MyClass C = new MyClass(25, "Lin");
		C.printInfo();
	}
}
 
