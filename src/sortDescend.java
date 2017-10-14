package edu.kapiva;

public class sortDescend
{
    public static void sort(int[] ints)
    {
        for (int i = 0; i < ints.length - 1; i++)
        {
            int maxPos = maximumPosition(ints, i);
            swap(ints, i, maxPos);
        }
    }
    
    private static int maximumPosition(int[] ints, int from)
    {
        int maxPos = from;
        for (int i = from + 1; i < ints.length; i++)
        {
            if (ints[i] > ints[maxPos])
            {
                maxPos = i;
            }
        }
        return maxPos;
    }
    
    public static void swap(int[] ints, int i, int j)
    {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }
}