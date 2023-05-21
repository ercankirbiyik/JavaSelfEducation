package org.example;

import java.util.Scanner;

public class BedenKitleIndeksiKosulluDurumlar {
    public static void main(String[] args) {

        /*
        Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksini şu kurallı göz önünde bulundurarak hesaplama ve çıktı üretme

        Beden kitle indeksi: Kilo / Boy(m) * Boy(m)

        BKI : 18.5'in altındaysa        --------> Zayıf
              18.5 ile 25 arasında ise  --------> Normal
              25 ile 30 arasında ise    --------> Fazla kilolu
              30'un üstünde ise         --------> Obez
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuz: ");
        int kilo = scanner.nextInt();

        System.out.println("Boyunuz: ");
        double boy = scanner.nextDouble();

        double bki = (kilo / (boy * boy));

        System.out.println("Beden kitle endeksiniz: " + bki);
        if (bki < 18.5) {
            System.out.println("Zayıfsınız...");
        } else if (bki >= 18.5 && bki < 25) {
            System.out.println("Kilonuz normal...");
        } else if (bki >= 25 && bki < 30) {
            System.out.println("Fazla kilolusunuz...");
        } else if (bki >= 30) {
            System.out.println("Obezsiniz!!!");
        } else {
            System.out.println("Hesaplama yapılamadı!!!");
        }

    }
}
