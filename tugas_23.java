import java.util.Scanner;

public class tugas_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jns_bk;
        double diskon = 0;
        double harga = 20000, total, total_diskon;
        int jml_buku;

        System.out.print("Masukkan Jenis Buku: ");
        jns_bk = input.nextLine();
        System.out.print("Masukkan Jumlah Buku: ");
        jml_buku = input.nextInt();

        if (jns_bk.equalsIgnoreCase("kamus")) {
            diskon = 0.1;
            if (jml_buku > 2) {
                diskon += 0.02;
            }
            total_diskon = diskon * (jml_buku*harga);
            total = (harga * jml_buku) - total_diskon;

            System.out.println("Total diskon: " +total_diskon);
            System.out.println("Total Bayar: " +total);
        }
        else if (jns_bk.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jml_buku > 3) {
                diskon += 0.02;
            }else{
                diskon += 0.01;
            }
            total_diskon = diskon * (jml_buku*harga);
            total = (harga * jml_buku) - total_diskon;

            System.out.println("Total diskon: " +total_diskon);
            System.out.println("Total Bayar: " +total);
        }
        else{
            
            if (jml_buku > 3) {
                diskon += 0.05;
            }
            total_diskon = diskon * (jml_buku*harga);
            total = (harga * jml_buku) - total_diskon;

            System.out.println("Total diskon: " +total_diskon);
            System.out.println("Total Bayar: " +total);
        }
    }
}
