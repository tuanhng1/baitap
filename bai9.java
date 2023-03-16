import java.util.Scanner;

public class bai9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi kí tự: ");
        String str = scanner.nextLine();

        int countLowerCase = 0;
        int countUpperCase = 0;
        int countNumbers = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                countLowerCase++;
            } else if (Character.isUpperCase(ch)) {
                countUpperCase++;
            } else if (Character.isDigit(ch)) {
                countNumbers++;
            }
        }

        System.out.println("Số lượng chữ hoa trong chuỗi: " + countUpperCase);
        System.out.println("Số lượng chữ thường trong chuỗi: " + countLowerCase);
        System.out.println("Số lượng kí tự số trong chuỗi: " + countNumbers);
    }

	}

