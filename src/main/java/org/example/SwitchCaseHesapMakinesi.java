package org.example;

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args){
        /*
        Switch-Case kullanarak 4 işlem yapan hesap makinesi tasarlama
            Kullanıcıdan bir işlem türü seçmesi istenecek ve
            seçilen işlem türüne göre kullanıcıdan alınan sayılar işlenip çıktı olarak sunulacak..
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************************");

        String islemler = "1. Toplama işlemi\n" +
                          "2. Çıkarma işlemi\n" +
                          "3. Çarpma işlemi\n" +
                          "4. Bölme işlemi";

        System.out.println(islemler);
        System.out.println("*******************************");

        System.out.print("İşlemi seçiniz: ");
        String islem = scanner.nextLine();

        int a;
        int b;
        switch (islem) {
            case "1":
                System.out.print("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.print("İkinci sayı : ");
                b = scanner.nextInt();
                System.out.print("Girilen değerlerin toplamı : "+ (a + b));
                break;

            case "2":
                System.out.print("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.print("İkinci sayı : ");
                b = scanner.nextInt();
                System.out.print("Girilen değerlerin farkları : "+ (a - b));
                break;

            case "3":
                System.out.print("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.print("İkinci sayı : ");
                b = scanner.nextInt();
                System.out.print("Girilen değerlerin çarpımı : "+ (a * b));
                break;

            case "4":
                System.out.print("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.print("İkinci sayı : ");
                b = scanner.nextInt();
                System.out.print("Girilen değerlerin bölümü : "+ ((double)a / b));
                break;

                // Kullanıcı 1-4 arasındaki işlemlerin dışında bir işlem seçerse(örn. 6) uyarı mesajı verilecek...
            default:
                System.out.print("Geçersiz işlem...");

        }
    }
}
