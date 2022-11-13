package com.springlearning.services;


import java.io.Serializable;
import java.util.*;

public class Main {
    public static int longestSubstring(String st){
        int ans=0;
        for(int i=0;i<st.length();i++){
            StringBuilder stringBuilder=new StringBuilder();
            for(int j=i;j<st.length();j++){
                if(stringBuilder.indexOf(""+st.charAt(j))!=-1)break;
                stringBuilder.append(st.charAt(j));

            }
            ans=Math.max(ans,stringBuilder.length());
        }
        return ans;
    }
    public static int longestSubstringDp(String st){
        int ans=0;
        var map =new HashMap<Character,Integer>();
        for(int i=0,j=0;i<st.length();i++){
            char cu=st.charAt(i);
            if(map.containsKey(cu) && map.get(cu)>=j)j=map.get(cu)+1;
            ans=Math.max(ans,i-j+1);
            map.put(cu,i);
        }
        return ans;
    }

    public static int[] twoSum(int A[],int t){
        var map =new HashMap<Integer,Integer>();
        for(int i =0;i<A.length;i++){
            var ind=map.get(A[i]);
            if(ind!=null) return new int[]{i,ind};
            map.put(t-A[i],i);
        }return new int[]{-1,-1};
    }

    public static int longestSubstringIndexOf(String st){
        int ans=0;
        for(int i=0,j=0;i<st.length();i++){
            char cu=st.charAt(i);
            int index=st.indexOf(cu,j);
            System.out.println(index);
            if(index!=i) j=index+1;
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
    public static  void  printerOfCollection(List<?extends Object> data){
        System.out.println(data);
    }
    private static long[] memo;
    protected static  long fib(int n){
        if(n<=1) return n;
        if(memo[n]!=0)return memo[n];
        return fib(n-1)+fib(n-2);
    }

//    public static Node bst(Node node, String value) {
//        if (node.getData() == value || node == null) return node;
//        else {
//            if (node.getData() < value) return bst(node.getNext(), value);
//            else return bst(node.getNext(), value);
//        }
//    }
    public static <T, V> void  printer(T data, V value){
        System.out.println(data+" :"+value);
    }
    public static void main(String[] args) {
        memo=new long[9];
        for(int i=0;i<=8;i++)
        System.out.print(fib(i)+" ");

        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4,5},9)));


        System.out.println(longestSubstringIndexOf("abcabcdab"));
        //<editor-fold desc="Description">
        List<Character> r̥am=new ArrayList<>();
        //</editor-fold>
        r̥am.add('1');
        printerOfCollection(r̥am);
        UserStack<Integer> stack =new UserStack<>();
        printer("Manoj",3);
//        Stack<Character> stack=new Stack<>();
        stack.push(134);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
//        System.out.println(stack.search(134));
//        String input="{({}(){})}";
//        for (var v:input.toCharArray()) {
//            if(v=='{' || v=='(')stack.push(v);
//            else {
//                var pre=stack.peek();
//                if((v=='}' && pre=='{') || (v==')' && pre=='('))stack.pop();
//                else break;
//
//            }
//        }
//        System.out.println(stack.isEmpty());




        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.peek());
        stack.show();
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(17);
        list.add(15);
        list.add(12);
        list.add(3);
        list.add(5);
        list.add(6);
        int i=0,n=list.size();
        Integer peek = list.peek();
        System.out.println(peek);
        System.out.println(list.get((n/2)));



    }
}
