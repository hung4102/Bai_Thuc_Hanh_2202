import java.security.KeyStore.Entry;
import java.util.Set;
import java.util.TreeMap;

public class App106 {
    public static vooid main(String[] args) {
        TreeMap<Integer, character> TreeMap= new TreeMap<>();

        TreeMap.put(6, 'A');
        TreeMap.put(5, 'B');
        TreeMap.put(1 , 'C');
        TreeMap.put(2 , 'D');
        TreeMap.put(8 , 'E');

        Set<Entry<Integer, character>>setTreeMap= TreeMap.entryset();

        System.out.println("các entry có trong setTreeMap:");
        System.out.println(setTreeMap);
    }
}
