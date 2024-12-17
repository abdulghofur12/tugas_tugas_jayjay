import java.util.Scanner;

public class Perbandingan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan bilangan bulat pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan bulat kedua: ");
        int bilangan2 = scanner.nextInt();

        System.out.println(bilangan1 + " == " + bilangan2 + ": " + (bilangan1 == bilangan2) + " (Apakah kedua bilangan sama?)");
        System.out.println(bilangan1 + " != " + bilangan2 + ": " + (bilangan1 != bilangan2) + " (Apakah kedua bilangan tidak sama?)");
        System.out.println(bilangan1 + " > " + bilangan2 + ": " + (bilangan1 > bilangan2) + " (Apakah bilangan pertama lebih besar dari bilangan kedua?)");
        System.out.println(bilangan1 + " >= " + bilangan2 + ": " + (bilangan1 >= bilangan2) + " (Apakah bilangan pertama lebih besar atau sama dengan bilangan kedua?)");
        System.out.println(bilangan1 + " < " + bilangan2 + ": " + (bilangan1 < bilangan2) + " (Apakah bilangan pertama lebih kecil dari bilangan kedua?)");
        System.out.println(bilangan1 + " <= " + bilangan2 + ": " + (bilangan1 <= bilangan2) + " (Apakah bilangan pertama lebih kecil atau sama dengan bilangan kedua?)");


        scanner.close();
    }
}

//abdul ghofur
