public class ex15_2 {
	public static void main(String[] args) {
		String msg1 = "Jiin-Kwei Hung";								// �w�qString����msg1
		int hd1 = msg1.hashCode();									// String���O���ƽX
		System.out.println("String���OJiin-Kwei Hung��hashCode : " + hd1);
		StringBuilder msg2 = new StringBuilder(msg1);				// �w�qStringBuilder����msg2
		int hd2 = msg2.hashCode();									// StringBuilder���O���ƽX
		System.out.println("Object���OJiin-Kwei Hung��hashCode : " + hd2);
		String msg3 = "�x�A��";										// �w�qString����msg3
		int hd3 = msg3.hashCode();									// String���O���ƽX
		System.out.println("String���x�A��hashCode  : " + hd3);
		StringBuilder msg4 = new StringBuilder(msg3);				// �w�qStringBuilder����msg4
		int hd4 = msg4.hashCode();									// StringBuilder���O���ƽX
		System.out.println("Object���O�x�A��hashCode  : " + hd4);	
	}
}

