import java.util.Random;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        int[] dataPoints = new int[100];
        int sum = 0;
        double ave = 0;
        Scanner in = new Scanner(System.in);
        int target;
        boolean done = false;
        int targetCounter = 0;
        int min;
        int max;
        double average;

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = gen.nextInt(100)+ 1;
        }
        average = getAverage(dataPoints);
        System.out.println("The average is " + average);














    }

    /**
     * Takes an array and gets it's sum
     *
     * @param values The array that you are using
     * @return The sum
     */
    public static int sum(int values[])
    {
        int retVal = 0;
        for (int i = 0; i < values.length; i++)
        {
            retVal += values[i];
        }

        return retVal;
    }

    /**
     * This code averages out the array
     *
     * @param values the array that you are using
     * @return The average
     */
    public static int getAverage(int values[])
    {
        int sum = 0;
        int retVal = 0;
        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        retVal = sum / values.length;

        return retVal;
    }

    /**
     * This program takes the number of occurances of a certain number in an array of numbers and returns it to the user
     *
     * @param values The array that it scans
     * @param target The target value the program is looking for.
     * @return
     */
    public static int occuranceScan(int values[], int target)
    {
        int retval = 0;
        boolean done = false;
        for (int i = 0; i < values.length; i++) {
            if(values[i] == target) {
                retval++;
                done = true;
            }
        }
        return retval;
    }

    /**
     * Program that finds the minumum and returns its value
     *
     * @param values The array that it is looking through
     * @return the minimum
     */
    public static int min(int values[])
    {
        int min = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values [i] < min) // new min
                min = values[i]; // so save it
        }
        return min;
    }

    /**
     * A program that takes an array and finds the max
     *
     * @param values The array that it is looking through
     * @return the maximum
     */
    public static int max(int values[])
    {
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values [i] > max) // new max
                max = values[i]; // so save it

        }
        return max;
    }

    /**
     *
     * @param values This is the array you are searching
     * @param target This is the target you want to know if it is in the array
     * @return This is a boolean that is true if it finds the target
     */
    public boolean contains(int values[], int target)
    {
        boolean retval = false;
        boolean done = false;
        for (int i = 0; i < values.length; i++) {
            if(values[i] == target) {
                retval = true;
            }
        }
        return retval;
    }
}