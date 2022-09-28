import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào phần tử trong mang  : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int [n];
        for (int i = 0 ; i < n ; i++){
            System.out.println("Nhập giá trị trong mảng :");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng trươc khi xóa ");
        for (int i = 0 ; i <n ; i ++){
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
        System.out.println("Nhập vào giá trị  phần tử cần xóa :");
        int index = Integer.parseInt(sc.nextLine());
        int[] arrNew = new int[n -1];
        for (int i = 0; i <n ; i++){
            if (i<index){
                arrNew[i] = arr[i];
            } else if (i==index){
                continue;
            }else{
                arrNew[i-1] = arr[i];

            }
        }
        System.out.println("Mang sau khi xoa la :");
        for (int i = 0 ; i < n-1; i++){
            System.out.printf("%d\t",arrNew[i]);
//        }
        //Cách 2 *****
//        System.out.println("Nhập vào so phầ tu cua mang ");
//        int n = Integer.parseInt(sc.nextLine());
//        int[] old = new int[n];
//        System.out.println("NHập vào gia tr các phan tu cua mang ");
//        for ( int i = 0 ; i < old.length; i++);{
//            old[i] =Integer.parseInt(sc.nextLine());
//        }
//        // in ra phân tu trcv khi xóa
//        System.out.println(" gia tri phan tu trc khi xóa :");
//        for (int i = 0 ; i < old.length ; i ++){
//            System.out.printf("%d\t", old[i]);
//        }
//        System.out.printf("\n");
//        System.out.println("Nhập vào phần tử cần xoa ");
//        int deleteValue = Integer.parseInt(sc.nextLine());
//        int cnt = 0 ;
//        for (int i =0 ; i <old.length; i++){
//            if (old[i] == deleteValue) {
//                cnt++;
//            }
//        }
//        int[]arrnew = new int[old.length*cnt];
//        int index = 0 ;
//        for(int i = 0 ; i < old.length ; i ++){
//            if(old[i]==deleteValue){
//            }else {
//
//            }
        }
    }
}