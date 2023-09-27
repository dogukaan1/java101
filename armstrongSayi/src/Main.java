// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner sınıfından input adında bir nesne türettik
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan isteğimizi belirtiyoruz
        System.out.println("Bir Sayı giriniz: ");

        //Kullanıcının girdiği sayıyı alıp sayi değişkenine atıyoruz
        int sayi = input.nextInt();

        // Basamak toplamını saklamak için bir değişken oluşturuyoruz ve başlangıç değeri olarak 0 atıyoruz.
        int toplam = 0;

        // Sayı 0'dan büyük olduğu sürece çalışsın diyoruz
        while(sayi != 0){
            toplam += sayi % 10;  // sayının kalanını bulup toplam değişkenine ekler
            sayi = sayi / 10;  // sayıyı 10'a bölerek son basamağı atar.Bu sayede bir sonraki turda bir basamak daha aşağı inilir.
        }
        System.out.println(toplam);
    }
}