// write a program to perform insertion sort in ascending order taking user input.

import java.util.*;

public class insertionSORT_ascending
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

        //insertion sort logic
        for( int i=1 ; i<index ; i++)
        {
            int j=i-1;
            int unsort=arr[i];
            while( j>=0 && arr[j]>unsort )
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=unsort;
        }

        //print the array
        for( int i=0 ; i<index ; i++ )
        {
            System.out.print("The value of "+i+"th index of the array : "+arr[i]);
            System.out.println();
        }
    }
}