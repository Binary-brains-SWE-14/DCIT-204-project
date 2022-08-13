package com.young;

public class HeapSort {

    public int A[] = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
    //public int size=A.length;
    public void Heap() {
    }

    public int Left(int i) {
        return 2 * i;

    }

    public int Right(int i) {
        return (2 * i) + 1;
    }

    public int Parent(int i) {
        return i / 2;

    }

    public void Max_Heapify(int i) {
        int largest = 0;
        int l = Left(i);
        int r = Right(i);
        if (l <= A.length - 1 && A[l] > A[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r <= A.length - 1 && A[r] > A[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = A[largest];
            A[largest] = A[i];
            A[i] = temp;
            Max_Heapify(largest);
        }

    }

    public void Build_Max_Heap() {
        for (int i = A.length / 2; i >= 0; i--) {
            Max_Heapify(i);
        }
    }


    public void Max_heap_insert(int[]A,int key) {

        int [] B=new int [A.length+1];//increase the length of the array inorder to add new element
        for(int i=0; i<A.length; i++)
        {
            B[i]=A[i];

        }

        B[A.length]=-123;

        Heap_increase_key(B, A.length, key );
    }

    public void Heapsort() {
        Build_Max_Heap();// use  Build_Max_Heap method to find the max heap to make deescending sort.
        int [] temp=new int[A.length];

        for(int i=0;i<A.length;i++)
        {


            temp[i]=A[0];
            A[0]=-123;
            Build_Max_Heap();

        }

        A=temp;

    }


    public void Heap_increase_key(int[]A, int i, int key) {
        //int b=new int []

        if(key<A[i])
        {System.out.println("new key is smaller than current key");
        }

        A[i]=key;
        while(A[Parent(i)]<A[i]&& i>0)
        { int temp;
            temp=A[i];
            A[i]=A[Parent(i)];
            A[Parent(i)]=temp;
            i=Parent(i);
        }
        Build_Max_Heap();
        this.A=A;

    }
}
