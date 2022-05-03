import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {
    public static void main(String[] args) {
        ArrayList<Character>characterArrayList=new ArrayList<>();
        characterArrayList.add('a');
        characterArrayList.add('e');
        characterArrayList.add('b');
        characterArrayList.add('c');
        ListIterator<Character>listIterator=characterArrayList.listIterator();
        System.out.println("Các phần tử có trong mảng là: ");
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next()+ "\t");
        }
    }
}

