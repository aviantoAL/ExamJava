import java.util.Arrays;
import java.util.Scanner;

public class ArrayMenuDua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1d = null;
        int[][] array2d = null;

        while (true) {
            System.out.println("MENU");
            System.out.println("I. Array 1 Dimensi");
            System.out.println("II. Array 2 Dimensi");
            System.out.println("III. EXIT");

            System.out.print("Masukkan Input: ");
            String menuInput = scanner.next();

            switch (menuInput) {
                case "I":
                    System.out.println("a. Input Array 1 Dimensi");
                    System.out.println("b. Sort Array 1 Dimensi");
                    System.out.println("c. Search di Array 1 Dimensi");
                    System.out.println("d. EXIT Sub Menu");

                    System.out.print("Masukkan Input: ");
                    String subMenuInput1D = scanner.next();

                    switch (subMenuInput1D) {
                        case "a":
                            System.out.print("Masukkan panjang array: ");
                            int length = scanner.nextInt();
                            array1d = inputArray1D(length);
                            break;
                        case "b":
                            if (array1d != null) {
                                sortArray1D(array1d);
                            } else {
                                System.out.println("Array belum diinput. Silakan input terlebih dahulu.");
                            }
                            break;
                        case "c":
                            if (array1d != null) {
                                searchArray1D(array1d);
                            } else {
                                System.out.println("Array belum diinput. Silakan input terlebih dahulu.");
                            }
                            break;
                        case "d":
                            break; // Keluar dari submenu Array 1 Dimensi
                        default:
                            System.out.println("Input tidak valid. Silakan coba lagi.");
                    }
                    break;

                case "II":
                    System.out.println("a. Input Array 2 Dimensi");
                    System.out.println("b. Sort Array 2 Dimensi");
                    System.out.println("c. Search di Array 2 Dimensi");
                    System.out.println("d. EXIT Sub Menu");

                    System.out.print("Masukkan Input: ");
                    String subMenuInput2D = scanner.next();

                    switch (subMenuInput2D) {
                        case "a":
                            System.out.print("Masukkan jumlah baris: ");
                            int rows = scanner.nextInt();
                            System.out.print("Masukkan jumlah kolom: ");
                            int cols = scanner.nextInt();
                            array2d = inputArray2D(rows, cols);
                            break;
                        case "b":
                            if (array2d != null) {
                                sortArray2D(array2d);
                            } else {
                                System.out.println("Array belum diinput. Silakan input terlebih dahulu.");
                            }
                            break;
                        case "c":
                            if (array2d != null) {
                                searchArray2D(array2d);
                            } else {
                                System.out.println("Array belum diinput. Silakan input terlebih dahulu.");
                            }
                            break;
                        case "d":
                            break; // Keluar dari submenu Array 2 Dimensi
                        default:
                            System.out.println("Input tidak valid. Silakan coba lagi.");
                    }
                    break;

                case "III":
                    System.exit(0); // Keluar dari program
                    break;

                default:
                    System.out.println("Input tidak valid. Silakan coba lagi.");
            }
			
			System.out.println("======================================");
        }
    }

    private static int[] inputArray1D(int length) {
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < length; i++) {
            System.out.print("Array index " + i + " : ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static void sortArray1D(int[] array) {
        Arrays.sort(array);
		System.out.println("=================================");
        System.out.print("Sorted Array adalah ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void searchArray1D(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int target = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Nilai " + target + " ditemukan pada index " + index);
        } else {
            System.out.println("Nilai " + target + " tidak ditemukan dalam array.");
        }
    }

    private static int[][] inputArray2D(int rows, int cols) {
        int[][] array = new int[rows][cols];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Array index " + i + ", " + j + " : ");
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    private static void sortArray2D(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
		
		System.out.println("===============================");
        System.out.println("Sorted Array 2 Dimensi adalah:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void searchArray2D(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("Nilai " + target + " ditemukan pada index " + i + ", " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Nilai " + target + " tidak ditemukan dalam array.");
        }
    }
}
