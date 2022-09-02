class Animal {
	protected void moving() {		// 存取權限是protected
		System.out.println("動物可以活動");
	}
}
class Cat extends Animal {
	public void moving() {			// 存取權限變鬆為public
		System.out.println("貓可以走路和跳");
	}
}
public class ch14_22 {
	public static void main(String[] args) {
		Animal a = new Animal();	// 父類別動物物件
		Cat c = new Cat();			// 子類別貓物件
		a.moving();					// 呼叫父類別moving()方法
		c.moving();					// 呼叫子類別moving()方法
	}
}

