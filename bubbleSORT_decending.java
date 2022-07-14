// write a program to bubble sort in Decending order.

import java.util.*;
 
public class bubbleSORT_decending
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index of the array : ");
        int index = Sc.nextInt();
        System.out.println();
        int arr[] = new int[index];

        //array input 
        for ( int i=0 ; i<index ; i++ )
        {
            System.out.print("Enter the value of "+i+"th index of the array : ");
            arr[i] = Sc.nextInt();
            
        }
        System.out.println();

        //bubble sort logic
        for ( int i=0 ; i<index-1 ; i++ )//for bubble sort loop runs n-1 times that's why index-1
        {
            for ( int j=0 ; j<index-i-1 ; j++ )
            {
                if( arr[j]<arr[j+1] )
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        //print array
        for ( int i=0 ; i<index ; i++ )
        {
            System.out.println("The value of "+i+"th index of the array is : "+arr[i]);
        }
    }
}