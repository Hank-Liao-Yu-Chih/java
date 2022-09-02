class MyMath {
	int x;									
	void math(int a) {							// 1俱计把计
		x = a;
	}
	void math(int a, int b) {					// 2俱计把计
		x = a * b;
	}
	void math(int a, int b, int c) {			// 3俱计把计
		x = a * b * c;
	}
	void printInfo( ) {							
		System.out.println(x);				
	}
}
public class ch9_8 {
	public static void main(String[] args) {
		MyMath A = new MyMath();
		A.math(10);
		A.printInfo();
		A.math(10, 10);
		A.printInfo();
		A.math(10, 10, 10);
		A.printInfo();	
	}
}
 
