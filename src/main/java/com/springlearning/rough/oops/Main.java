package com.springlearning.rough.oops;

import java.util.*;

public class Main extends Bird implements Animal{

    private static List<Map.Entry<String, Integer>> entrySet;
    private static List<Map.Entry<String, Integer>> entryList;
    public static  void hiding(){
        System.out.println("Main hide");
    }

    public  static  List<String> topKFrequent(String[] words, int k) {
        var map=new HashMap<String ,Integer>();
        for(var v:words){
            map.put(v,map.getOrDefault(v,0)+1);
        }
        var result = new ArrayList<String>();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,b) -> Objects.equals(a.getValue(), b.getValue())
                ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
        );
        for(var entry: map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }
        System.out.println(pq);

        while(!pq.isEmpty())
            result.add(0, pq.poll().getKey());

        return result;

    }
    public static void main(String[] args) {
       Animal animal=new Main();
        Main.hiding();

        String v2[]={"i","love","leetcode","i","love","coding"};

        System.out.println(topKFrequent(v2,2));
        int n=123454,s=0;
        var v=String.valueOf(n);
        System.out.println(v);
        for(var v1:v.toCharArray()){
            s+= (int) (v1-'0');
        }

        System.out.println(s);

        while(n!=0){
            s-=n%10;
            n/=10;
        }
        System.out.println(s);

        animal.shout();
    }

    @Override
    public void shout() {
        System.out.println("Main");
    }
}
