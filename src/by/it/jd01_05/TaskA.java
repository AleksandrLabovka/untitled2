package by.it.jd01_05;
import java.lang.Math.*;
public class TaskA {
    public static void main(String[] args) {
step3();
    }
    public static void step1()
    {
        double a = 756.13;
        double x = 0.3;
        double z = Math.cos(Math.pow(x * x + (Math.PI) / 6, 5)) - Math.sqrt(x * (a * a * a)) - Math.log(Math.abs((a - 1.12 * x) / 4));
        System.out.println(z);
    }
    public static void step2()
    {
double a = 756.13;
double b =0.371;
double y= Math.tan(Math.pow(a+b,3))- Math.cbrt(a+1.5) + a* Math.pow(b,5) - b/(Math.log(a*a));
        System.out.println(y);
    }
    public static void step3()
    {
double x = 12.1;
        for (double a = -5; a <=12 ; a+=3.75) {
            double f = Math.exp(a*x) - 3.45*a;
            System.out.printf("При a = %6.2f f = %-10.2g\n", a,f);
        }

    }
}
