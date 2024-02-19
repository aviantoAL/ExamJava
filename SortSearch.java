import java.util.Scanner;
import java.util.Arrays;

public class SortSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        int[] data = inputData(jumlahData);

        // Menampilkan data sebelum diurutkan
        System.out.println("Data sebelum diurutkan: " + Arrays.toString(data));

        // Melakukan pengurutan data menggunakan bubble sort
        bubbleSort(data);

        // Menampilkan data setelah diurutkan
        System.out.println("Data setelah diurutkan: " + Arrays.toString(data));

        // Input data yang akan dicari
        System.out.print("Masukkan data yang akan dicari: ");
        int target = scanner.nextInt();

        // Melakukan pencarian data menggunakan binary search
        int index = binarySearch(data, target);

        // Menampilkan hasil pencarian
        if (index != -1) {
            System.out.println("Data " + target + " ditemukan pada indeks " + index);
        } else {
            System.out.println("Data " + target + " tidak ditemukan");
        }

        scanner.close();
    }

    // Method untuk input data dengan tipe data integer
    private static int[] inputData(int jumlahData) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }
        return data;
    }

    // Method untuk bubble sort (pengurutan)
    private static void bubbleSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // Tukar data[j] dan data[j+1]
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Method untuk binary search (pencarian)
    private static int binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (data[mid] == target) {
                return mid; // Data ditemukan
            } else if (data[mid] < target) {
                low = mid + 1; // Cari di setengah kanan
            } else {
                high = mid - 1; // Cari di setengah kiri
            }
        }

        return -1; // Data tidak ditemukan
    }
}
