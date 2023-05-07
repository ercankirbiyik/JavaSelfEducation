package org.example;

public class MantiksalOperatorler {
    public static void main(String[] args) {
        /*
        Mantıksal Operatörler

        && ---> AND Operatörü
            Bütün sonuçlar kendi içinde true ise genel sonuç true, bir sonuç bile false ise genel sonuç false olur.

        || ---> OR Operatörü
            Sanuçlardan en az bir tanesi bile true ise genel sonuç true, hepsi false ise genel sonuç false olur.

        ! ---> NOT Operatörü
            Sonuçları tersine döndürür
         */

        System.out.println(3==3); //TRUE
        System.out.println(2<3); //TRUE
        System.out.println("Ercan" == "Ercan"); //TRUE
        System.out.println(3 ==3 && 2>3); //FALSE
        System.out.println(3 != 3 || 2>3 || "Ercan" == "Ercan"); //TRUE
        System.out.println(!(3<4)); //FALSE
        System.out.println(!((3<4 && "Ercan" == "Ercan") || 3.4>2.1)); //FALSE(İşlemin sonucu true olmasına rağmen parantezin başındaki not operatöründen dolayı false çıkıyor.)
    }
}
