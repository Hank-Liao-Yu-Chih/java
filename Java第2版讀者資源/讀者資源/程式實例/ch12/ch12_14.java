public class ch12_14 {
	public static void main(String[] args) {
		String str = "箸獿玅琌法筁籔纒珿ㄆи程尺舧纒褂ら";
		String s = "纒";
		System.out.println("纒程瞷竚 = " + str.indexOf(s));
		System.out.println("纒程瞷竚 = " + str.lastIndexOf(s));
		System.out.println("纒index=15癬程瞷竚 = " + str.indexOf(s, 15));
		System.out.println("纒index=15癬程瞷竚 = " + str.lastIndexOf(s, 15));
		System.out.println("尝粮程瞷竚 = " + str.indexOf("尝粮"));
	}
}

