package org.pouliot;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int len = 10;
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) numbers[i] = (int) Math.round(Math.random()*100);

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += numbers[i];
        }

        float moyen = (float) sum / (float) len;

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        System.out.println(Arrays.toString(numbers));
        System.out.println("Sommes: " + sum);
        System.out.println("Moyenne: " + moyen);
        System.out.println("Minimum: " + min);
        System.out.println("Minimum: " + max);
    }
}
