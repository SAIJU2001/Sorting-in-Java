// write a program to perform merge sort.

import java.util.*;

public class MergeSortDecending
{
    public static void conquer( int arr[], int si, int mid, int ei)
    {
        int merged[] = new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while( idx1<=mid && idx2<=ei )
        {
            if( arr[idx1]>=arr[idx2])
                merged[x++]=arr[idx1++];
            else
                merged[x++]=arr[idx2++];
        }
        while( idx2<=ei )
        {
                merged[x++]=arr[idx2++];
        }
        while( idx1<=mid )
        {
                merged[x++]=arr[idx1++];
        }

        for( int i=0,j=si ; i<merged.length ; i++,j++)
        {
            arr[j]=merged[i];
        }

    }
    public static void divided( int arr[], int si, int ei)
    {
        if( si>=ei )
        return;

        int mid = si+(ei-si)/2;
        divided( arr, si, mid);
        divided( arr, mid+1, ei);
        conquer( arr ,si, mid, ei);
    }
    public static void main(String args[])
    {
       Scanner Sc = new Scanner(System.in);
       System.out.print("Enter the no of index you want : ");
        int size = Sc.nextInt();
        int arr[] = new int[size];
        System.out.println();
        for( int i=0 ; i<size ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                arr[i] = Sc.nextInt();
            }
            System.out.println();
        int si=0;
        int ei=size-1;      
        divided( arr, si, ei);

        //print output
        System.out.print("The result of merge sort : ");
        for(int i=0 ; i<size ; i++)
        {
            System.out.print(arr[i]+" ");    
        }
    }
}