import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[] args) {
        ArrayList<Float>floatArrayList=new ArrayList<>();
        floatArrayList.add(0.7f);
        floatArrayList.add(7.26f);
        floatArrayList.add(1.02f);
        floatArrayList.add(9.3f);
        Iterator<Float>iterator= floatArrayList.iterator();
        System.out.println("Các phần tử có trong mảng là: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
}
