import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap so hang");
        int a= scanner.nextInt();
        int[][] arr = new int[a][a];
        System.out.println("nhap phan tu mang 2 chieu");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j]= scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < a; i++) {
            for (int j = i; j <=i ; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.printf("tong cot cheo la %d ",sum);
    }
}
