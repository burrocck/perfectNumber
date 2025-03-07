import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayi = scanner.nextInt();
        int sum = 0;
        if (sayi > 0) {
            for (int i = 1; i < sayi; i++) {

                if (sayi % i == 0) {
                    sum = sum + i;
                }
            }
            if (sayi == sum) {
                System.out.println(sayi + " " + "Mükkemmel sayıdır.");
            } else {
                System.out.println(sayi + " " + "Mükkemmel sayı değildir.");

            }

        }else {
            System.out.println(sayi+" "+"Lütfen pozitif bir sayı giriniz.");
        }
        scanner.close();
    }
}