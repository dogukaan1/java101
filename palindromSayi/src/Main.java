import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static boolean isPalindrom(int number){
        // geçici olarak kullanmak için temp değişkenini oluşturduk
        // tersini hesaplamak için de reverseNumber adında bir değişken oluşturduk
        // her basamağı geçici olarak saklaması için lastNumber oluşturduk
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            // Her döngü adımında, temp değişkeninin son basamağı lastNumber değişkenine atanır ('5')
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;

        else
            return false;

    }



    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int sayi=scan.nextInt();
       isPalindrom(sayi);






    }
}