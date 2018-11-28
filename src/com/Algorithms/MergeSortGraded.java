package com.Algorithms;

import java.util.Scanner;

public class MergeSortGraded {

    public static int[] mergeBothInDescendingOrder(int arr[], int arr1[])
    {

int[] mergedArr=new int[arr.length + arr1.length];

        //* Merge the two passed arrays *//*

        // Initial indexes of first and second subarrays
        int i = arr.length-1, j = arr1.length -1;

        // Initial index of merged subarry array
        int k = 0;
        while (i >=0 && j >=0)
        {
            if (arr1[j] >= arr[i])
            {
                mergedArr[k] = arr1[j];
                j--;
                k++;
            }
            else
            {
                mergedArr[k] = arr[i];
                i--;
                k++;
            }

        }

        //* Copy remaining elements of L[] if any *//*
        while (i >= 0)
        {
            mergedArr[k] = arr[i];
            i--;
            k++;
        }

        //* Copy remaining elements of R[] if any *//*
        while (j >= 0)
        {
            mergedArr[k] = arr1[j];
            j--;
            k++;
        }
        return mergedArr;
    }


 /*  public static int[] getArrayInput(int sizeArray1, Scanner scanner) {
int[] array=new int[sizeArray1];
for (int i=0;i<array.length;i++){
 array[i]=scanner.nextInt();
}
return array;
    }*/



    public static void main(String ss[]) {
        /*Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sizeArray2 = scanner.nextInt();*/
       /* int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);*/
        int sortedArray1[] ={1,2,3,4};
        int sortedArray2[] =  {5,6,7};


        int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);
        for (int i:descendingMerge) {
            System.out.println(i);
        }

        //Write your code here
    }















}
