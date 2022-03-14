package pl.lublin.wsei.java.cwiczenia;
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

        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");

        System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota");

        int a=333;
        double b=4.21;
        String s="tekst";
        System.out.printf("a=%5d, b=%.2f, s=%10s %n", a,b,s); //%d lub %s to ilość znaków po = , %f to ilość znaków po .
        System.out.println("Nazwaliśmy to \"witaminą B3\"");

        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i <370;i+=10){
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        }

        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");
        for (int i = 0; i <10 ;i++){
            System.out.printf("%d\t%f\t\n", i, Math.log(i));
        }

    }


}
