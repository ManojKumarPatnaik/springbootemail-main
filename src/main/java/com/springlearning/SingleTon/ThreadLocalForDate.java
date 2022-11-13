package com.springlearning.SingleTon;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ThreadLocalForDate {
    public static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<>(){
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        @Override
        public SimpleDateFormat get() {
            return super.get();
        }
    };
    private static ThreadLocal<SimpleDateFormat> threadLocal1 = ThreadLocal.withInitial(()->//factory method to create a thread local instance
            new SimpleDateFormat("yyyy-MM-dd"));
}
class Demodu{

    public static int binarySearch(int[] A, int t, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (A[mid] == t)
                return mid;
             else if (A[mid] < t)
                s = mid + 1;
            else e = mid - 1;

        }
        return -1;
    }
        public static int answer(int[] A, int t){
        int s=0,e=1;
        while(t>A[e]){
            int newStart=e+1;
            e=e+(e-s+1)*2;
            s=newStart;
        }
        return binarySearch(A,t,s,e);
    }
    public static int mountainIndex(int[] A){
        int s=0,e=A.length -1;
        while(s<e){
            int mid = s + (e - s) / 2;
            if(A[mid] > A[mid+1]){
                e=mid;
            }else{
                s = mid + 1;
            }
        }return s;
    }
        public static int maximumWealth(int[][] accounts) {
            int a=0;
            for(int i=0;i<accounts.length;i++){
                int s=0;
                for(int j=0;j<accounts[0].length;j++){
                    s+=accounts[i][j];
                }
                a=Math.max(a,s);
            }return a;
        }
//        int mid=start +(end-start)/2;//if start and end are larger values will exeed int range

    public static void main(String[] args) {
        System.out.println(mountainIndex(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,13,12,11}));
        System.out.println(answer(new int[]{1,2,3,4,4,5,6,7,12,23},6));
        int A[]={1,2,4,5,6};
        int t[][]={{1,2},{2,3}};
        System.out.println(maximumWealth(t));
        Arrays.sort(A);
        for (int i = 1; i < A.length; i++) {
            if(Math.abs(A[i-1]-A[i])>=2) {
                System.out.println(A[i-1]+1);
            }
        }
        var simpleDateFormat = ThreadLocalForDate.threadLocal.get();
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
