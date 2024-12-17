import java.util.Scanner;

public class aritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = 0;
        int remainder = 0;

        if (b != 0) {
            quotient = (double) a / b;
            remainder = a % b; //
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
        }

        System.out.println("Hasil Penjumlahan (sum): " + sum);
        System.out.println("Hasil Pengurangan (difference): " + difference);
        System.out.println("Hasil Perkalian (product): " + product);
        if (b != 0) {
            System.out.println("Hasil Pembagian (quotient): " + quotient);
            System.out.println("Hasil Sisa Bagi (remainder): " + remainder);
        }
 
        scanner.close();
    }
}
