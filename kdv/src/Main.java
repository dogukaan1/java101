import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("fiyatı girin:");
        int price= scan.nextInt();
        if (price<=1000 && price>0){
            double a= price*1.18;
            System.out.println("fiyat: "+price);
            System.out.println("kdvli fiyat: "+a);
            double b=a-price;
            System.out.println("kdv tutarı: "+b);

        }
        else  if (price>=1000){
            double c= price*1.08;
            System.out.println("fiyat: "+price);
            System.out.println("kdvli fiyat: "+c);
            double d=c-price;
            System.out.println("kdv tutarı: "+d);

        }


    }
}