interface MyScore {							
	void ScoreMax(); 		    			// �̰���
	void SoreMin();							// �̧C��
	void ScoreAve();						// ����
}
interface MyTest extends MyScore {							
	void ShowScore();
}
class MyStuTime implements MyTest {	
		protected String name;				// �m�W
		protected String Chinese			// ��妨�Z
		protected int math;					// �ƾǦ��Z
		protected int physics				// ���z���Z
		protected int english				// �^�妨�Z
	// Ū�̻ݭn�]�p�����O���e
	void printinfo() {
		System.out.println("��妨�Z = " + Chinese);
}
public class ex17_6 {
	public static void main(String[] args) {
		MyStuTime obj = new MyStuTime("John", 98, 97, 100, 99); 	
		obj.showScore();
	}
}

�m�W:John
��妨�Z:98
�^�妨�Z:97
�ƾǦ��Z:100
���z���Z:99
�̰���:100
�̧C��:97
����:99.00




