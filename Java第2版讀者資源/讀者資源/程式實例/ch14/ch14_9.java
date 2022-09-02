class Animal {
	protected String name;			// 宣告protected存取修飾符定義動物名字
	public void eat() {				// Animal方法eat
		System.out.println(name + "正在吃食物");
	}
	public void sleep() {			// Animal方法sleep
		System.out.println(name + "正在睡覺");
	}
}
class Dog extends Animal {
	Dog(String name) {				// Dog建構方法
		this.name = name;			// 直接設定動物名字
	}
	public void barking() {			// Dog類別自有的方法barking
		System.out.println(name + "正在叫");	// 可以繼承name了
	}
}
public class ch14_9 {
	public static void main(String[] args) {
		Dog dog = new Dog("Haly");		
		dog.eat();					// dog繼承Animal方法eat()
		dog.sleep();				// dog繼承Animal方法sleep()
		dog.barking();				// Dog類別自有的方法
	}
}

