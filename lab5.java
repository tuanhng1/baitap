Bài thực hành số 5
	bài 1:
	import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tu nhien n: ");
        int n = scanner.nextInt();

        List<Integer> digits = new ArrayList<>();


        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            digits.add(digit);
            temp /= 10;
        }


        boolean isPalindrome = true;
        int size = digits.size();
        for (int i = 0; i < size / 2; i++) {
            if (digits.get(i) != digits.get(size - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(n + " la so thuan nghich");
        } else {
            System.out.println(n + "khong phai la so thuan nghich");
        }
    }
}

Bài 2:
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua day: ");
        int n = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        System.out.println("Nhap day so nguyen:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            stack.push(number);
        }

        System.out.print("Nhap so phan tu muon lay tu Stack: ");
        int m = scanner.nextInt();

        System.out.println("Các phần tử trong Stack:");
        for (int i = 0; i < m; i++) {
            if (stack.isEmpty()) {
                System.out.println("Stack da het phan tu.");
                break;
            }
            int element = stack.pop();
            System.out.println(element);
        }
    }
}

Bài 3:
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua day: ");
        int n = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Nhap day so nguyen:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            queue.add(number);
        }

        System.out.print("Nhap so phan tu muon lay tu Queue: ");
        int m = scanner.nextInt();

        System.out.println(cac phan tu trong Queue:");
        for (int i = 0; i < m; i++) {
            if (queue.isEmpty()) {
                System.out.println("Queue da het phan tu.");
                break;
            }
            int element = queue.poll();
            System.out.println(element);
        }
    }
}

Bài 4:
SỬ DỤNG SET:
	import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];
        System.out.println("Nhap mang so thuc:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        Set<Double> uniqueElements = new HashSet<>();
        Set<Double> duplicateElements = new HashSet<>();

        for (double num : arr) {
            if (!uniqueElements.add(num)) {
                duplicateElements.add(num);
            }
        }

        System.out.println("Cac phan tu xuat hien dung mot lan:");
        for (double num : uniqueElements) {
            if (!duplicateElements.contains(num)) {
                System.out.println(num);
            }
        }
    }
}
SỬ DỤNG MAP:
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];
        System.out.println("Nhap mang so thuc:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        Map<Double, Integer> countMap = new HashMap<>();

        for (double num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Cac phan tu xuat hien dung mot lan:");
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

Bài 5:
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];
        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        System.out.print("Nhap So thuc A: ");
        double A = scanner.nextDouble();

        Set<Double> uniqueElements = new TreeSet<>(Comparator.reverseOrder());

        for (double num : arr) {
            uniqueElements.add(num);
        }

        System.out.println("Mang co chua so thuc A? " + uniqueElements.contains(A));

        System.out.println("Cac phan tu xuat hien dung mot lan theo thu tu giam dan trong A:");
        for (double num : arr) {
            if (Collections.frequency(Arrays.asList(arr), num) == 1) {
                System.out.println(num);
            }
        }
    }
}

Bài 6:
import java.util.*;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;

    public SinhVien(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, SinhVien> danhSachSV = new HashMap<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            String maSV = scanner.nextLine();
            System.out.print("Ho va ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lop: ");
            String lop = scanner.nextLine();

            SinhVien sinhVien = new SinhVien(maSV, hoTen, lop);
            danhSachSV.put(maSV, sinhVien);
        }

        System.out.print("Nhap ten lop: ");
        String tenLop = scanner.nextLine();
        System.out.println("Danh sach sinh vien thuoc lop " + tenLop + ":");
        for (SinhVien sinhVien : danhSachSV.values()) {
            if (sinhVien.getLop().equals(tenLop)) {
                System.out.println("Ma Sinh Vien: " + sinhVien.getMaSV());
                System.out.println("Ho va ten: " + sinhVien.getHoTen());
                System.out.println("Lop: " + sinhVien.getLop());
                System.out.println("---------------------");
            }
        }

        System.out.print("Nhap ma sinh vien: ");
        String maSVDaNhap = scanner.nextLine();
        SinhVien sinhVienDaNhap = danhSachSV.get(maSVDaNhap);
        if (sinhVienDaNhap != null) {
            System.out.println("Thong tin sinh vien voi ma sinh vien " + maSVDaNhap + ":");
            System.out.println("Ho va ten: " + sinhVienDaNhap.getHoTen());
            System.out.println("Lop: " + sinhVienDaNhap.getLop());
        } else {
            System.out.println("Khong tim thay thong tin sinh vien " + maSVDaNhap);
        }
    }
}

Bài 7:
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Object> myArrayList = new ArrayList<>();

       
        int number = 10;
        myArrayList.add(number);

        
        double decimal = 3.14;
        myArrayList.add(decimal);

       
        boolean bool = true;
        myArrayList.add(bool);

        
        String string = "Hello";
        myArrayList.add(string);

       
        for (int i = 0; i < 4; i++) {
            Object element = myArrayList.get(i);
            System.out.println("Element " + (i + 1) + ": " + element);
        }
    }
}