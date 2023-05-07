package day03Variables;

public class day03 {
    public static void main(String[] args) {

        int yas = 36;
        int sayi = 50;
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(35);
        System.out.println(35);
        System.out.println(35);
        System.out.println(35);
        System.out.println(35);

// etikrtiyle birlikte yazdırma.

        System.out.println("sayi =  " + sayi);
        //ctrl alt L     kod düzenleme
        //bir variable etiketiyle birlikte yazdırmanın kısa yolu= soutv
        System.out.println("sayi = " + sayi);

        // string bir variable olusturun."" içinde yazılır. buyuk harfle baslar.

        String isim = "Ali";
        System.out.println("isim = " + isim);

        //olusturdugum variable baska bir variableye kopyala
        //yeni bir variable olusturalım benim yasım ve bu değeri yas variable değerine eşit olsun
        int benimYasim = yas;
        System.out.println("benimYasim = " + benimYasim);

        String onunİsmi = isim;
        System.out.println("onunİsmi = " + onunİsmi);
        System.out.println("onunİsmi = " + onunİsmi);

        //aynı satırda coklu variable deklare et.
        int yil = 2023, ay = 5, gun= 15;
        // az once olusturdugumuz isim variable değegerini veli olarak belirle
        isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunİsmi = " + onunİsmi);
        //java yukarıdan asagı ve soldan saga calısır.
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

        //bir vaiable deklare et:x         deger atamak zorunda degiliz. deklare etmek=tanımlamak
        double x;

        //bir variable başlat:y     deger atamak zorundayız.
        double y = 12.5;

        //başka bir variable başlat: z

        double z = 33; // java buraya yazdıgımız degeri 33,0 olarak algıladı ve hata vermedi.

        // x değişkenini y değişkeni ile başlat.
        x = y;    // bir variable bir scope(main method) da sadece bir kere deklare edilir.

        //veriable y yi güncelle.

        y = 13.9;   //ondalıklı sayılarda nokta kullanılır.
         // değişkenleri yazdır.
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);





    }
}
