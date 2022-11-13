package com.springlearning.rough;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

import static com.springlearning.rough.DutchFlag.swap;

public class BubbleSort {
    private static int A[] = {100, 1, 9, 3, 5, 7, 8, 3, 2, 1};
    static int sub[]={8, 3, 2};

    public static void main(String[] args) {


        /*for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length-i-1;j++){//buble sort use j 0 to l-i-1
                if(A[j]>A[j+1])swap(A,j,j+1);
            }
        }*/


        //selection sort use to find min element and send to left most array

       /* for(int i=0;i<A.length;i++){
            int index=i;
            for(int j=i+1;j<A.length;j++){//select the min element kth most smallest
                if(A[j]<A[index])
                    index=j;
            }

            if(index!=i){
                int t=A[index];
                A[index]=A[i];
                A[i]=t;
            }
        }*/



        //bubble sort
//        for(int i=0;i<A.length;i++){
//            for(int j=0;j<A.length-1-i;j++){
//                if(A[j]>A[j+1])
//                    swap(A,j,j+1);
//            }
//        }

        //printing the sorted array
        //select the min index store in ver
        /*for(int i=0;i<A.length;i++){
            int ind=i;
            for(int j=i+1;j<A.length;j++){
                if(A[j]<A[ind])
                    ind=j;
            }
            if(ind!=i){
                int t=A[ind];
                A[ind]=A[i];
                A[i]=t;
            }
        }*/



        //insertion sort
        //lots of shift operations and writes also

        /*for(int i=0;i<A.length;i++){
            int j=i;
            while (j>0 && A[j-1]>A[j]){
                swap(A,j-1,j);
                j--;
            }
        }*/

/*
        //shell sort is enhanced version of insertion sort
        // if 1 means standard insertion solution
        for(int gap=A.length/2;gap>0;gap/=2){
            for(int i=gap;i<A.length;i++){
                int j=i;
                while(j>=gap && A[j-gap]>A[j]){
                    swap(A,j-gap,j);
                    j-=gap;

                }
            }
        }*/


        // quick sort
//        Arrays.sort(A);
//        System.out.println(binarySearch(A,8));

        System.out.println(Arrays.toString(A));
    }


//    public static int sort(0,
//    public static int partion(int i,int high){
//        int  m=A.length;
//
//        int m=partion(A).



    static int A1[] = {1, 4, 5, 7, 2, 9, 3, 7, 3, 4, 5, 7};

    public static int binarySearch(int A1[],int t) {

        int l = 0, r =A1.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(A1[m]==t)return m;
            else if (A1[m]<t) {
                l=m+1;

            }
            else r=m-1;

        }return -1;

    }




//
}
