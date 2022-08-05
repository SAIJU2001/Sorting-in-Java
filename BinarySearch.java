// binary search

import java.util.Scanner;

public class BinarySearch
{
    public static int search( int arr[] , int target )
    {
        //three pointer index define
        int low=0;
        int high=arr.length-1;
        int mid=0;

        //binary search algo
        while( low<=high )
        {
            mid=low+(high-low)/2;
            if( target<arr[mid] )
                high=mid-1;
            else if( target>arr[mid] )
                low=mid+1;
            else
                break;
        }

        //checking if the element is present or not in the array
        if( arr[mid]==target )
            return mid;
        else
            return -1;
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

        //input the target element
        System.out.print("Enter the target element : ");
        int target = Sc.nextInt();

        //call the method for binary search opeartion
        int findIndex = search(arr,target);
        System.out.println();

        //print the index of the target element
        if( findIndex==-1 )
            System.out.print("The element is not found in this array.");
        else
            System.out.print("The element is found in index no : "+findIndex);
    }
}