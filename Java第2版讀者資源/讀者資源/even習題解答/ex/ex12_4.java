public class ex12_4 {
	public static void main(String[] args) {
		String str = "����L�Q�O���L�P�p�s�k���G��,�ڳ��w�p�s�k�b�j�Ӫ��ͬ����q,�p�s�k�M�s��U���Y�ѥP";
		int count = counter(str, "�p�s�k");
		System.out.println("�p�s�k�X�{���� = " + count);
	}	
	public static int counter(String str, String substr) {
		int num = 0;
		int i = 0;
		while (str.indexOf(substr, i) != -1) {
			num++;
			i = str.indexOf(substr, i) + substr.length();
		}
		return num;
	}
}

