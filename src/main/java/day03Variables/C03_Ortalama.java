package day03Variables;

public class C03_Ortalama {

    /*
     double num1 = 23.4;
     double num2 = 24.0;
     double num3 = 12;
     double num4 = 450.3;
     double num5 = 100;
      bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */
    public static void main(String[] args) {
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;


        double toplam = num1 + num2 + num3 + num4 + num5;

        System.out.println("toplam = " + toplam);

// ortalama = toplam/sayı adedi

        double ortalama = toplam / 5 ;
        System.out.println("ortalama = " + ortalama);










    }


}

