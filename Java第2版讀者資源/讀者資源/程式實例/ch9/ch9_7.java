class MyClass {
	int age;									// 闹
	String name;								// ﹎
	MyClass() {									// 篶よ猭箇砞
		age = 50;
		name = "Curry";
	}
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
public class ch9_7 {
	public static void main(String[] args) {
		MyClass A = new MyClass();
		A.printInfo();
	}
}
 
