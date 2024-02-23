import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть позитивне число: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Будь ласка, введіть позитивне число.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Сума чисел від 1 до " + n + " дорівнює " + sum);
        }
        scanner.close();
    }
}