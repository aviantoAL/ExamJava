import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memilih operator
        System.out.println("Choose an operator: +, -, *, or /");
        char operator = scanner.next().charAt(0);

        // Meminta pengguna untuk memasukkan dua angka
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        // Menggunakan switch case untuk melakukan operasi berdasarkan operator yang dipilih
        double result = 0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Memeriksa pembagian dengan nol
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    // Mengakhiri program jika terjadi pembagian dengan nol
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                // Mengakhiri program jika operator tidak valid
                System.exit(1);
        }

        // Menampilkan hasil operasi
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        // Menutup objek Scanner
        scanner.close();
    }
}
