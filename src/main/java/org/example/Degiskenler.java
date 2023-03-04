package org.example;

public class Degiskenler {

    //Java metodları tanımak için main metoduna ihtiyaç duymaktadır
    public static void main(String[] args){

        /*
        Tam Sayı tutma:

        byte, short, int ve long şeklinde 4 tane veri tipi var.

        byte = -128 ile 127 arasındaki verileri tutar.
        çok küçük veri tipleri için kullanılır. Hafizada 8 bitlik, 1 bytelık yer kaplar
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE); ile değer aralığı ekranda görülebilir.

        short = 2 bytelık, 16 bitlik yer kaplar. -32768 ile 32767 arasında değerler tutabilir.
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE); ile değer aralığı ekranda görülebilir


        int = -2^31'den +2^31'e kadar değer tutar. Sayısal verileri tutmak için kullanılan değişken tipi.
        Hafızada 32 bit, 4 bytelık yer kaplıyor(32 kutu gibi düşünülebilir.)
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE); ile değer aralığı ekranda görülebilir.

        int a=5, b=3, c=9;

        int d=(a+b+c-(7*5))/3;

        int e=a+b+c-7*5/3;

        System.out.println("Sonuç1: " + d);

        System.out.println("Sonuç2: " + e);


        Long = -9223372036854775808 ile 9223372036854775807 arasında çok yüksek sayı değerlerine tutabilmektedir.
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE); ile değer aralığı ekranda görülebilir.


        Ondalıklı Sayı Tutma:

        Double = 64 bit - 8 byte yer kaplar
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE); ile değer aralığı ekranda görülebilir.

        double a=5.24;
        double b=4.0;
        double c=4d;
        double d=4.23d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        Float = 32 bit - 4 byte yer kaplar
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE); ile değer aralığı ekranda görülebilir.


        float a=5.24; // Bu haliyle double olarak kabul ettiği için dönüştürme işlemini bizim yapmamızı istemektedir.

        Bu seçeneklerden herhangi biri yapılabilir.
        float a= (float) 5.24;
        float b=5f;
        float c=5.2f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



        Veri Tiplerini Dönüştürme

        byte --> short --> int --> long veri dönüştürme işlemi java tarafından soldan sağa doğru otomatik olarak yapılır,
        int i = 5;
        float a = i;
        double b= i; java kendisi bu dönüşümleri yapar

        fakat sağdan sola olan

        double c = 3.53;
        float j = c;   işlemini yapamaz.

        sağdan sola doğru yapılmak istendiğinde dönüştürmenin kullanıcı tarafından yapılması lazım.

        double c = 3.53;
        float j = (float) c; şeklinde double olan c değişkenini floata çevirmiş oluruz ve işlemleri yapar.



        byte x = 100;
        // byte y = x/2; bu blokta veri kaybı olacağı için bizim dönüştürme yapmamız gerekmektedir.
        byte y = (byte) (x/2);
        System.out.println(y);


        Short i=100;
        byte j=2;
        int k=4;
        long l=i+j+k;
        System.out.println(l); //burada veri tipleri birbirinden farklı ve java kendi kendine soldan sağa verileri birbirine dönüştürebilmektedir.


        double sayid1 = 70.25;
        double sayid2 = 60d;
        double sayid3 = 80.2;

        System.out.println("Ortalama D: " + (sayid1 + sayid2 + sayid3)/3); // 70.14999999999999

        float sayif1 = 70.25f;
        float sayif2 = 60f;
        float sayif3 = 80.2f;

        System.out.println("Ortalama F: " + (sayif1+sayif2+sayif3)/3); // 70.15

         */


        System.out.println("Good job");



    }
}
