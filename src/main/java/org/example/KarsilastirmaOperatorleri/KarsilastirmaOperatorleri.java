package org.example.KarsilastirmaOperatorleri;

public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        /*

        == ---> Eşit mi?
        != ---> Eşit Değil mi?
        >  ---> Büyük mü?
        >= ---> Büyük vaya Eşit mi?
        <  ---> Küçük mü?
        <= ---> Küçük veya Eşit mi?

         */

        System.out.println(3 == 3); //true
        System.out.println(3 == 4); //false
        System.out.println(3 != 4); //true
        System.out.println(3 <= 4); //true
        System.out.println(3 >= 4); //false
        System.out.println(3 < 4); //true
        System.out.println(3 > 4); //false
        //Aşağıdaki örneklerde String değerlerde büyük, küçük karşılaştırması yapılmaya çalışıldığında hata alınacaktır.!!!
        System.out.println("Mehmet" == "Mehmet"); //true
        System.out.println("Mehmet" == "Ahmet"); //false
        System.out.println("Mehmet" != "Ahmet"); //true

    }
}
