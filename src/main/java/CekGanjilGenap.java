import java.util.Scanner;
public class CekGanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka 1 - 10: ");
        int angka = scanner.nextInt();

        if (angka < 1 || angka > 10) {
            System.out.println("angka di luar jangkauan");
        } else if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
        scanner.close();
    }

}
