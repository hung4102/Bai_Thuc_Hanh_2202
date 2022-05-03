import java.util.LinkedList;

public class App38 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");


    System.out.println("ví dụ dử dụng phuowgn thức addAll() ");
    System.out.println("==================================");
    LinkedList<String>listA=new LinkedList<String>();
    listA.addAll(list);
    System.out.print("listA: ");
    showList(listA);
    System.out.println("\n ví dụ phương thức retainAll");
    System.out.println("===============================");
    LinkedList<String> listB=new LinkedList<String>();
    listB.add("Java");
    listA.retainAll(listB);
    showList(listA);

    System.out.println("\n ví dụ sử dụng phuwogn thức removeAll");
    System.out.println("============================================");
    list.removeAll(listB);
    System.out.println("list: ");
    showList(list);




    }

    private static void showList(LinkedList<String> list) {
    for (String obj: list)   {
        System.out.print("\t"+ obj + ",");
    }
    System.out.println();
    }

}
