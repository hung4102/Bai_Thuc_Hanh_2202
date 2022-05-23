import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App86 {
  public void main(string[] agrs) {
      HashMap<String, String>hashMap=new HashMap<>();
        
      hashMap.put("CSLT","cơ sở lập trình");
      hashMap.put("C++","c++");
      hashMap.put("C#","C Sharp");
      hashMap.put("php","php");
      hashMap.put("java","java");

      Set<Map.Entry<String, String>> sethashMap=hashMap.entryset();
    
      system.out.println("các entry có trong sethasMap");
      system.out.println(sethashMap);
    }

}
