import java.util.Scanner;
public class PengunjungCafe19 {
    public static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("daftar nama pengunjung:");
        for (String pengunjung : namaPengunjung) { 
            System.out.println("- " + pengunjung);

        }
    }
    public static void main(String[] args) {
        daftarPengunjung("ali", "budi", "citra");
    }
}
