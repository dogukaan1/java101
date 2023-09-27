import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir: ");
        int sayi=scan.nextInt();
        System.out.println("kuvvet gir: ");
        int kuvvet=scan.nextInt();

        int snc=0;
        for (int i=0;i<=kuvvet;i++){
             snc=sayi*sayi;

        }
        System.out.println("sonuc: "+snc);


    }
}