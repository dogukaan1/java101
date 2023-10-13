import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,i=0,largest=0,smallest=0;
        boolean ilkSayi=true;
        System.out.print("How many numbers will you enter:");
        n= input.nextInt();
        while (i<n){
            i++;
            System.out.print("Enter the number: ");
            int sayi=input.nextInt();
            if(ilkSayi){
                largest=sayi;
                smallest=sayi;
                ilkSayi=false;
            }else{
                if(sayi>largest){
                    largest=sayi;
                }if (sayi<smallest){
                    smallest=sayi;
                }
            }
        }
        System.out.println("Largest:"+largest);
        System.out.print("Smallest:"+smallest);
    




    }
}