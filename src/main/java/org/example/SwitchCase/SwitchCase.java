package org.example.SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*

        switch(op) {
            case durum1 :
                işlemler
                break
            case durum2 :
                işlemler
                break
                //
                //
            default:
                işlemler
                break
                }

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir işlem giriniz: ");
        int islem = scanner.nextInt();

        switch (islem) {
            case 1:
                System.out.println("1. işlem");
                break; // break kullanılmadığında diğer caseler sağlanmasa bile caselerin içine girecektir!!!
            case 2:
                System.out.println("2. işlem");
                break;
            case 3:
                System.out.println("3. işlem");
                break;
            case 4:
                System.out.println("4. işlem");
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }

    }
}
