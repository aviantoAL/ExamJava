import java.util.Scanner;

	public class Bulan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan data
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur berdasarkan tahun sekarang (2024)
        int umur = 2024 - tahunLahir;

        // Menampilkan informasi berdasarkan data yang diinput
        System.out.println("Nama saya " + nama + ", lahir " + tanggalLahir + " " +
                getNamaBulan(bulanLahir) + " " + tahunLahir + " berumur " + umur + " tahun.");

        // Menutup objek Scanner
        scanner.close();
    }

    // Metode untuk mendapatkan nama bulan berdasarkan nomor bulan
    private static String getNamaBulan(int bulan) {
        String[] namaBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return namaBulan[bulan];
    }
}