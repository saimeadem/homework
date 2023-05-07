package day01variables;//icicnde bulunan pacgenin ismi

public class Variables01 {
    public static void main(String[] args) {
        //java bu satırı okumaz,kendimize veya başkalarına açıklamadır.
        /*
        java bu satırları da okumaz.birden fazla satır için kullanılır.
         */
        //Variable nasıl oluşturulur?
        //Data type + Variable name + Atama Opeartor (Assignment Operatore) +Vaiable değer + noktalı virgül
        int             age                  =                                      13              ;

        //java cümlesi => statement
        //Dilbisindeki nokta ne ise javadaki noktalı virgül(;) aynı şeydir.
        //Eger vaiable declaration yapar,Assiginment yapmazsanız java kendi default değerlerini koyar.
        //Default deger sayılar için sıfırdır.
        //Java da ''='' assiginment operator ve java bu operatoru gördüğü zaman önce sag tarafı çalıştırır.
        //Java da eşittir demek ==> ''==''  matematikte =     Javada ==
        //
        /* javada temel iki tip data vardır.
        1)primitve data type
              char, boolean, byte,  short,  int,  long,  float,  double
        2)non primitve data type
            string
         */
   //örnek 1: ögrenci ismi için variable oluşturup değer olarak Ali Can atayınız.
        String ogrenciAdi = "Ali Can";

        //Stringlere verilen değerler daima cift tırnak icinde olmalıdır.
        //Stringler için default value  (====>varsayılan deger) "null" dir.


        //char data type :'karakter'
         char yildiz='*';

        //boolean data type:
        //boolean lar sadece iki farklı değer alır; true veya false
        //isimlendirme yapışırken basına is konulur;
        //örnek3: boolean data type ında emeklimisin sorusu için bir variable olusturun ve false degerini atayın

           boolean isRetired=false;
       // byte -128 den baslar +127 dahil olarak bitiy0
        //byte data  tipinde öğrenci yası için

            byte StudentAge=127;
        //short data type =2 byte yer kaplıyor
        //short  -32768 +32767 ye kadar olan sayılar için kullanılır.
        //örnek 5 =site nüfusu için
        short siteNufusu=1234;
        //int data type tam sayılar için kullanılır+4 byte yer kaplar
        int ulkeNufusu=80000000;
        //long 8 byte yer kaplıyor çok büyük sayılar için kullanılır
        long galaksiUzakligi=123456789456456456L;
        //Egerki bir değer long ise sonuna l yada "L" KONULUR
         //float  ondalıklı  sayılar için kullanılır ---4 byte yer kaplar
        float shirtPrice = 12.99f;
        float  shoesPrice= 15.99f;

        //double ndalıklı sayılar için --- 8 byte yer kaplar -- ondalıklı kısım fazlaysa  double

        double maasOdeme=124567.087567;

        //Ornek10: Ogrenci notları için iki adet variable olusturun ve ekrana yansıtınız;
         //...............ekrana yazdırmak icin............



        System.out.println("ALİCAN");//ekrana yazdırmak icindir.
        //......................
         byte not1=55;
         byte not2=33;

        System.out.println(not1+not2);

        //
    }




}