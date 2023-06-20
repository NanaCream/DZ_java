
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            ArrayList<Integer> ar2 = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + ar);
            
            for (int i = 0; i < ar.size(); i++) {
                if (ar.get(i)%2!=0) {
                    ar2.add(ar.get(i));
                }
            }

            System.out.println("Список без четных чисел: \n " + ar2 );

            int min = ar.get(0);
            int max = ar.get(0);
            float sum = 0;
            for (int i = 0; i < ar.size(); i++) {
                int num = ar.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }


            float average = sum / ar.size();

            System.out.println("Минимальное значение: " + min);

            System.out.println("Максимальное значение: " + max);

            System.out.println("Среднее арифметическое значение: " + average);
        }
    }
}
