public class ch12_28 {
	public static void main(String[] args) {
		String str = "Java1";
		char[] ch1 = {'�J', '��', '��', '�V', '��', '��', '��', '��'};
		char[] ch2 = {'��', '��', '�k', '��'};
		StringBuffer bstr = new StringBuffer(str);
		System.out.println("bstr : " + bstr);
		bstr.append('4');			// �᭱���J"4"
		System.out.println("bstr : " + bstr);
		bstr.append(ch2);			// �᭱���J"�����k��"
		System.out.println("bstr : " + bstr);		
// insert()��k������
		bstr.insert(6, ch1);		// ����5���J"�J���ڦV���⤧��"
		System.out.println("bstr : " + bstr);
// deleteCharAt()��k������
		bstr.deleteCharAt(15);		// �R��"��"
		System.out.println("bstr : " + bstr);
// delete()��k������
		bstr.delete(15, 17);		// �R��"�k��"
		System.out.println("bstr : " + bstr);
// �A��append()��k
		bstr.append(ch2, 1, 3);		// �W�["���k��"
		System.out.println("bstr : " + bstr);
	}
}
	
