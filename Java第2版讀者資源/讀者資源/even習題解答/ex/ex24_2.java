import java.util.Random;
import java.util.*;
public class ex24_2 {
	public static void main(String[] args) {
		var A = new LinkedList<Integer>(); 
		var B = new HashSet<Integer>();
		Random ran = new Random();
		int r;
		for ( int i = 0; i < 10; i++ ) {
			r = ran.nextInt(21);
			A.add(r);					// ����0-20�H����
			B.add(r);
		}
		
		System.out.println("�ϥ�for��LinkedList����A����X");
		for(int i = 0; i < 10; i++)
			System.out.printf("%d ", A.get(i));
		
		System.out.println("");
		Iterator<Integer> itr = B.iterator();
		System.out.println("�ϥ�iterarot��HashSet����B����X");
		while (itr.hasNext())
			System.out.printf("%d ", itr.next());
	}
}

