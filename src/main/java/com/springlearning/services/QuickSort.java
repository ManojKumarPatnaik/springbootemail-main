package com.springlearning.services;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort  {


    static int A[]={9,8,7,6,4,2,1,3};
    public static void quickSort(int low,int high){
        if(low>high)return;
        int mid=pivot(low,high);
        quickSort(low,mid-1);
        quickSort(mid+1,high);
    }
    public static void swap(int A[],int i,int j){
        int t=A[i];
        A[i]=A[j];
        A[j]=t;
    }

    private static int pivot(int low,int high) {
        int mid=(low+high)/2;
        swap(A,mid,high);
        int i=low;
        for(int j=low;j<high;j++){
            if(A[j]<=A[high]){
                swap(A,i,j);
                i++;
            }
        }
        swap(A,i,high);
        return i;
    }

    static class Demo1{
        String s;
       public Demo1(String s){
            this.s=s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Demo1 demo1 = (Demo1) o;
            return Objects.equals(s, demo1.s);
        }

        @Override
        public int hashCode() {
            return Objects.hash(s);
        }
    }
    private static int computerSimpleInterest(int principal,float interest,int years){
        assert(principal>0);
        return 100;
    }
    static ArrayList<ArrayList<String>> displayContacts(int n,
                                                        String contact[], String s)
    {
        // code here
        var ans=new ArrayList<ArrayList<String>>();
        int l=contact.length;
        String pre="";
        var ksn=new HashMap<Integer,Integer>();
        ksn.values().stream().filter(i -> i.intValue() != 0).count();
        for(int i=0;i<s.length();i++){
            
            pre+=s.charAt(i);
            var sublist=new ArrayList<String>();
            int c=0;
            for(var v:contact){
                if(v.startsWith(pre))
                    sublist.add(v);
                else  ++c;
                if(c==l)sublist.add("0");
            }
            ans.add(sublist);
        }
        return ans;
    }
    public static void main(String[] args) {
        int d=3;
        String[] cont={"geeikistest", "geeksforgeeks", "geeksfortest"};
             String de="geeips";

        System.out.println(displayContacts(d,cont,de));
        QuickSort quickSort=new QuickSort();
        System.out.println(computerSimpleInterest(1,1,1));
        Demo1 s1=new Demo1("23");
        Demo1 s2=new Demo1("23");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        var map=new HashMap<Employee,String>();
        var em=new Employee(1,"Manoj",23,"Male","cse",2021,1200000);
        map.put(em,"1");
        System.out.println(map.get(em));
        em.setName("kumer");
        System.out.println(map.get(em));

        int A1[]={2,4,5,6,7};
        for(int i=0;i<A1.length/2;i++){
            int t=A1[i];
            A1[i]=A1[A1.length-1-i];
            A1[A1.length-1-i]=t;
        }
        System.out.println(Arrays.toString(A1));
        Object manoj = Optional.ofNullable(null).orElse("manoj");
        System.out.println(manoj);
        List<Integer> integerList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).toList();
        List<List<Integer>> objects = Stream.of(integerList, new ArrayList<>(List.of(1, 2, 4))).toList();
        objects.stream().flatMap(Collection::stream).forEach(System.out::print);


        quickSort(0,A.length);
//        System.out.println(Arrays.toString(A));
    }
}
