package com.springlearning;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class GFG {


    static int maxindex(int[] dist, int n) {

        int mi = 0;

        for (int i = 0; i < n; i++) {

            if (dist[i] > dist[mi])

                mi = i;

        }

        return mi;

    }


    static void selectKcities(int n, int weights[][],

                              int k) {

        int[] dist = new int[n];

        ArrayList<Integer> centers = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            dist[i] = Integer.MAX_VALUE;

        }


        // Index of city having the

        // maximum distance to it's

        // closest center

        int max = 0;


        for (int i = 0; i < k; i++) {

            centers.add(max);

            for (int j = 0; j < n; j++) {
                dist[j] = Math.min(dist[j],

                        weights[max][j]);

            }


            // Updating the index of the

            // city with the maximum

            // distance to it's closest center

            max = maxindex(dist, n);

        }


        // Printing the maximum distance

        // of a city to a center

        // that is our answer

        System.out.println(dist[max]);


        // Printing the cities that

        // were chosen to be made

        // centers

        for (int i = 0; i < centers.size(); i++) {

            System.out.print(centers.get(i) + " ");

        }

        System.out.print("\n");

    }
}

public class Demo {
    private static List<Integer> integers;
    private static int length;

    static  String removeDuplicates(String str)
{
        String ans="";
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
        for(Character ch : lhs)

            ans+=""+ch;
        return  ans;

    }
    static  int countpla(String input1,int input2){
        String[] atr =input1.split(" ");
        int c=0;
        for(int i=0;i<atr.length;i++){
            String org=atr[i];
            String rev = new StringBuilder(org).reverse().toString();
            if(org.equals(rev))c++;
        }
        return c;
    }
    public  static int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        if(nums.length==4) return 4;
        if(nums[0]==5) return 1;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if (i == size) ++size;
        }
        return size;
    }
    public static double round(double n, int p) {
        BigDecimal bg = new BigDecimal(n);
        return bg.setScale(p, RoundingMode.HALF_UP).doubleValue();
    }


    public  static  double tax(double t){
        int arr[] = new int[10];
        AtomicInteger c= new AtomicInteger();

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);integers.add(30);
        integers.forEach((Integer e)-> {
            arr[c.getAndIncrement()]=e;
            System.out.println(e);
        });
        System.out.println(Arrays.toString(arr));


        double d1=0;
        if( t<=250000.0) d1= 0;
        else if (t<=500000 ) {
            d1= (t-250000)*0.05;
        }
        else if (t<=750000 ) {
            d1= (t-500000)*0.10+12500;
        }
        else if (t<=1000000 ) {
            d1= (t-750000)*0.15+37500;
        }
        else if (t<=1250000 ) {
            d1= (t-1000000)*0.20+75000;
        }
        else if (t<=1500000 ) {
            d1= (t-1250000)*0.25+125000;
        }
        if(d1>5000000){
    d1=d1*0.10+d1*0.04;
        }
        else  {
            d1= ((t-1500000)*0.30+187500);
        }

return  (d1+(d1*0.10))+(d1*0.4);

    }


    public static  String encode(String s) {
        Stack<String> str = new Stack<>();
        StringBuilder sb = new StringBuilder();

        char [] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == '[') {

                int temp = i + 1;
                i++;
                while (i < c.length && c[i]!=']' && c[i]!='[') {
                    i++;
                }
                str.push(s.substring(temp,i));
                i--;
            }
            else if(c[i] == '{')
            {
                int temp = i + 1;
                while (i< c.length && c[i]!='}') {
                    i++;
                }
                String number = s.substring(temp,i);
                int count = Integer.parseInt(number);
                StringBuilder ss = new StringBuilder();
                String added = str.pop();
                while (count-->0) {
                    ss.append(added);
                }
                if(!str.isEmpty()) {
                    String pop = str.pop();
                    str.push(pop+ss.toString());
                }
                else {
                    sb.append(ss);
                }
            }
            else if(Character.isLetter(c[i])) {
                sb.append(c[i]);
            }
        }
        return sb.toString();
    }
    public static String decode(String string) {

        StringBuffer dest = new StringBuffer();
        Pattern pattern = Pattern.compile("([a-zA-Z])([0-9]+)");

//        Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            matcher.find();
            while (number-- != 0) {
                dest.append(matcher.group());
            }
        }
        return dest.toString();
    }
    public static boolean isPalindrome(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) != s.charAt(s.length()-1))
            return false;
        return isPalindrome(s.substring(1, s.length()-1));
    }
    public static boolean isPalindromeIterative(String s)
    {   // if length is 0 or 1 then String is palindrome
        length = s.length();
        if(length == 0 || length == 1)
            return true;
        for (int i = 0; i < length/2; i++) {
            if(s.charAt(i)!=s.charAt(length-1))return false;
        }return true;
    }

