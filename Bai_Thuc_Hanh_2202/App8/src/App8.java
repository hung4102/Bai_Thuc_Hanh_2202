import java.util.Scanner;
import static java.lang.System.*;

public class App8 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        int max=0;
        int x = 1;
        while ( x !=0){
            out.println("Nhap so thuc :");
            x = sc.nextInt();
            if(max%5==0) max=x;
        }
        out.println("Max= "+max);
    }
    }


