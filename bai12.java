import java.util.Scanner;
public class bai12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int hang = input.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cot = input.nextInt();
        
        int[][] matran = new int[hang][cot];
        
        
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Nhập phần tử [%d][%d]: ", i, j);
                matran[i][j] = input.nextInt();
            }
        }
        

        int max = matran[0][0];
        int a = 0, b = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (matran[i][j] > max) {
                    max = matran[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        
        System.out.printf("Phần tử lớn nhất là %d tại vị trí [%d][%d]", max, a, b);
    }
}