import java.util.Scanner;

public class hitungTotalHarga19 {
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp15,000");
        System.out.println("2. Cappuccino - Rp20,000");
        System.out.println("3. Latte - Rp22,000");
        System.out.println("4. Teh Tarik - Rp12,000");
        System.out.println("5. Roti Bakar - Rp10,000");
        System.out.println("6. Mie Goreng - Rp18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid, tidak ada pengurangan harga.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        if (pilihanMenu < 1 || pilihanMenu > 6) {
            System.out.println("Menu yang Anda pilih tidak tersedia.");
            return;
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        System.out.print("Masukkan kode promo (jika ada, tekan Enter jika tidak): ");
        sc.nextLine(); 
        String kodePromo = sc.nextLine().trim();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("\nTotal harga untuk semua pesanan Anda: Rp" + totalHarga);
    }
}
