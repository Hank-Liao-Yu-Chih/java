public class ch12_30 {
	public static void main(String[] args) {
		String str = "Java 10�J���ڦV���⤧�������k��";
		StringBuffer bstr = new StringBuffer(str);		
		System.out.println("bstr : " + bstr);
		bstr.setCharAt(6, '4');
		System.out.println("bstr : " + bstr);
		bstr.replace(7,9, "�ּ־ǲ�");
		System.out.println("bstr : " + bstr);
	}
}
	
