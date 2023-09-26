import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year, leapYear;

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen yıl giriniz: ");
        year = input.nextInt();
        leapYear = year % 4;

        if (leapYear == 0){
            System.out.println(year + "  bir artık yıldır");
        }else {System.out.println(year + "  bir artık yıl değildir !");}
    }
}