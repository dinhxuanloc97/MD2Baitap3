import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập gia trị vào mảng ");
        int index = sr.nextInt();
        int [] arr = new int[index];
        int min = 0 ;
        for (int i = 0 ; i < index ; i++){
            System.out.println("Nhập phần tử vào mảng : ");
            arr[i]=sr.nextInt();
            if(i ==0 ){
                min = arr[i];
            }min = Math.min(min,arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("GTNN trong mang la : " + min);
    }
}
