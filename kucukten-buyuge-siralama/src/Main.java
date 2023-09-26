import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayıyı gir: ");
        int s1=scan.nextInt();
        System.out.println("2. sayıyı gir: ");
        int s2=scan.nextInt();
        System.out.println("3. sayıyı gir: ");
        int s3=scan.nextInt();
        if (s1 > s2 && s1 > s3){
            if (s2>s3){
                System.out.println(s3+"<"+s2+"<"+s1);
            } else if (s3>s2) {
                System.out.println(s3+"<"+s2+"<"+s1);

            }

        } else  if (s2 > s1 && s2 > s3){
            if (s1>s3){
                System.out.println(s3+"<"+s1+"<"+s2);
            } else if (s3>s1) {
                System.out.println(s1+"<"+s3+"<"+s2);

            }

        }else  if (s3 > s1 && s3 > s2){
            if (s1>s2){
                System.out.println(s2+"<"+s1+"<"+s3);
            } else if (s2>s1) {
                System.out.println(s1+"<"+s2+"<"+s3);

            }

        }


    }
}