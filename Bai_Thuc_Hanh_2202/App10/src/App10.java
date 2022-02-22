import java.util.Scanner;
import static java.lang.System.*;

public class App10 {
    public static void main(String[] args) {
        var sc= new Scanner(in);
        int n=sc.nextInt();
        int dem=0;
        while(n>=10){
            n/=10; // hay n = n /10;
            dem++;
        }
        out.println("Số " +n+ " có "++" chữ số" );
    }

}
