import java.util.ArrayList;
public class Array {
    public static void main(String[] args) {
        ArrayList<String>arrListString=new ArrayList<>(5);

        arrListString.add("1");
        arrListString.add("2");
        arrListString.add("3");
        arrListString.add("4");
        arrListString.add("5");
        arrListString.add("6");
        String set = arrListString.set(4, "0");
        System.out.println("Các phần tử trong mảng là: ");
        for(int i= 0; i<arrListString.size();i++) {
            System.out.print(arrListString.get(i)+ "\t");
        }
        //String set = arrListString.set(3, "0");
    }
}
