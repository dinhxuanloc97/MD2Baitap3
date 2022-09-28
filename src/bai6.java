import java.util.Scanner;
    public class bai6 {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("nhap so hang");
            int a = scanner.nextInt();
            System.out.println("nhap so cot");
            int b = scanner.nextInt();
            int[][] arr = new int[a][b];
            System.out.println("nhap phan tu mang 2 chieu");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr[i][j]= scanner.nextInt();
                }
            }
            System.out.println("nhap cot can tinh tong");
            int cot = scanner.nextInt();
            int sum=0;
            for (int i = cot ; i < cot+1 ; i++) {
                for (int j = 0 ; j < b ; j++) {
                    sum+=arr[cot][j] ;
                }
            }
            System.out.printf("tong cot %d la %d",cot,sum);
        }
    }
