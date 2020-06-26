package lesson3;

import java.sql.SQLOutput;

public class MyMath {

    public static int plus (int a , int b){
        int pl = a + b;
        System.out.println("result:" + pl);
        return pl;

    }
    public static int dil (int a,int b){
        int d = a / b;
        System.out.println("result:" + d);
        return d;

    }
    public double minus (double a, double b){
        double min = a - b;
        System.out.println("result:" + min);
        return min;

    }
    public double mul (double a, double b){
        double m = a * b;
        System.out.println("result:" + m);
        return m;
    }
}
