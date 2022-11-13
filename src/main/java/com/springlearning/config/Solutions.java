package com.springlearning.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

@Component
@Service
@Repository
@Controller
@Scope("singleton")
@Lazy
@Primary
public class Solutions implements Cloneable, Serializable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Autowired
    @Qualifier("getConfig")
    private ApplicationConfig applicationConfig;
    @Value("${spring.mail.from}")
    private String host;


    public static BigDecimal limitDecimals(double value, int noOfDecimals) {
        BigDecimal bigDecimal = BigDecimal.valueOf(value);

        return bigDecimal.setScale(noOfDecimals, RoundingMode.DOWN);
    }

    static  String longestCommonPrefix(String A[], int n){
        // code here
        String ans="";

        String sm=Arrays.stream(A).min(Comparator.comparingInt(String::length)).get();
        for(int i=sm.length()-1;i>=0;i--){
            int c=0;
            for(var v:A){
                ans=sm.substring(0,i+1);
                if(v.contains(ans))++c;
            }
            if(c==n) return sm.substring(0,i+1);
        }
        try {
            int t=1/0;
        }finally {
            System.out.println("hello");
        }
        return "-1";
    }

    public static void main(String[] args) {

        var map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XI", 11);

        int r = 0;
        String s = "IV";
        String[] Ad ={
                "dmlrpjyatcoqotxzplqmlptaipczhlikztcofaoaedruyqundkzqatqkkvjrgucineyugnxmsohsgdfmngcpbvamqldyfhgvnfrv", "oioerglunzjvbzxwblooqnuytrnyijuxtibkoogdppzrqyptjeizrezmvnnfyherqidgyjkoyjfrhwkscsrvytivivbgcfxupab" ,
                "llclwjcdfpvijodijndriexnmwhbyiplvtxrcbwkqtsaixitn" ,"lvskkgjujheztaustxtqhklbkvyupnhajbmvhvprfusawmspjlhsvtthouddhlfsmsqwpfpubhuzvmrhaazx"};
        Arrays.sort(Ad);
        System.out.println(longestCommonPrefix(Ad,4));
        System.out.println(Arrays.stream(Ad).min(Comparator.comparingInt(String::length)).get());
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get("" + s.charAt(i)) > map.get("" + s.charAt(i - 1)))
                r += map.get("" + s.charAt(i)) - 2 * map.get("" + s.charAt(i - 1));
            else r += map.get("" + s.charAt(i));
        }
        System.out.println(r);


//        Scanner scanner= new Scanner(System.in);
//        System.out.println(limitDecimals(findWater(4,1,8),2));
//        int a=576;
//        String s= String.valueOf(a);
//        int arr[]= new int[s.length()];
//        for(int i=0;i<s.length();i++)
//        {
//            arr[i]=s.charAt(i)-'0';
//        }
//
//        System.out.println(limitDecimals(96.000,7));

    }

    static float findWater(int i, int j,
                           float X) {
// A row number i has maximum i
// columns. So input column
// number must be less than i
        if (j > i) {
            System.out.println("Incorrect Input");
            System.exit(0);
        }

// There will be i*(i+1)/2 glasses
// till ith row (including ith row)
        int ll = Math.round((i * (i + 1)));
        float[] glass = new float[ll + 2];

// Put all water in first glass
        int index = 0;
        glass[index] = X;

// Now let the water flow to the
// downward glasses till the row
// number is less than or/ equal
// to i (given row)
// correction : X can be zero for side
// glasses as they have lower rate to fill
        for (int row = 1; row <= i; ++row) {
            // Fill glasses in a given row. Number of
            // columns in a row is equal to row number
            for (int col = 1;
                 col <= row; ++col, ++index) {
                // Get the water from current glass
                X = glass[index];

                // Keep the amount less than or
                // equal to capacity in current glass
                glass[index] = (X >= 1.0f) ? 1.0f : X;

                // Get the remaining amount
                X = (X >= 1.0f) ? (X - 1) : 0.0f;

                // Distribute the remaining amount
                // to the down two glasses
                glass[index + row] += X / 2;
                glass[index + row + 1] += X / 2;
            }
        }

// The index of jth glass in ith
// row will be i*(i-1)/2 + j - 1
        return glass[(int) (i * (i - 1) /
                2 + j - 1)];
    }


    static int CommonDigits(int N, int M) {

        // Stores the count of common digits
        int count = 0;

        // Stores the count of digits of N
        int freq1[] = new int[10];

        // Stores the count of digits of M
        int freq2[] = new int[10];

        // Iterate over the digits of N
        while (N > 0) {

            // Increment the count of
            // last digit of N
            freq1[N % 10]++;

            // Update N
            N = N / 10;
        }

        // Iterate over the digits of M
        while (M > 0) {

            // Increment the count of
            // last digit of M
            freq2[M % 10]++;

            // Update M
            M = M / 10;
        }

        // Iterate over the range [0, 9]
        for (int i = 0; i < 10; i++) {

            // If freq1[i] and freq2[i] both exceeds 0
            if (freq1[i] > 0 & freq2[i] > 0) {

                // Increment count by 1
                count++;
            }
        }

        // Return the count
        return count;
    }
}
