class Animal {
	protected String id;
	protected String name;			// �ŧiprotected�s���׹��ũw�q�ʪ��W�r
	Animal(String id, String name) {			// �غc��k�̪��name
	    this.id = id;
		this.name = name;
	}
	public void eat() {				// Animal��keat
		System.out.println("�s��" + id + ":" + name + "���b�Y����");
	}
}
class Mammal extends Animal {
	protected String favorite_food;
	Mammal(String id, String name, String favorite_food) {		// �غc��k�̪��name
		super(id, name);								// �I�s�����O�غc��k
		this.favorite_food = favorite_food;			// �̳��w������	
	}
	public void favoriteFood() {
		System.out.println("�s��" + id + ":" + name + " ���w�Y " + favorite_food);
	}	
}
class Cat extends Mammal {
	Cat(String id, String name, String favorite_food) {		// Cat�غc��k
		super(id, name, favorite_food);					// �I�s�����O�غc��k
	}
	public void jumping() {							// Cat���O�ۦ�����kjumping
		System.out.println("�s��" + id + ":" + name + "���b�s");		// �i�H�~��name�F
	}
}
public class ex14_2 {
	public static void main(String[] args) {
		Cat cat = new Cat("001", "lucy", "fish");		
		cat.eat();					// cat�~��Animal��keat()
		cat.favoriteFood();			// cat�~��Mammal��kfavoriteFood()
		cat.jumping();				// cat���O�ۦ�����k
	}
}

