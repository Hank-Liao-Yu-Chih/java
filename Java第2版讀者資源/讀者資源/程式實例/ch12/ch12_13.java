public class ch12_13 {
	public static void main(String[] args) {
		String str = "Ming-Chi Institute of Technology";		
		System.out.println("iじ程瞷竚 = " + str.indexOf('i'));
		System.out.println("iじ程瞷竚 = " + str.lastIndexOf('i'));
		System.out.println("iじindex=5癬程瞷竚 = " + str.indexOf('i', 5));
		System.out.println("iじindex=5癬程瞷竚 = " + str.lastIndexOf('i', 5));
		System.out.println("iじindex=7癬程瞷竚 = " + str.indexOf('i', 7));
		System.out.println("iじindex=7癬程瞷竚 = " + str.lastIndexOf('i', 7));
		System.out.println("kじ程瞷竚 = " + str.indexOf('k'));
		System.out.println("zじ程瞷竚 = " + str.lastIndexOf('z'));
	}
}

