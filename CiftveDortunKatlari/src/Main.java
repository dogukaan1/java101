// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
        kabul eden ve girilen değerlerden çift ve
        4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
        int n=0,total=0;
        // Scanner ataması konsoldan değer alabilmek adına
        Scanner scan = new Scanner(System.in);
        // Koşul da negatif bir sayı girene kadar dediği için while kullanılacaktır ama do while daha mantıklı
        do {
            System.out.print("Sayınızı Giriniz: ");
            n = scan.nextInt();
            if (n % 2 == 0 || n % 4 == 0) {
                total += n;
                System.out.println("Çift sayı ve 4'e tam bölünebilen sayıların toplamı: " + total);
            } else {
                System.out.println("Tek sayı girdiniz. ");
                break;
            }
        }
        while(n>0);
        System.out.println("Çift sayı ve 4'e tam bölünebilen sayılar Toplam: " + total + "\n");

        }
    }
