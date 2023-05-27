package org.example.KosulluDurumlar;

import java.util.Scanner;

public class MinimumBulma {
    public static void main(String[] args) {

        // Kullanıcıdan alınan 3 sayıdan en küçünü bulma

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayı : ");
        int a = scanner.nextInt();

        System.out.print("İkinci sayı : ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü sayı : ");
        int c = scanner.nextInt();

        int min = -1;

        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("En küçük sayı : " + min);
    }
}
