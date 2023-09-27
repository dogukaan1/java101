import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("n sayısını gir: ");
        int s1=scan.nextInt();
        System.out.print("r sayısını gir: ");
        int s2=scan.nextInt();

        int f=1;
        int f1=1;
        int f2=1;
        int s3=s1-s2;
        for (int i=1;i<=s1;i++){
            f*=i;

        }
        for (int i=1;i<=s2;i++){
            f1*=i;

        }
        for (int i=1;i<=s3;i++){
            f2*=i;

        }
        int kom=f/(f1*f2);
        System.out.println("kombinasyonları: "+kom);






    }
}