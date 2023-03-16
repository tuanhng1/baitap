import java.util.Arrays;
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        
        
        int[] a = new int[n];
        
        
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        
        
        Arrays.sort(a);
        
        
        System.out.println("Mảng số ban đầu: " + Arrays.toString(a));
        System.out.println("Mảng sắp xếp theo thứ tự tăng dần: " + Arrays.toString(a));
    }
}