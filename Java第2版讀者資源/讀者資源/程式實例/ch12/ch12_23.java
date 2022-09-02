public class ch12_23 {
	public static void main(String[] args) {
		String str1 = "Ming-Chi Institute of Technology";
		System.out.println("玡后迭琌Ming-Chi   : " + str1.startsWith("Ming-Chi"));
		System.out.println("玡后迭琌MING-CHI   : " + str1.startsWith("MING-CHI"));
		System.out.println("后迭琌Technology : " + str1.endsWith("Technology"));
		System.out.println("后迭琌TECHNOLOGY : " + str1.endsWith("TECHNOLOGY"));
		System.out.println("Index 9琌Institute : " + str1.startsWith("Institute", 9));
		System.out.println("Index 9琌INSTITUTE : " + str1.startsWith("INSTITUTE", 9));
	}
}

