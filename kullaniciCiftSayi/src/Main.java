import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("sayı gir: ");
        int sayi=scan.nextInt();

        for (int i=0;i<=sayi;i++){
            if (i%2==0){
                System.out.println(i);
            }

        }



    }
}