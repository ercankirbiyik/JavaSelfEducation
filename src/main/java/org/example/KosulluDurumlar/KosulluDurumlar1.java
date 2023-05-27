package org.example.KosulluDurumlar;

import java.util.Scanner;

public class KosulluDurumlar1 {
    public static void main(String[] args) {
        /*

        if (koşul) {
            Koşul sağlanınca (true) blok çalışacak
        }
        else {
                Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışacak.
        }

         */


        /*
        Örnek1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        if (yas < 18) {
            System.out.println("Bu mekana giremezsiniz...");
        }
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif...");
        }
        else {
            System.out.println("Pozitif veya sıfır...");
        }

    }
}
