package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * xyz
 * xyz
 * xyz
 *
 * @param
 */

public class Main {

    public static void main(String[] args) { //komentarz 1
	/*
	k
	o
	m
	e
	n
	t
	 a
	 r
	 z
	 2
	 */

       /*System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");

        System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota");

        int a = 333;
        double b = 4.21;
        String s = "tekst";
        System.out.printf("a=%5d, b=%.2f, s=%10s %n", a, b, s); //%d lub %s to ilość znaków po = , %f to ilość znaków po .*/
        //System.out.println("Nazwaliśmy to \"witaminą B3\"");

       /* System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10) {
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
        }*/
/*
        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%f\t\n", i, Math.log(i));*/
       // }


        Scanner input = new Scanner (System.in);
        /*int num1, num2;
        System.out.println("Podaj pierwszą liczbę: ");
        num1= input.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        num2 = input.nextInt();

        //System.out.printf("Wynik dodawania %d+%d=%d%n", num1, num2, num1+num2);
        /*
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        do {
            System.out.println("Podaj pierwszą liczbę: ");
            num1 = input.nextInt();
            if (num1 == 0) break;
            System.out.println("Podaj drugą liczbę: ");
            num2 = input.nextInt();
            if (num2 == 0) break;
            System.out.printf("Wynik dodawania %d+%d=%d%n", num1, num2, num1 + num2);
        } while (true);
        */

        //10 testowo liczby kolejno z pętli
      /* public static String toHexString(int);
        System.out.printf("DEC=\tBIN=\tHEX=\n");

        for (int i = 1; i < 10; i++) {

            System.out.printf("%d\t%f\t\n", i, toHexString, Math.log(i));
*/
        //}


        /*System.out.println("arg\tlog2(arg)\tsum(arg)\n");
        double sumaPoteg=0;
        double x=2;
        for (int i = 0; i <10;i++) {
            sumaPoteg+=Math.pow(x,i);
            System.out.printf("%d\t%f\t%f\n", i, Math.log(i), sumaPoteg);
        }*/

       /* System.out.println("Podaj liczbę: ");
        int i = input.nextInt();
        System.out.println("Liczba w postaci dwójkowej(binarnej): "+Integer.toBinaryString(i));
        System.out.println("Liczba w postaci szesnastkowej: "+Integer.toHexString(i));
*/
        //12
       /* int[] liczby = new int[30];
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            liczby[i]=random.nextInt(); //pobiera i zapisuje do tablicy
        }
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        long avg=0;
        for (int l:liczby) {
            System.out.println(l);
            if (l<minValue) minValue=l;
            if (l>maxValue) maxValue=l;
            avg+=l;
        }
        System.out.printf("Minimum=%d, Maximum = %d, Average = %f", minValue,maxValue, (float)avg/liczby.length);
*/


        Account acc = new Account();
        acc.setName("piotr gołabek");
        System.out.println(acc.getName());
        System.out.println(Account.capitalize("irmina gorecka"));


















    }

   /* private static String leftPad(String aText, char aChar, int aWidth){
String res=aText;
        for (int i = 0; i < aWidth -aText.length(); i++)
            res=aChar+res;
        return res;*/



    }



//}
