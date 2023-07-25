import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan: "); // input bilangan
        int num = scanner.nextInt();
        boolean isZero = isZero(num); // assign nilai return dari method isZero() ke variable isZero

        // statement dari nilai variabel isZero
        if (isZero) System.out.println("Bilangan " + num + " memenuhi kondisi.");
        else System.out.println("Bilangan " + num + " tidak memenuhi kondisi.");
    }

    public static boolean isZero(int num) {
        // inisialisasi nilai false ke variabel isZero
        boolean isZero = false;
        // jika kondisi terpenuhi, nilai isZero berubah menjadi true
        if (num % 3 == 0 && num % 5 == 0) isZero = true;
        return isZero;
    }
}