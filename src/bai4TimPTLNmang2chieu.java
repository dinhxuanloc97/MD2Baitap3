import java.util.Scanner;

public class bai4TimPTLNmang2chieu {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào phần tử :");
        System.out.println("HÀng: ");
        int row = sr.nextInt();
        System.out.println("Cột:");
        int cols = sr.nextInt();

        int maxmix [][] = new int[row][cols];
         int max = 0 ;
        for (int i = 0; i < row ; i++) {
            for (int j =0 ; j < cols ; j++){
                System.out.println("Nhập phần tử cột và hàng("+i+","+j+")");
                maxmix[i][j] = sr.nextInt();
                if(i==j && j ==0 ) max = maxmix[i][j];
                if (maxmix[i][j]>max) max =maxmix[i][j];
            }
        }
        System.out.println("Mang 2 chieu :");
        for (int i = 0 ; i < maxmix.length; i++){
            for (int j = 0 ; j < maxmix[i].length;j++){
                System.out.printf("%d\t " ,maxmix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Max = " +max);
    }
}
