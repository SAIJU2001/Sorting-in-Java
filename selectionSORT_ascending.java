// write a program to perform selection sort in ascending order taking user input.

import java.util.*;

public class selectionSORT_ascending
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index for the array : ");
        int index = Sc.nextInt();
        System.out.println();
        int arr[] = new int[index];

        // array input
        for( int i=0 ; i<index ; i++ )
        {
            System.out.print("Enter the value of "+i+"th index of the array : ");
            arr[i] = Sc.nextInt();
        }
        System.out.println();

        //selection sort logic
        for( int i=0 ; i<index-1 ; i++)
        {
            int small=i;
            for( int j=i+1 ; j<index ; j++ )
            {
                if( arr[small]>arr[j] )
                small=j;
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }

        //print the array
        for( int i=0 ; i<index ; i++ )
        {
            System.out.print("The value of "+i+"th index of the array : "+arr[i]);
            System.out.println();
        }
    }
}