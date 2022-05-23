import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App108 {
    public static void main(String[] args) {
    TreeMap<interger, Double>TreeMap=new TreeMap<>();
    TreeMap.put(1, 9d);
    TreeMap.put(4, 10.1d);
    TreeMap.put(2, 7.2d);
    TreeMap.put(8, 20.28d);

    system.out.println("các phần tử có trong treeMap:");
    Set<Map.Entry<Integer,Double>>setTreemap=TreeMap.entryset();
    system.out.println(setTreemap);

    TreeMap.replace(4, 20.11d);

    TreeMap.replace(2, 7.7d);

    system.out.println("các phần tử có trong treeMap sau khi thay thế:");
    setTreemap= TreeMap.entryset();
    System.out.println(setTreemap);
   
}

}


