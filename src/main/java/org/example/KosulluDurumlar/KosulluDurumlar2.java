package org.example.KosulluDurumlar;

import java.util.Scanner;

public class KosulluDurumlar2 {
    public static void main(String[] args) {
        /*

        if (koşul) {
            1. Koşulumuz
        }
        else if (başka bir koşul) {
            2. Koşulumuz
        }
        else if (başka bir koşul) {
            3. Koşulumuz
        }
                //
                //
        else {

        }

         */


        /*

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen işlem giriniz: ");

        int islem = scanner.nextInt();

        if (islem == 1) {
            System.out.println("1.işlem");
        } else if (islem == 2) {
            System.out.println("2.işlem");

        } else if (islem == 3) {
            System.out.println("3.işlem");

        } else if (islem == 4) {
            System.out.println("4.işlem");

        } else {
            System.out.println("Geçersiz işlem...");

        }

         */

        // Harf notu hesaplama örneği
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz: ");

        Double not = scanner.nextDouble();

        if (not >= 90) {
            System.out.println("AA");
        } else if (not >= 85) {
            System.out.println("BA");

        } else if (not >= 75) {
            System.out.println("CB");

        } else if (not >= 70) {
            System.out.println("CC");

        } else if (not >= 65) {
            System.out.println("DC");

        } else if (not >= 60) {
            System.out.println("DD");
        } else {
            System.out.println("Dersten kaldınız...");

        }
    }
}
