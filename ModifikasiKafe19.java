public class ModifikasiKafe19 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("selamat datang, " + namaPelanggan);

        if (isMember){
            System.out.println("anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50% untuk setiap pembelian");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30% untuk setiap pembelian");
        } else {
            System.out.println("Kode promo tidak valid");
        }

        System.out.println("=====MENU RESTO KAFE=====");
        System.out.println("1. kopi hitam - Rp 15,0000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. teh tarik - Rp 12,000");
        System.out.println("5. roti bakar - Rp 10,000 ");
        System.out.println("6. mie goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }
    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
    }
}
