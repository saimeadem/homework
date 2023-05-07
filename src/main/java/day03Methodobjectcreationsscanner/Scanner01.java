package day03Methodobjectcreationsscanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //scanner class dan obje olustur
        // input : içeri alınan demek
        Scanner input=new Scanner(System.in);
        //ikinci adım kullanıcıya ne istediğinize dair mesaj veriniz
        System.out.println("LÜTFEN YAŞINIZI GİRİNİZ :");
        //ÜÇÜNCÜ ADIMDA UYGUN METODU KULLANARAK KULLANICININ VERDİĞİ DATAYI MEMORY E YERLESTİR
       byte age= input.nextByte();

        System.out.println("age = " + age);

    }
}
