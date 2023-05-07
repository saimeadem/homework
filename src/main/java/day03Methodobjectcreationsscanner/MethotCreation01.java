package day03Methodobjectcreationsscanner;

public class MethotCreation01 {

    public static void main(String[] args) {

        //ornek1: verilen bir ondalık sayının küpünü hesaplayan bir method olusturup kullanınız.

        double kup = getCube(5);
        System.out.println("kup = " + kup);

        print("java is easy");

        // method olusturmak icin 2.yol
        //girilen bir kelimeyi ekrana yazdıran bir method olusturup kullanınız.


        square(123);
      int sonuc=  cevreHesapla(7);
        System.out.println("sonuc = " + sonuc);
        //method ismi ve parametreleri yazarız

        double sonuc2=daireAlani(12);
        System.out.println("daire alanı = " + sonuc2);
    //yeni homework

    }

    static double getCube(double a) {
        // acceess modifier ı default yapmak isterseniz "i" yazmayınız!!!!!!  default yazmadan java algılar yazar
        return a * a * a;

    }


// ornek:2 girilen bir kelimeyi ekrana yazdıran bir method olusturup kullanınız.

    public static void print(String str) {


    }

    private static void printconsole(String str) {
        System.out.println(str);
    }

    // eger bir method yeni bir data uretmiyorsa retun type i void olur.
    //eger methodun return type i void ise method body icinde return keyword yazılmaz.
    //verilen bir tamsayının karesini oluşturan method yapın
    public static void square(int a) {

        System.out.println(a * a);
    }

//homework****
    /*
    1)cemberin cevresini olusturan method olustur kullan

     2)daire alanını hesaplayan metodu olustur kullan
     */

  public static int cevreHesapla(int r){
      return 2*3*r;
  }
  public static double daireAlani(int r){
      return 3.14*r*r;
  }


       //yeni homework

}
