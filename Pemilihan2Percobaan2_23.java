import java.util.Scanner;

public class Pemilihan2Percobaan2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String member;
        int jumlah_beli, harga = 0, pilihan_menu, potongan_QRIS = 1000;
        double total_bayar, diskon = 0.1, total_bayar_QRIS;

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

        System.out.println("-------------------------------------");
        
        if (member.equals("y")) {
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 12000;
                System.out.println("Harga Kopi = " +harga);
            }else if (pilihan_menu == 2) {
                harga = 7000;
                System.out.println("Harga Teh = " +harga);
            }else if (pilihan_menu == 3){
                harga = 20000;
                System.out.println("Harga Roti = " +harga);
            }
            total_bayar = harga - (harga * diskon) * jumlah_beli;
            total_bayar_QRIS = total_bayar - potongan_QRIS;
            System.out.println("Menu yang anda pilih: " +pilihan_menu);
            System.out.println("Total Bayar: " +total_bayar);
            System.out.println("Total dipotong QRIS: " +total_bayar_QRIS);
        }else if (member.equals("n")) {
            System.out.println("Tidak Mendapatkan Diskon");
            if (pilihan_menu == 1) {
                harga = 12000;
                System.out.println("Harga Kopi = " +harga);
            }else if (pilihan_menu == 2) {
                harga = 7000;
                System.out.println("Harga Teh = " +harga);
            }else if (pilihan_menu == 3){
                harga = 20000;
                System.out.println("Harga Roti = " +harga);
            }
            total_bayar = harga * jumlah_beli;
            total_bayar_QRIS = total_bayar - potongan_QRIS;
            System.out.println("Menu yang anda pilih: " +pilihan_menu);
            System.out.println("Total Bayar: " +total_bayar);
            System.out.println("Total dipotong QRIS: " +total_bayar_QRIS);
        }
    }
}
