import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) {
    String name;
    HashSet<String> hashSetString = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    hashSetString.add("wilson");
    hashSetString.add("Nike");
    hashSetString.add("volvo");
    hashSetString.add("Kai");
    hashSetString.add("Lenovo");
    hasdSetString.add("Lenovo");

    System.out.println("các phần tử trong hashSetString:" );
    System.out.println(hashSetString);
    system.out.println("Nhập phần tử cần xóa :");
    name = scanner.nextLine();

    if(hasdSetString.contains(name)) {
        hashSetString.remove(name);
        system.out.println("xóa thành công"); 
        system.out.println("các phần tử còn lại trong hashSetString:");
        system.out.println(hashSetString);
    }else{
        system.out.println("xóa không thành công!");
    }
 }
}
