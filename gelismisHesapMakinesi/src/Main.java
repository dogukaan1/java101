import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int topla(int a,int b ){

        return a+b;

    }
    static int cikarma(int a,int b ){

        return a-b;

    }
    static int carpma(int a,int b ){

        return a*b;


    }
    static int bolme(int a,int b ){


        return a/b;

    }
    static void usluSayi(int a,int b){
      int snc=1;
        for (int i=b;i>0;i--){
            snc*=a;
        }
        System.out.println("CEVAP = " + snc);



    }
    static void faktoriyel(int a){
        for (int i=a-1;i>0;i--){
            a*=i;
        }
        System.out.println("faktoriyel:"+a);

    }
    static int modAl(int a,int b){
        return a%b;


    }











    public static void main(String[] args) {
        System.out.println("yapacağınız işlemi seçin 1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n"
                );
        Scanner scn=new Scanner(System.in);
        int secim= scn.nextInt();
        switch (secim)
        {
            case 1:
                System.out.println("toplama işlemini seçtiniz toplanacak 2 sayıyı giriniz");
                System.out.print("1.sayi: ");
                int s1=scn.nextInt();
                System.out.print("2.sayi: ");
                int s2=scn.nextInt();
                System.out.println(topla(s1,s2));
                break;
            case 2:
                System.out.println("çikartma işlemini seçtiniz cikacak 2 sayıyı giriniz");
                System.out.print("1.sayi: ");
                int a1=scn.nextInt();
                System.out.print("2.sayi: ");
                int a2=scn.nextInt();
                System.out.println(cikarma(a1,a2));
            case 3:
                System.out.println("çarpma işlemini seçtiniz çarp 2 sayıyı giriniz");
                System.out.print("1.sayi: ");
                int b1=scn.nextInt();
                System.out.print("2.sayi: ");
                int b2=scn.nextInt();
                System.out.println(carpma(b1,b2));
            case 4:
                System.out.println("bolme işlemini seçtiniz bolunecek 2 sayıyı giriniz");
                System.out.print("1.sayi: ");
                int c1=scn.nextInt();
                System.out.print("2.sayi: ");
                int c2=scn.nextInt();
                System.out.println(bolme(c1,c2));
            case 5:
                System.out.println("üs alma işlemini seçtiniz  2 sayıyı giriniz");
                System.out.print("taban: ");
                int d1=scn.nextInt();
                System.out.print("kuvvet: ");
                int d2=scn.nextInt();
                usluSayi(d1,d2);
            case 6:
                System.out.println("faktoriyel alma işlemini seçtiniz sayıyı giriniz");
                System.out.print("sayı: ");
                int e1=scn.nextInt();

                faktoriyel(e1);
            case 7:
                System.out.println("mod işlemini seçtiniz modlanacak 2 sayıyı giriniz");
                System.out.print("1.sayi: ");
                int f1=scn.nextInt();
                System.out.print("2.sayi: ");
                int f2=scn.nextInt();
                System.out.println(modAl(f1,f2));



        }







    }
}