import java.util.*;
public class ex24_6 {
    public static void main(String[] args) {
		var map = new TreeMap<Integer, String>(); 
		map.put(100, "ī�G");
		map.put(30, "����");
		map.put(50, "�~�G");
		map.put(20, "���");
		int key1 = map.firstKey();
		int key2 = map.lastKey();
		System.out.println("�̫K�y���G : " + map.get(key1) + "\t" + "��� : " + key1);
		System.out.println("�̶Q�����G : " + map.get(key2) + "\t" + "��� : " + key2);
		System.out.println("�M�����G��");
		for (Map.Entry m:map.entrySet())
			System.out.printf("%12s : %s\n", m.getValue(), m.getKey());

    }
}

