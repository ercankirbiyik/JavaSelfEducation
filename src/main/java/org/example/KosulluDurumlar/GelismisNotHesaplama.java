package org.example.KosulluDurumlar;

import java.util.Scanner;

public class GelismisNotHesaplama {
    public static void main(String[] args) {

    /*

    Kullanıcıdan Vize1, Vize2 ve Final notlarını alarak bir harf notu hesaplama sistemi.

    Ayrıca kullanıcıdan okuldaki genel not ortalaması alınarak
    DD alma veya not ortalamasının 2.50 altında olması durumunda ekrana bir tavsiye yazdırma.

    Kurallar:
        * Vize1 toplum notun %30 una etki eder
        * Vize2 toplum notun %30 una etki eder
        * Final toplum notun %40 ına etki eder

    Koşullar:
        * Toplam not >= 90 ----> AA
        * Toplam not >= 85 ----> BA
        * Toplam not >= 80 ----> BB
        * Toplam not >= 75 ----> CB
        * Toplam not >= 70 ----> CC
        * Toplam not >= 65 ----> CD
        * Toplam not >= 60 ----> DD
        * Toplam not >= 55 ----> FD
        * Toplam not <  55 ----> FF

     */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize1 notu : " );
        int vize1 = scanner.nextInt();
        System.out.print("Vize2 notu : " );
        int vize2 = scanner.nextInt();
        System.out.print("Final notu : " );
        int finalNot = scanner.nextInt();

        System.out.print("Okul ortalamanız : ");
        double ortalama = scanner.nextDouble();

        double toplamNot = (vize1 * 3/10) + (vize2 * 3/10) + (finalNot * 4/10);

        if (toplamNot >= 90) {
            System.out.println("Harf notunuz : AA ve geçtiniz...");
        } else if (toplamNot >= 85) {
            System.out.println("Harf notunuz : BA ve geçtiniz...");
        } else if (toplamNot >= 80) {
            System.out.println("Harf notunuz : BB ve geçtiniz...");
        } else if (toplamNot >= 75) {
            System.out.println("Harf notunuz : CB ve geçtiniz...");
        } else if (toplamNot >= 70) {
            System.out.println("Harf notunuz : CC ve geçtiniz...");
        }else if (toplamNot >= 65) {
            System.out.println("Harf notunuz : DC ve geçtiniz...");
        }else if (toplamNot >= 60) {
            System.out.println("Harf notunuz : DD ve koşullu geçtiniz...");
                if (ortalama < 2.5){
                    System.out.println("DD aldınız ve Not ortalamanız düşük. Bu dersi tekrar almayı düşünebilirsiniz...");
                }
        }else if (toplamNot >= 55) {
            System.out.println("Harf notunuz : FD ve kaldınız...");
        }else if (toplamNot < 55) {
            System.out.println("Harf notunuz : FF ve kaldınız...");
        }else {
            System.out.println("Hatalı not girdiniz!!!");
        }

    }
}
