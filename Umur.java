import java.util.Scanner;

public class Umur {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan tahun lahir dan tahun sekarang
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        System.out.print("Masukkan Tahun Sekarang: ");
        int tahunSekarang = scanner.nextInt();

        // Menghitung umur berdasarkan tahun lahir dan tahun sekarang
        int umur = tahunSekarang - tahunLahir;

        // Menampilkan informasi umur pada setiap tahun dari tahun lahir hingga tahun sekarang
        for (int i = 0; i < umur; i++) {
            System.out.println((umur - i) + " tahun pada tahun " + (tahunSekarang - i));
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
