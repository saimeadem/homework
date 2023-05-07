package day03Variables;

public class C05_MethodCreation {

    //iki sayının karelerinin toplamını bulan ve yazdıran bir method oluşturun.
    //main methodun içinde tanımladıgın iki sayının karelerinin toplamını bulan ve yazdıran bir method oluşturun.


    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        kareToplami();
    }

    public static void kareToplami() {

        int kareToplami = 3 * 3 + 4 * 4;
        System.out.println("kareToplami = " + kareToplami);


    }


}
