import java.util.Scanner;

public class Zodiak {
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

        // Menggunakan seleksi kondisi switch case untuk menentukan zodiak berdasarkan bulan dan tanggal lahir
        String zodiak;
        switch (bulanLahir) {
            case 1:
                zodiak = (tanggalLahir <= 19) ? "Capricorn" : "Aquarius";
                break;
            case 2:
                zodiak = (tanggalLahir <= 18) ? "Aquarius" : "Pisces";
                break;
            case 3:
                zodiak = (tanggalLahir <= 20) ? "Pisces" : "Aries";
                break;
            case 4:
                zodiak = (tanggalLahir <= 19) ? "Aries" : "Taurus";
                break;
            case 5:
                zodiak = (tanggalLahir <= 20) ? "Taurus" : "Gemini";
                break;
            case 6:
                zodiak = (tanggalLahir <= 20) ? "Gemini" : "Cancer";
                break;
            case 7:
                zodiak = (tanggalLahir <= 22) ? "Cancer" : "Leo";
                break;
            case 8:
                zodiak = (tanggalLahir <= 22) ? "Leo" : "Virgo";
                break;
            case 9:
                zodiak = (tanggalLahir <= 22) ? "Virgo" : "Libra";
                break;
            case 10:
                zodiak = (tanggalLahir <= 22) ? "Libra" : "Scorpio";
                break;
            case 11:
                zodiak = (tanggalLahir <= 21) ? "Scorpio" : "Sagittarius";
                break;
            case 12:
                zodiak = (tanggalLahir <= 21) ? "Sagittarius" : "Capricorn";
                break;
            default:
                zodiak = "Zodiak tidak diketahui";
        }

        // Menampilkan hasil
        System.out.println("Nama saya " + nama + ", zodiak saya " + zodiak);

        // Menutup objek Scanner
        scanner.close();
    }
}
