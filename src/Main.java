import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Let's ask the user for a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int sayi = scanner.nextInt();
        int sum = 0;
        //Let's check that our number is positive and the given number is a perfect number.
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