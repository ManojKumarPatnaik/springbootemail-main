package com.springlearning.services;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

interface I1 {
    void print();
}

interface U2 {
    void print();
}
abstract class  Bs{
    public Bs(){

    }
}


class Hacker {

    static int minCntCharDeletionsfrequency(char[] str,int N) {
        var mp = new HashMap<Character, Integer>();
        List<Integer> pq = new ArrayList<>();
        int cntChar = 0;
        for (int i = 0; i < N; i++) mp.put(str[i], mp.getOrDefault(str[i], 0) + 1);
        for (var it : mp.entrySet())  pq.add(it.getValue());
        pq.sort(Comparator.reverseOrder());
        while (pq.size() != 0) {
            pq.sort(Comparator.reverseOrder());
            int frequent = pq.get(0);
            pq.remove(0);
            if (pq.size() == 0) return cntChar;
            if (frequent == pq.get(0)) {
                if (frequent > 1) {
                    pq.add(frequent - 1);
                    pq.sort(Comparator.naturalOrder());
                }
                cntChar++;
            }
        }
        return cntChar;
    }


    public static  String toString(String st) {
        if(st.length()==1)return st;
        return toString(st.substring(1))+st.charAt(0);
    }


    public void dead(){
        synchronized (Integer.class){
            System.out.println("Acquired lock on Integer class");
        }
        synchronized (String.class){
            System.out.println("Acquired lock on String class");
        }
    }

    public void dead1(){
        synchronized (String.class){
            System.out.println("Acquired lock on String class");
        }
        synchronized (Integer.class){
            System.out.println("Acquired lock on Integer class");

        }
    }



    public static void main(String[] args) {
        String str = "abbbcccd";
        int array[] = new int[] {4,64,3,67,12};
        BitSet bitSet = new BitSet();
        for(int i = 0; i < array.length; i++) {
            bitSet.set(array[i] - 1);
        }
        System.out.println("Smallest Number is " + (bitSet.nextSetBit(0) + 1));
        System.out.println("Largest Number is: " + bitSet.length());
        int n=1234;
        int rev=0;

        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        System.out.println(rev);


        System.out.println(toString(str));
        int N = str.length();
        System.out.println(minCntCharDeletionsfrequency(str.toCharArray(), N));
    }
}

class Demo1 implements I1, U2 {
    private static final String VOWELS = "aeiou";
    static int A[][] = new int[2][];


    static void m1() {

    }

    public static void firstNonRepeting(String word) {
        var repeating = new HashSet<Character>();
        var nonRepating = new ArrayList<Character>();
        for (var v : word.toCharArray()) {
            if (repeating.contains(v)) continue;
            if (nonRepating.contains(v)) {
                nonRepating.remove((Character) v);
                repeating.add(v);
            } else nonRepating.add(v);
        }
        System.out.println(nonRepating.get(0));
    }

    public static int maxProfit(int n, int x, int y) {
        var pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        if (n == 1) return pq.poll();
        else if (n / x == n) {

        }

        return pq.poll();
    }

    public static void main(String[] args) {
        String name = "manoj kumar";

        long count = Arrays.stream(name.split(""))
                .filter(character -> VOWELS.contains(character.toLowerCase()))
                .count();
        System.out.println(count);

        firstNonRepeting("manojmaoj");
        Thread thread = new Thread();

        for(int i=0;i<2;i++){
            for(int j=0;j<100;j+=2){
                A[0][j]=j;
                A[1][j]=j+1;
            }
        }
        System.out.println(Arrays.deepToString(A));
        Demo1 demo1 = new Demo1();
        demo1.print();
    }


    @Override
    public void print() {
        System.out.println("manoj");
    }
}

public class Sorting {
    static String tes = "Manoj is the good boy";
    static String pat = "good";
    static int[] A = {2, 5, 1, 3, 0, 8, 9};


    public static int substringBf(String A, String sub) {
        int nl = A.length(), subl = sub.length();
        for (int i = 0; i <= nl - subl; i++) {
            int j;
            for (j = 0; j < subl; j++) {
                if (A.charAt(i + j) != A.charAt(j)) break;
            }
            if (j == subl) return i;
        }
        return -1;

    }

    static int[] te = new int[A.length];

    // bubble sort algorithm
    public static int[] bubbleSort(){
        for (int i = 0; i <A.length; i++) {
            for (int j = 0; j < A.length-1-i; j++) {
                if(A[j+1]<A[j])swap(A,j+1,j);
            }
        }return A;
    }
    // selection sort algorithm
    public static int[] selectionSort(){
        for (int i = 0; i <A.length; i++) {
            int index=i;
            for (int j = index+1; j < A.length; j++) {
                if(A[j]<A[index])index=j;
            }
            if(i!=index){
                int t=A[index];
                A[index]=A[i];
                A[i]=t;
            }
        }return A;
    }
    // merge sort algorithm
    public static void mergeSort(int low, int high) {
        if (low >= high) return;//base cond
        //dived and concurn
        int mid = (low + high) / 2;

        mergeSort(low, mid);
        mergeSort(mid + 1, high);

        //combine both
        merge(low, mid, high);
    }
    // merge
    public static  void dif(int lo,int h){
        if(lo>=h) return;
        int mid=(lo+h)/2;
        dif(lo,mid);
        dif(mid+1,h);
        mergeSort(lo,mid,h);
    }

