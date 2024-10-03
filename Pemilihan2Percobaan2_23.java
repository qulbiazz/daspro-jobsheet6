import java.util.Scanner;

public class Pemilihan2Percobaan2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String member, metode_pembayaran;
        int jumlah_beli, harga = 0, pilihan_menu, potongan_QRIS = 1000;
        double total_bayar, diskon = 0.1;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-------------------------");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Roti");
        System.out.println("-------------------------------------");

        System.out.print("Masukkan angka dari menu yang dipilih: ");
        pilihan_menu = input.nextInt();
        System.out.print("Masukkan Jumlah Beli: ");
        jumlah_beli = input.nextInt();
        System.out.print("Apakah punya member (y / n)? = ");
        member = input.next();
        System.out.print("Masukkan Metode Pembayaran (Tunai / QRIS): ");
        metode_pembayaran = input.next();

        System.out.println("-------------------------------------");

        if (member.equals("y")) {
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 12000;
                System.out.println("Harga Kopi = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 7000;
                System.out.println("Harga Teh = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 20000;
                System.out.println("Harga Roti = " + harga);
            } else {
                System.out.println("Masukkan Menu yang benar");
                return;
            }

            total_bayar = harga - (harga * diskon) * jumlah_beli;
            System.out.println("Menu yang anda pilih: " + pilihan_menu);
            System.out.println("Total Bayar: " + total_bayar);
            if (metode_pembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= 1000;
                System.out.println("Total Bayar QRIS: " + total_bayar);
            }

        } else if (member.equals("n")) {
            System.out.println("Tidak Mendapatkan Diskon");
            if (pilihan_menu == 1) {
                harga = 12000;
                System.out.println("Harga Kopi = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 7000;
                System.out.println("Harga Teh = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 20000;
                System.out.println("Harga Roti = " + harga);
            } else {
                System.out.println("Masukkan Menu yang benar");
                return;
            }
            total_bayar = harga * jumlah_beli;

            System.out.println("Menu yang anda pilih: " + pilihan_menu);
            System.out.println("Total Bayar: " + total_bayar);

            if (metode_pembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= 1000;
                System.out.println("Total Bayar QRIS: " + total_bayar);
            }
        }
    }
}
