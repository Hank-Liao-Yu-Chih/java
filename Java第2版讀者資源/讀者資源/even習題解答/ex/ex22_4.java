import java.io.*;
public class ex22_4 {	
    public static void main(String args[]) {
		String account = "cshung";
		String pwd = "010101";
		
		Console cs = System.console();
		cs.printf("�п�J�b�� : ");					// ���ܰT��
		String acc = cs.readLine();					// Ū���K�X
		
		cs.printf("�п�J�K�X : ");					// ���ܰT��
		char[] ch = cs.readPassword();				// Ū���K�X
		String pw = String.valueOf(ch);				// �r���}�C�ন�r��
		
		if (account.equals(acc))
			if (pwd.equals(pw))
				cs.printf("�w��i�JJava�t��");
			else
				cs.printf("�K�X���~");
		else
			cs.printf("�b�����~");
	}
}

