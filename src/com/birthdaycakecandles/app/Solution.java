package com.birthdaycakecandles.app;

import java.util.Scanner;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        //Variables declaration
        int candlesNumber = 0;
        int result = 0;

        //Object declaration
        Scanner in = new Scanner(System.in);
        //Input candles number
        candlesNumber = in.nextInt();
        //Array declaration
        int candlesArray[] = new int[candlesNumber];

        //Input candles height
        for(int i =0; i < candlesNumber; i++)
        {
            candlesArray[i] = in.nextInt();
        }

        //Get result
        result = birthdayCakeCandles(candlesArray);
        //Output result
        System.out.println(result);
        //Close input
        in.close();
    }

    static int birthdayCakeCandles(int[] candlesArray)
    {
        //Variables declaration
        int candleCount = 0;
        int maxHeight = 0;

        //Sort array
        Arrays.sort(candlesArray);
        //Get max number
        maxHeight = candlesArray[candlesArray.length-1];

        //Find the numbers equal to the max number
        for(int i = candlesArray.length-1; i >= 0; i--)
        {
            if(maxHeight == candlesArray[i])
            {
                candleCount++;
            }
        }

        return candleCount;
    }
}
