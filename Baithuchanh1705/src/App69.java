import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

public class treesetexp1 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treesetInteger= new Treeset<>();
        Scanner scanner= new Scanner(System.in);

        treesetInteger.add(0);
        treesetInteger.add(3);
        treesetInteger.add(4);
        treesetInteger.add(2);
        treesetInteger.add(8);

        System.out.println("các phần tử trong hashSetString:" );
    System.out.println(treesetInteger);
    system.out.println("Nhập phần tử cần thêm :");
    name = scanner.nextLine();

    if(hasdSetString.contains(number)) {
        hashSetString.remove(number);
        system.out.println("thêm thành công"); 
        system.out.println("các phần tử còn lại trong hashSetString sau khi thêm:");
        system.out.println(treesetInteger);
    }else{
        system.out.println("phần tử"+ number +"đã tồn tại!");
    }
 }
}

        