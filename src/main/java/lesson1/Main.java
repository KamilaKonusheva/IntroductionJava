package lesson1;

public class Main {

    public static void main(String[] args) {

        String helloHillel = "Hello Hillel";
        String helloHillel2 = "Hello Hillel";
        String wrongHillel = new String ("Hello Hillel");
        System.out.println("Hello Hillel");

        byte byteName = 10;
        short shortName = 20;
        long longName = 2002;
        float floatName = 15.44F;
        char charName = 'n';
        boolean booleanName = false;

        System.out.println(byteName);
        System.out.println(shortName);
        System.out.println(longName);
        System.out.println(floatName);
        System.out.println(charName);
        System.out.println(booleanName);

        int first = 55, second = 150, third = 350;
        double a= 13.35 , b= 55.87, c= 15.20;

        System.out.println(first - 15);
        System.out.println(second + 10);
        System.out.println(third / 5);
        System.out.println(first % 4);
        System.out.println(third * 2);

        System.out.println(a - 1);
        System.out.println(b + 2);
        System.out.println(c * 4);
        System.out.println(b / 3);
        System.out.println(a % 8);

        int var = 3005;
        var += 5;
        var -= 10;
        var *= 2;
        var /= 20;
        var %= 2;
        var += 300;
        var -= 50;
        var /= 4;
        var *= 3;
        var += 100;

        System.out.println("var:" + var);

        System.out.println(var > 500);
        System.out.println(var >= 200);
        System.out.println(var == 280);
        System.out.println(var != 390);
        System.out.println(var <= 400);
        System.out.println(var < 287);



    }
}

