import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("1. sayıyı gir: ");
        int sayi1=scan.nextInt();

        System.out.println("2. sayıyı gir: ");
        int sayi2=scan.nextInt();

        System.out.println("toplamak için 1, çıkartmak için 2, çarpmak için 3, bölmek için 4e bas");

        int select=scan.nextInt();

        switch (select){
            case 1:
                int tpl= sayi1+sayi2;
                System.out.println(tpl);
                break;
            case 2:
                int cik= sayi1-sayi2;
                System.out.println(cik);
                break;
            case 3:
                int carp= sayi1*sayi2;
                System.out.println(carp);
                break;
            case 4:
                int bol= sayi1/sayi2;
                System.out.println(bol);
                break;



        }





    }
}