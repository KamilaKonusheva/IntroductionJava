package lesson2;

import java.util.Arrays;

import static java.util.Arrays.deepToString;

public class Main {

        public static void main(String[] args) {
            int n = 1;
            System.out.println(n--);
            System.out.println(n++);
            System.out.println(n++);
            System.out.println(--n);
            System.out.println(n++);
            System.out.println(--n);
            System.out.println(++n);
            System.out.println(--n);
            System.out.println(n++); // или просто sout(n),sout(n--);


            //TODO: Доделать инкремент и декремент.

            byte a = 10, b = 16, c = 39;
            float d = 12.45F, e = 16.56F, f = 35.78F;

            short a1 = a;
            long b1 = b + 2;
            double e1 = e;
            double f1 = f + 1;
            short c1 = c;
            long b2 = b + c;

            double s = a1 + b1 + e1 + f1 + c1 + b2;
            String k = String.valueOf(s); // уточнить правильно ли преобразована строка
            System.out.println(k);

            /**
             * Создать одномерный и многомерный массивы
             */

            int[] ints = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
            System.out.println(Arrays.toString(ints));

            ints[0] = ints[0] * 2;
            ints[1] = ints[1] - 2;
            ints[2] = ints[2] * 2;
            ints[3] = ints[3] - 2;
            ints[4] = ints[4] * 2;
            ints[5] = ints[5] - 2;
            ints[6] = ints[6] * 2;
            ints[7] = ints[7] - 2;
            ints[8] = ints[8] * 2;
            ints[9] = ints[9] - 2;

            System.out.println(Arrays.toString(ints));

            int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            System.out.println(deepToString(matrice));

            int tempVar = matrice[0][0];
            matrice[0][0] = matrice[2][2];
            matrice[2][2] = tempVar;
            int tempVar1 = matrice[0][1];
            matrice[0][1] = matrice[2][1];
            matrice[2][1] = tempVar1;
            int tempVar2 = matrice[0][2];
            matrice[0][2] = matrice[2][0];
            matrice[2][0] = tempVar2;
            int tempVar3 = matrice[1][0];
            matrice[1][0] = matrice[1][2];
            matrice[1][2] = tempVar3;

            System.out.println(Arrays.deepToString(matrice));


        }
    }
