import java.util.Arrays;

public class Warna {
    public static void main(String[] args) {
        String[] warna = {"hitam", "biru", "putih", "merah", "kuning"};

        System.out.println("Semua warna:");
        for (String w : warna) {
            System.out.println("Warnanya adalah " + w);
        }
        System.out.println("\nWarna kecuali 'putih':");
        for (String w : warna) {
            if (w.equals("putih")) {
                continue;
            }
            System.out.println("Warnanya adalah " + w);
        }
    }
}