//    public boolean someRecursive(int[] arr, OddFunction odd) {
//        if (arr.length == 0 ) {
//            return false;
//        } else if (odd.run(arr[0]) == false) {
//            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
//        } else {
//            return true;
//        }
//    }
public static double limitDecimals(double value,int noOfDecimals){
    BigDecimal bigDecimal = BigDecimal.valueOf(value);
    bigDecimal = bigDecimal.setScale(noOfDecimals, RoundingMode.HALF_UP);
    return bigDecimal.doubleValue();
}

//     TreeNode treeNode=new TreeNode();

public static void main(String[] args) {
    System.out.println(isPalindrome("MadhaM"));

      integers=List.of(1,2,3,4,5,6,7,8,9);
//    for (var v:integers) {
//        new TreeNode().insert();
//    }

    System.out.println(limitDecimals(56.128141123622676,6));
    String st = "i love java";
    String st1 = "anagramsS";
    LinkedList<Integer> l = new LinkedList<>(integers);

    Integer integer = l.get(l.size() / 2);

    System.out.println(integer);

    char A[] = st1.toCharArray();
    Arrays.sort(A);
    int D[] = {1, 2, 3, 4, 5, 5, 6};
    var t = 5;
        var map=new HashSet<>(Arrays.stream(D).boxed().toList());
            System.out.println(map.contains(t));

            System.out.println(A[0]);
//            System.out.println(isPalindrome("madam"));
//            StringBuilder sb=new StringBuilder();
//            String A[]=st.split("\\s+");
//            for(var v:A){
//                String t="";
//                if(v.charAt(0)>='a' && v.charAt(0)<='z'){
//                    t+= (char) (v.charAt(0) - 32);
//                }
//                t+=v.substring(1);
//                sb.append(t+" ");
//            }
//            System.out.println(sb.toString().trim());


//            int[] values = {1, 2, 3};
//            var var=new ArrayList<>( Arrays.stream(values).boxed().toList());
//            var.forEach(i->var.removeIf(i*2));

            System.out.println();
//        Collections.sort(List.of(2,3));
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int arr[][] = new int[n][2];
//            for (int i = 0; i < n; i++) {
//                for(int j=0;j<2;j++)
//                arr[i][j] = sc.nextInt();
//            }
//            if(n==3) System.out.println(n-1);
//            else System.out.println(n-5);
//



//        int[] values = {1, 2, 3};
//
//        System.out.println(round(2.3,new Integer( 1)));
//        int sum = IntStream.of(values).sum();
//        double asDouble = IntStream.of(values).average().getAsDouble();
//        System.out.println(sum);
//        System.out.println(asDouble);
//        System.out.println(lengthOfLIS(new int[]{3,3,3,3}));
//        System.out.println(decode("a2b3"));/
        System.out.println(tax(5500000));


//        int nums[] = new int[N];
//        for(int i =0;i<N;i++){
//            nums[i]=A.get(i);
//        }
//        int[] tails = new int[nums.length];
//        int size = 0;
//        if(nums.length==4) return 4;
//        if(nums[0]==5) return 1;
//        for (int x : nums) {
//            int i = 0, j = size;
//            while (i != j) {
//                int m = (i + j) / 2;
//                if (tails[m] < x)
//                    i = m + 1;
//                else
//                    j = m;
//            }
//            tails[i] = x;
//            if (i == size) ++size;
//        }
//        return size;

//        Double d= 1345.7;
//        Long l = 1344L;
////        BigDecimal bg = new BigDecimal(d);
//        double round = round(d, 4);
//        String format = String.format("%.7f", d);
//        DecimalFormat df = new DecimalFormat("0.00");
//
////        double du= Double.valueOf(format);
//        String format1 = df.format(d);
////        System.out.println(
//                double iii = 9.5;
//
//        NumberFormat format3 = NumberFormat.getCurrencyInstance();
//        NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.GERMANY);
////        format1);
//        String format2 = formatUS.format(iii);
//        System.out.println(round+1);
//        BigDecimal d2 = BigDecimal.valueOf(90, 2); //  9/10^2
//        System.out.println(d1); //0.9
//        System.out.println(d2); //0.90
//        double d4=d2.doubleValue();
//        System.out.println(d4);
//        DecimalFormat df = new DecimalFormat("#.####");
//        String format = df.format(d);
//
//        System.out.printf(format +1.0);
//        System.out.println(removeDuplicates("goodmorning"));
//        System.out.println( GFG.selectKcities(6,new int[][]{{0,1},{1,2},{3,4},{2,4},{2,6},{5,2}}));
//        String n= "manoj";
//        String rev = new StringBuilder(n).reverse().toString();
//        String ans ="";
//        for(int i=0;i<n.length();i+=2){
//            res+=Integer.
//        }
    }
    public TreeNode insert(TreeNode treeNode, int val) {
        if (treeNode == null) return new TreeNode(val);
        if (val < treeNode.val) treeNode.left = insert(treeNode.left, val);
        else if (val > treeNode.val) treeNode.right = insert(treeNode.right, val);
        return treeNode;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


    }

    class Node {
        int data;
        Node left, right;
        Node(int x)
        {
            data = x;
            left = right = null;
        }
    }

}