    private static void mergeSort(int l, int m, int h) {
        if (h - l >= 0) System.arraycopy(A, l, te, l, h - l);
        int i = l, k = l, j = m + 1;
        while (i <= m && j <= h) {
            if (te[i] < te[j]) A[k++] = te[i++];
            else A[k++] = te[j++];
        }
        while (i <= m) A[k++] = te[i++];
        while (j <= h) A[k++] = te[j++];
    }


    public static void merge(int low, int mid, int high) {
        for (int i = low; i <= high; i++) {//tem storage of original array if (high + 1 - low >= 0) System.arraycopy(A, low, te, low, high + 1 - low);
            te[i] = A[i];
        }
        int i = low, k = low, j = mid + 1;
        while (i <= mid && j <= high) {
            if (te[i] < te[j]) {
                A[k] = te[i];
                ++i;
            } else {
                A[k] = te[j];
                ++j;
            }
            ++k;
        }
        while (i <= mid) {
            A[k] = te[i];
            ++i;
            ++k;
        }
        while (j <= high) {
            A[k] = te[j];
            ++j;
            ++k;
        }
    }
protected  int d;
    public static final int ITEMS = 10;
    static int Ans[] = new int[A.length];

    public static void countingSort(int A[]) {

        int max = Arrays.stream(A).max().getAsInt();
        int min = Arrays.stream(A).min().getAsInt();

        int fr[] = new int[max - min + 1];

        for (int i = 0; i < A.length; i++) {//frequency
            fr[A[i] - min]++;
        }

        for (int i = 1; i < A.length; i++) {//pre compute or sum
            fr[i] += fr[i - 1];
        }

        for (int i = A.length - 1; i >= 0; --i) {
            fr[A[i] - min]--;
            Ans[fr[A[i] - min]] = A[i];
        }

        for (int i = 0; i < A.length; i++) {
            A[i] = Ans[i];
        }
    }

    public static void quickSort(int low, int high) {
        if (low > high) return;
        int mid = pivot(low, high);
        quickSort(low, mid - 1);
        quickSort(mid + 1, high);
    }

    public static void swap(int A[], int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

    private static int pivot(int low, int high) {
        int mid = (low + high) / 2;
        swap(A, mid, high);
        int i = low;
        for (int j = low; j < high; j++) {
            if (A[j] <= A[high]) {
                swap(A, i, j);
                i++;
            }
        }
        swap(A, i, high);
        return i;
    }

    public static void main(String[] args) {

//        dif(0,A.length);
//        System.out.println(Arrays.toString(A));

        var treemap = new TreeMap<Employee, Integer>(Comparator.comparing(Employee::getName));
        var employeeList = new ArrayList<Employee>();
        Employee employee = new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
        employeeList.add(employee);
        Employee e = new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0);
        Employee e1 = new Employee(122, "Paul Niksui", 26, "Male", "Sales And Marketing", 2015, 13500.0);
        Employee e3 = new Employee(122, "Paul Niksui", 28, "Male", "Sales And Marketing", 2015, 13500.0);
        Employee e2 = new Employee(122, "Paul Niksui", 27, "Male", "Sales And Marketing", 2015, 13500.0);
        employeeList.add(e);
        employeeList.add(e1);
        employeeList.add(e3);
        employeeList.add(e2);
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
//         atomicInteger=new AtomicInteger(1);

        Map<String, Optional<Employee>> stringOptionalMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.reducing(
                BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        stringOptionalMap.forEach((key, value) -> System.out.println(key + " -> " + value.get()));


        employeeList.forEach(w -> treemap.put(w, w.getId()));
        treemap.forEach((q, w) -> System.out.println(q.getAge() + " : " + w));
        var mp =new HashMap<String,List>() ;
        mp.put("key", mp.getOrDefault("1",new ArrayList())).add("st");
        String va = "i love coding and i love java";
        List<String> list = Arrays.stream(va.split("\\s+")).toList();
        employeeList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e11 -> e11.getValue() > 1).forEach(System.out::println);
        employeeList.stream().filter(name -> Collections.frequency(employeeList, name.getGender()) > 1).
                forEach(System.out::println);
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((e10, e9) -> System.out.println(e10 + ": " + e9));
//        System.out.println(stringLongMap);

        var v = List.of(1, 2, 4, 4, 5, 6, 76, 4, 4, 3, 2);
        var set = new HashSet<>();
        v.stream().filter(i -> !set.add(i)).collect(Collectors.toSet()).forEach(System.out::println);
        LinkedHashSet<Map.Entry<Employee, Integer>> entryLinkedHashSet = treemap.entrySet()
                .stream().sorted(Map.Entry.comparingByKey(Comparator.comparingInt(o -> o.getName().length())))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        entryLinkedHashSet.forEach(e8 -> System.out.println(e8.getKey() + " : " + e8.getValue()));

    }

}
