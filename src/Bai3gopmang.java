import java.util.Scanner;

public class Bai3gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai mang 1");
        int index1 = scanner.nextInt();
        int[] arr1 = new int[index1];
        System.out.println("nhap phan tu mang 1");
        for (int i = 0; i < index1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("nhap chieu dai mang 2");
        int index2 = scanner.nextInt();
        int[] arr2 = new int[index2];
        System.out.println("nhap phan dai mang 2");
        for (int i = 0; i < index2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[index1 + index2];
        System.out.println("mang moi sau khi gop");
        for (int i = 0; i < (index1 + index2); i++) {
            if (i <= index1-1) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i-index1];
            }
        }
        for (int i = 0; i < (index1 + index2); i++) {
            System.out.printf("%d", arr3[i]);
        }

    }
}
