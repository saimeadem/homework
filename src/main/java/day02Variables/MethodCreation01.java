package day02Variables;


public class MethodCreation01 {
    /*
    Javada method nasıl olusturulur
    1) clas içinde oluşturulur
    2)ilk etapta access modifieryazılır
    3) return type yazılır
    4)isim verilir
    5){} parantez koyulur
    6)olusturmak çalıştırmak için yeterli değildir . kullanılmak istenen method main methodun içinden kullanılır
    kullanmak için  isim +() yapmak gerekli

      ------ access Modifier + Return type + method ismi+( )+{}------
     */

    public static void main(String[] args) {


        //örnek 1: toplama işlemi yapan bir method oluşturunuz.
        int sonuc = toplamaYap(3, 5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(5, 12);
        System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));

    }

    public static int toplamaYap(int a, int b) {
        //bu kısımda method kapsamında kullanılmasını işlenmesini istediğim sayıları deklare ediyoruz

        return a + b;
        //return demek bu metodun çağırıldığı yere bu değeri return et döndür demek
    }

    protected static long multiply(int a, int b) {

        return a * b;


    }
    //örnek 3 verilen 3 sayıdan ilk ikisini carpan ve sonucu üçüncü sayı ile toplayan örnek oluşturunuz

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {

        return a*b+c;
    }


}
