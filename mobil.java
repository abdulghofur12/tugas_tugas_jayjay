public class mobil {
    public static void main(String[] args) {
        // Deklarasi array merek mobil
        String[] merekMobil = {
                "Mitsubishi",
                "Tesla",
                "Honda",
                "Nissan",
                "Kia",
                "Hyundai"
        };

        // Mencetak array merek mobil
        System.out.println("Daftar Merek Mobil:");
        for (int i = 0; i < merekMobil.length; i++) {
            System.out.println((i + 1) + ". " + merekMobil[i]);
        }
    }
}
