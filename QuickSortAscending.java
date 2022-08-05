// write an algorithm for quick sort(ascending order)

import java.util.Scanner;

public class QuickSortAscending
{
    public static void quickSort( int arr[], int low, int high )
    {
        if( low<high )
        {
            int pivotIndex=partition( arr, low, high );

            //for sorting before the pivot element
            quickSort( arr, low, pivotIndex-1 );

            //for sorting after the pivot element
            quickSort( arr, pivotIndex+1, high );
        }
    }
    public static int partition( int arr[] ,int low ,int high )
    {
        //i choose my pivot is highest index element
        int pivot=arr[high];
        //it is the tracker which tracks the smaller element form pivot
        int i=low-1;

        for( int j=low ; j<high ; j++ )   //j=high-1 because the pivot is high index
        {
            if( arr[j]<pivot )
            {
                i++;
                //this swaping is for the bigger element present before the pivot
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        } 
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);

        //input the size of the array
        System.out.print("Enter the length of the array : ");
        int len = Sc.nextInt();
        System.out.println();

        //creat an array
        int arr[] = new int[len];

        //input the array elements
        for( int i=0 ; i<len ; i++ )
        {
            System.out.print("Enter the value of the index no "+i+" : "); 
            arr[i]=Sc.nextInt();
        }
        System.out.println();

        //call the method 
        quickSort( arr, 0, len-1 );
        System.out.println();

        //print the sorted array
        System.out.print("After sorting : ");
        for( int i=0 ; i<len ; i++ )
        { 
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    
    }
}
