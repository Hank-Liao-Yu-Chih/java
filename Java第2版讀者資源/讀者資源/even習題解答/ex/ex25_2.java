import java.util.*;
public class ex25_2 {
    public static void main(String[] args) {
		Map.Entry<String, String> map1 = Map.entry("�P����", "Sunday");
		Map.Entry<String, String> map2 = Map.entry("�P���@", "Monday");
		Map.Entry<String, String> map3 = Map.entry("�P���G", "Tuesday");
		Map.Entry<String, String> map4 = Map.entry("�P���T", "Wednesday");
		Map.Entry<String, String> map5 = Map.entry("�P���|", "Thursday");
		Map.Entry<String, String> map6 = Map.entry("�P����", "Friday");
		Map.Entry<String, String> map7 = Map.entry("�P����", "Satursday");
		
// �ϥ�Map.ofEntries()�إ�Map
		Map<String, String> map = Map.ofEntries(map1, map2, map3, map4, map5, map6, map7);
		for (Map.Entry m:map.entrySet())					// ��X���e
			System.out.printf("%s : %s\n", m.getKey(), m.getValue());
		
    }
}

