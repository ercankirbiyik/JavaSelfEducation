package org.example.ForDonguleri;

import java.util.Scanner;

public class ForDonguleri {
    public static void main(String[] args) {

        /*

        for (başlatma ; koşul ; arttırma veya azaltma işlemleri) {
            Döngü koşumuz doğru olduğu sürece burası çalışacak
        }

         */

        int i;

        for (i=0; i<5; i++) {
            System.out.print("i = " + i + "\n");
        }


        /*
        Aşağıda i1 değişkeni döngüye özgü bir değişken olmuş oluyor.
         */
        for (int i1=0; i1<4; i1++) {
            System.out.println("i1 = " + i1);
        }


        for (int i2 = 10; i2>=0; i2--) {
            System.out.println("i2 = " + i2);
        }


        int i3=0;

        /*
        Aşağıdaki döngüde yukarıda verdiğimiz 'i3' değerini direk kullanabilmesi için döngünün içinde ' ; ' kullanarak başlatıyoruz.
         */
        for (; i3<5; i3++) {
            System.out.println("Java Öğreniyorum");
        }


        int a = 0;
        int b = 10;

        for (; a<10 && b>0; a++ , b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }


        for (int i4 = 2; i4<100; i4 *=2) {
            System.out.println("i4 = " + i4);
        }



        // For döngüsü ile kullanıcıdan alınan bir değerin faktöriyelinin alınması

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");

        int faktoriyel = 1;

        int sayi = scanner.nextInt();

        for (int j = 1; j <= sayi; j++) {
            faktoriyel *= j;
            System.out.println("Faktoriyel = " + faktoriyel + " j= " + j);
        }
        System.out.println("Faktoriyel = " + faktoriyel);


    }
}
