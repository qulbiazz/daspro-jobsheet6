import java.util.Scanner;

public class Pemilihan2Percobaan3_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kategori;
        int penghasilan, gaji_bersih;
        double pajak;

        System.out.print("Masukkan Kategori: ");
        kategori = input.nextLine();
        System.out.print("Masukkan Besar Penghasilan: ");
        penghasilan = input.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            }else if (penghasilan <= 3000000) {
                pajak = 0.15;
            }else{
                pajak = 0.2;
            }
            gaji_bersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji Bersih: " +gaji_bersih);
        }else if(kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            }else if (penghasilan <= 3500000) {
                pajak = 0.2;
            }else{
                pajak = 0.25;
            }
            gaji_bersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji Bersih: " +gaji_bersih);
        }
        else{
            System.out.println("Kategori Salah");
        }
    }
}
