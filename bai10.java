import java.util.Scanner;
public class bai10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        System.out.print("Nhập kí tự cần đếm: ");
        char ch = scanner.next().charAt(0);

        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        
        System.out.println("Số lần xuất hiện của kí tự '" + ch + "' trong chuỗi là: " + count);

        scanner.close();
    }
}

