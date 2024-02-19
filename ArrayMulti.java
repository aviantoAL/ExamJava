import java.util.Scanner;

public class ArrayMulti {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah baris dan kolom array
        System.out.print("Baris Array Integer: ");
        int baris = scanner.nextInt();

        System.out.print("Kolom Array Integer: ");
        int kolom = scanner.nextInt();

        // Membuat array dua dimensi (matriks) dengan ukuran yang dimasukkan pengguna
        int[][] arrayInt = new int[baris][kolom];

        // Meminta pengguna untuk memasukkan data ke dalam matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(" [" + i + "]  [" + j + "] = ");
                arrayInt[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan jumlah baris dan kolom array
        System.out.println("Baris dan kolom array 2 dimensi adalah [" + baris + "," + kolom + "]");

        // Menampilkan isi matriks
        System.out.println("Matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println();
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
