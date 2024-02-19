import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Variabel untuk menyimpan pilihan pengguna
        int pilihan;

        // Loop do-while untuk menampilkan menu dan melakukan tindakan sesuai dengan pilihan pengguna
        do {
            System.out.println("MENU");
            System.out.println("1. Cetak Menu 1");
            System.out.println("2. Cetak Menu 2");
            System.out.println("3. Cetak Menu 3");
            System.out.println("4. EXIT");

            // Meminta pengguna untuk memasukkan nomor menu
            System.out.print("Input nomor : ");
            pilihan = scanner.nextInt();

            // Menjalankan tindakan sesuai dengan pilihan pengguna
            switch (pilihan) {
                case 1:
                    System.out.println("Menu 1");
                    break;
                case 2:
                    System.out.println("Menu 2");
                    break;
                case 3:
                    System.out.println("Menu 3");
                    break;
                case 4:
                    System.out.println("<Program Exited>");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih nomor menu yang benar.");
            }

        } while (pilihan != 4); // Loop akan berlanjut selama pengguna tidak memilih EXIT (nomor 4)

        // Menutup objek Scanner
        scanner.close();
    }
}
