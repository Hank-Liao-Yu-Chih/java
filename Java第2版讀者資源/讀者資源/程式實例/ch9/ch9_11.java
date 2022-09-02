class NBAPlayers {
	int age = 28;								// 闹
	String name;								// ﹎
	NBAPlayers(String name) {					// 篶よ猭把计琌﹃
		this.name = name;						// 砞﹚﹎
	}
	NBAPlayers(String name, int age) {			// 篶よ猭把计琌俱计㎝﹃
		this(name);								// 砞﹚﹎
		this.age = age;							// 砞﹚闹
	}
	void printInfo() {							// Θ跑计
		System.out.println(name);				// ﹎
		System.out.println(age);				// 闹
	}
}
public class ch9_11 {
	public static void main(String[] args) {
		NBAPlayers A = new NBAPlayers("LeBron James", 30);
		A.printInfo();
	}
}
 

