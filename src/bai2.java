import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        /*
        input
        8 nhập số phần tử và khoi tao mang
        nhập giá trị chèn  mang
        thêm gia trị vào mân
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào phần tử của mảng:");
        int n = Integer.parseInt(sc.nextLine());
        int[] old = new int[n];
        System.out.println("Nhập giá trị  mảng");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("old[%d]=",i);
            old[i] = Integer.parseInt(sc.nextLine());
        }
        //B2 In giá trị các phần tử trước khi thêm :
        System.out.println("Giá trị các phần tử mảng trước khi thêm :");
        for (int  i = 0 ; i < old.length ; i++){
            System.out.printf(" %d\t",old[i]);
        }
        System.out.println("\n");
        //b3  Nhập vào giá trị cần thêm và trie số cần chèm
        System.out.println("Nhập vào giá trị cần thêm vào mảng");
        int valueInsert = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào chi số cần chèn vào mảng :");
        int indexInset = Integer.parseInt(sc.nextLine());
        // khoi tao 1 mang mơi chứa ....
        int[] arrNew = new int[old.length+1];
        // copy phần tử mảng old và thềm phân tu vào mảng arr
        for (int i = 0 ; i < arrNew.length; i++){
            if(i<indexInset){
                arrNew[i] = old[i];
            }else if (i==indexInset){
                arrNew[i] = valueInsert;

            }else {
                arrNew[i] = old [i -1];

            }

        }
        //b6 In ra các phần tử sau khi thêm một 1 phần tư
        System.out.println("giá trị các phần tử sau khi thêm mới :");
        for (int i = 0 ; i< arrNew.length ; i++) {
            System.out.printf("%d\t" ,arrNew[i]);
        }
        System.out.println("\n");
    }
}
