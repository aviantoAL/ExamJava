import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang array
        System.out.print("Panjang array integer: ");
        int panjangArray = scanner.nextInt();

        // Membuat array integer dengan panjang yang dimasukkan pengguna
        int[] arrayInt = new int[panjangArray];

        // Meminta pengguna untuk memasukkan data ke dalam array
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("index [" + i + "] = ");
            arrayInt[i] = scanner.nextInt();
        }

        // Menampilkan panjang array
        System.out.println("Panjang array integer adalah " + panjangArray);

        // Menampilkan isi array
        System.out.print("array integer [");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print(arrayInt[i]);
            if (i < panjangArray - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");

        // Menutup objek Scanner
        scanner.close();
    }
}
