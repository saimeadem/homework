package day02Variables;

public class homework02 {

    public static void main(String[] args) {

      int sonuc= cevreHesapla(12,15) ;

        System.out.println(sonuc);
        int sonuc2= AlanHesapla(12,13);

        System.out.println(sonuc2);


    }

     public static int cevreHesapla(int a,int b){


        return (a*2)+(b*2);
     }
    public static int AlanHesapla(int a,int b){

        return a*b;
    }




}
