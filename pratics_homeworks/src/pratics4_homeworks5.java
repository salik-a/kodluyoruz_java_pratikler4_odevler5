/**
 * @author salika
 */
import java.util.Arrays;
import java.util.Scanner;
public class pratics4_homeworks5 {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    static void fibo(int count) {
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);//printing 0 and 1
        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu alınacak sayı giriniz :");
        int n = scan.nextInt();
        System.out.print("Mod sayısını giriniz :");
        int m = scan.nextInt();
        int result = n%m;
        System.out.println("Sonuç : " + result);
    }
    static void alan() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını giriniz :");
        int n = scan.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz :");
        int m = scan.nextInt();
        int result = 2*(n+m);
        System.out.println("Sonuç : " + result);
    }
    static int power(int base,int power){
        if(power==0)
            return 1;
        else
            return (base*power(base,power-1));
    }
    static boolean prime(int n,int i){

        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return prime(n, i + 1);
    }
    static void Pattern(int value){


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println();
        System.out.println("---------------------------Practice1--------------------------------");
        System.out.println();
        System.out.println("---------------------------Palindrom numbers--------------------------------");
        System.out.println();

        System.out.println("Please enter number : ");
        int a = scan.nextInt();
        if(isPalindrom(a))
            System.out.println(a+" is a polindrom number");
        else
            System.out.println(a+" is not a polindrom number");





        /*

        System.out.println();
        System.out.println("---------------------------Practice2--------------------------------");
        System.out.println();
        System.out.println("---------------------------Program to Find Fibonacci Series with Recursive--------------------------------");
        System.out.println();


        System.out.println("Enter how many fibonacci numbers to write : ");
        int count= scan.nextInt();
        fibo(count);



         */

        /*
        System.out.println();
        System.out.println("---------------------------Practice3--------------------------------");
        System.out.println();
        System.out.println("---------------------------Calculator--------------------------------");
        System.out.println();

        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alan();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
            System.out.println();
            System.out.println("-------------------------------------------------");
            System.out.println();
        } while (select != 0);


         */
        /*
        System.out.println();
        System.out.println("---------------------------Homework1--------------------------------");
        System.out.println();
        System.out.println("---------------------------Power Calculator Program--------------------------------");
        System.out.println();

        System.out.println("Enter base number : ");
        int base2= scan.nextInt();
        System.out.println("Enter power number : ");
        int power2 = scan.nextInt();
        int result = power(base2,power2);
        System.out.println("Result : "+result);



         */
        /*
        System.out.println();
        System.out.println("---------------------------Homework2--------------------------------");
        System.out.println();
        System.out.println("---------------------------Prime Number Finder Program--------------------------------");
        System.out.println();

        System.out.println("Enter number : ");
        int num= scan.nextInt();
        if (prime(num,2))
            System.out.println("Prime number");
        else
            System.out.println("Not prime number");
         */

        /*
        System.out.println();
        System.out.println("---------------------------Homework3--------------------------------");
        System.out.println();
        System.out.println("---------------------------Creating Methods by Pattern--------------------------------");
        System.out.println();

        System.out.println("Enter number : ");
        int N= scan.nextInt();
        System.out.println("N number : "+N);
        System.out.print("Output : ");
        Pattern(N);


         */


    }}

