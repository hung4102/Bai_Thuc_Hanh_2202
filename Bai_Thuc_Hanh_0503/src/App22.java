import java.util.Scanner;

import static java.lang.System.in;

public class App22 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        System.out.print("nhap so phan tu cua mang: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxValue=arr[0];
        for (int i=1;i<n;i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.print(maxValue);

    }
}
