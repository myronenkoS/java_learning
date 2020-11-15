package Exercises;

import java.util.*;

public class Ex_4 {
    public static void main(String[] args) {
        NewClass f = new NewClass();
        f.arrayAndNumber(20, 2);
    }
}

class NewClass {
    int x;
    int q;
    int w = 0;

    void arrayAndNumber(int num, int c) {
        x = num;
        int min = 0;
        int max = 10;
        int diff = max - min;
        q = c;

        Random r = new Random();
        int[] array = new int[x];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(diff + 1);

        }
        System.out.println("Массив который генерится: " + Arrays.toString(array));
        //подсчет совпадений
        for (int t : array) {
            if (t == q)
                w++;
        }
        System.out.println("Цифра которую ищем: " + q + "\nКоличество цифр которые ищем: " + w);

    }
}

// Всякое говнецо)

        /*
        int[] intArray = new int[testArray.length];
        for (int i = 0; i<intArray.length;i++){
            intArray[i] = Integer.parseInt(testArray[i]);
        }

        private static void itsMyVoid(List<Integer> list, int c) {
            int cnt = 0;
            for (int i : list) {
                if (i == c)
                    cnt++;
            }
            System.out.print(cnt);
        }

         */

//Scanner scan = new Scanner(System.in);
//System.out.println("Enter numbers");
//List<String> wordList = Arrays.asList("1" , "3" , "5");
// String[] wordsArray = (String[]) wordList.toArray();
// for (String world:wordsArray){
//   System.out.println(world);
//}

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Для создания массива введите ряд чисел через запятую");
        String strList = scan.nextLine();
        String[] testArray = strList.split(",");

        int[] intArray = new int[testArray.length];
        for (int i = 0; i<intArray.length;i++){
            intArray[i] = Integer.parseInt(testArray[i]);
        }
        int q = 5;
        int z=0;
        for (int w: intArray) {
            if (w == q)
                z = ++z;
        }
        System.out.println(z);

 */