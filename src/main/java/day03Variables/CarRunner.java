package day03Variables;

public class CarRunner {

    public static void main(String[] args) {
     /*
     object nasıl olusturulur
     class name+object name+assigmant operation+"new" keyword u+ constructor
     CONSTRUCTİON OBJE OLUSTURMAK İÇİN ÖZEL BİR METHOT
     NEW SIFIRDAN OBJE OLUSUMU İÇİN KULLANILIR

      */
      Car mycar =new Car();
        System.out.println("mycar.fiat = " + mycar.fiat);
        System.out.println("mycar.model = " + mycar.model);
        mycar.hareket();
        mycar.dur();

        Student aliCan =new Student();
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        System.out.println("aliCan.name = " + aliCan.name);
        aliCan.study();
        aliCan.feed();
        //homework içinde isim ve yas olsun pasif olarak teach metodu bulunan bir ödev

    }




}
