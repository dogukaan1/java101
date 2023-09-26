import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu gir: ");
        int kenar1= scan.nextInt();

        System.out.print("2. kenar uzunluğunu gir: ");
        int kenar2= scan.nextInt();

        int kenar1kare=kenar1*kenar1;
        int kenar2kare=kenar2*kenar2;

        int kenar3kare=kenar1kare+kenar2kare;
        double kenar3=Math.sqrt(kenar3kare);

        System.out.println("1. kenar uzunluk: "+kenar1);
        System.out.println("2. kenar uzunluk: "+kenar2);
        System.out.println("hipotenus uzunluğu: "+kenar3);

        double alan=(kenar1*kenar2)/2;
        System.out.println("dik üçgenin alanı: "+alan);


        }

}