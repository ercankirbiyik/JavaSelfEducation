package org.example.WhileDonguleri;

import java.util.Scanner;

public class WhileDonguleri {
    public static void main(String[] args) {
        /*
            For dongülerinde döngü değişkenlerini arttırma-azaltma işlemleri otomatik olarak yapılıyor
                fakat While döngülerinde bu işi programcıların yapması lazım.
                Döngü değerlerini arttırma veya azaltma işlemlerini kodun içinde vermemiz gerekmektedir.

        /*

        while (Dongü koşulu) {
            Koşul doğru olduğu sürece çalışacak alan
        }

         */

        /*
        for (int i=0; i<10; i++){
            System.out.println("i = " + i);
        }
         */


        int i=0;

        while (i<10){
            System.out.println("i = " + i);
            i++;
        }

        int j = 10;
        while (j<100){
            System.out.println("j = " + j);
            j *= 2;
        }

        // Faktöriyel işleminin While döngüsü ile yapılması

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktöriyel : " + faktoriyel);


        /* Sonsuz döngü
            Aşağıdaki örnekte while döngüsünde döngü değerimizi arttırmayı ve sınırlamayı unuttuğumuz için
            döngümüz sonsuz döngü olmuştur ve işlemimiz döngüden çıkamamaktadır.
            Sonuç sürekli olarak h=0 bastıracaktır.
         */

        int h = 0;
        while (h < 10) {
            System.out.println("h = " + h);
        }


    }
}
