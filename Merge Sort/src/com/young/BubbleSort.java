package com.young;

public class BubbleSort {

    public static void sort(int[] array) {
        int temp = 0;

        for(int i=0; i<array.length; i++) {
            for(int j=1; j<(array.length)-1; j++) {

                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {

        int array[] = {4,2,5,1,7,8};

        System.out.println("Before Sorting");
        for(int i=0; i<array.length ; i++) {
            System.out.println(array[i]);
        }

        sort(array);

        System.out.println("After Sorting");
        for(int i=0; i<array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
