import java.io.*;
import java.util.*;
public class ex22_2 {	
    public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("�п�J�ӷ��ɮ� : ");
		String src = scanner.next();
		System.out.printf("�п�J�ت��ɮ� : ");
		String dst = scanner.next();
		int i;
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dst);
		while ( (i = fr.read()) != -1 ) {	// Ū�r�������ɮץ���
			char ch = (char) i;				// �N����ন�r��
			fw.write(ch);					// ��X���ɮ�
		}
		fr.close();
		fw.close();
		System.out.println("�ƻs�ɮצ��\!"); 
	}
}

				