package com.springlearning.config;



import org.w3c.dom.Entity;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.springlearning.config.Sessions.*;
import static java.util.function.Predicate.not;

record Demo54(String na,int a){

          }
          class A{
 static void  b(){
    System.out.println("A");
}
          }
          class B extends A{
               static void  b(){
                  System.out.println("B");
              }


          }
class Employee
//        implements Comparable<Employee>
{
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

//    @Override
//    public int compareTo(Employee o) {
//        return Integer.compare( o.getAge(),this.getAge());
//    }
}
class customComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge()-o2.getAge();
    }
}
class Bh{

}
interface  Jh{
int a=10;
}
class df implements Jh  {

}
interface H extends Jh{

Jh d=new df();


}

//class Animal	{
//    public Animal()	{
//        System.out.println("Animal	Constructor");
//    }
//}
//class Dog	extends Animal	{
//    public Dog()	{
//        System.out.println("Dog	Constructor");
//    }
//}
//class Labrador	extends Dog	{
//    public Labrador()	{
//        System.out.println("Labrador	Constructor");
//    }
//}
// class ConstructorExamples	{
//    public static void main(String[]	args)	{
//        Labrador	labrador =	new Labrador();
//    }
//}

 class Animal	{
     public static String	shout(int a)	{
         return "Don't	Know!";
     }
    public String	shout()	{
        return "Don't	Know!";
    }
     public void runas(){
         System.out.println("animal");
     }
}
//Let’s	create	two	new	sub	classes	of	Animal	overriding	the	existing	shout	method	in	Animal.
class Cat	extends Animal	{
    public static String	shout(int b)	{
        return "Meow	Meow";
    }
    public String	shout()	{
        return "Meow	Meow";
    }
    public void shout(float s)	{
        System.out.println("fjhfg");
    }


    public static void main(String[] args) {

        Animal a=new Cat();

      Cat cat=new Cat();
        System.out.println();
    }
}
class djdhj implements Bf,Bf1{


    public void p() {
        Bf.p();
        Bf1.p();
    }



    public static void main(String[] args) {
        djdhj d=new djdhj();
        d.p();
    }
}
interface Bf1 {


    static void p() {
        System.out.println("1");
    }
}
interface Bf{
     static void p(){
        System.out.println("2");
    }
    private static  void d(){
        System.out.println("fjf");
    }
}
class Dog	extends Animal	{
    public String	shout()	{
        return "BOW	BOW";
    }
    public void run(){
        System.out.println("dog");
    }

    public static void main(String[] args) {
        Animal	animal1	=	new Dog();
        String A[]={"1","2,3,4,5,6,7"};
        Arrays.sort(A, Comparator.reverseOrder());
        System.out.println(Arrays.toString(A));
//        animal1.run();
        String s="df";
        s="maonk";
        System.out.println(s);
        for (int i	=	0,j	=	0;	i	<	10;	i++,j--)	{
            System.out.print(j);
        }
    }
}

enum Sessions{
     winter    ,sum,lo;
}
class Pair1<T,V>{
    T t;
    V v;
    Pair1(T t,V v){
        this.t=t;
        this.v=v;
    }
}
 class Dummy4{

    public static <T,V> T shout(T t,V v){
        System.out.println(t+""+v);
        return t;
    }

    public static void main(String args[]) {
        new Pair1<>(2, 3);
        Dummy4.shout(new B(),new Bh());
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(14);
        pq.offer(11);
        pq.offer(20);
        pq.add(21);
        System.out.println(pq.poll());
        CopyOnWriteArrayList<Integer> cp=new CopyOnWriteArrayList<>();
        cp.add(1);
        cp.add(4);
        cp.add(4);
        cp.add(4);
        cp.add(4);
        cp.add(4);
        cp.add(49);
        cp.add(48);
        System.out.println(cp);
        for (var v:cp) {
            cp.remove(v);
            cp.add(v);
        }
        System.out.println(cp);


//        Sessions st;
//        System.out.println(switch (st){
//            case winter->5;
//            case sum->10;
//            case lo->344;
//        };

        List<Employee> employeeList = new ArrayList<Employee>();
//        Animal a=new Animal();
//        System.out.println(a.name);

        Employee employee = new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
        employeeList.add(employee);
        Employee e = new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0);
        Employee e1 = new Employee(122, "Paul Niksui", 26, "Male", "Sales And Marketing", 2015, 13500.0);
        Employee e3 = new Employee(122, "Paul Niksui", 28, "Male", "Sales And Marketing", 2015, 13500.0);
        Employee e2 = new Employee(122, "Paul Niksui", 27, "Male", "Sales And Marketing", 2015, 13500.0);
        employeeList.add(e);
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
        List<Employee> employeeList1 = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge)).collect(Collectors.toList());
        System.out.println(employeeList1);


        employeeList.sort(Comparator.comparingInt(Employee::getAge));
        int id=Collections.binarySearch(employeeList, e,Comparator.comparingInt(Employee::getId));
        System.out.println("Index ="+id);
        employeeList.sort(Comparator.comparingInt(Employee::getAge));
        System.out.println(employeeList.stream().filter(e0->e0.getGender().equalsIgnoreCase("male")).map(Employee::getSalary).reduce(Double::sum).get());
        System.out.println(employeeList);
        var t=new TreeMap<Employee,Integer>((o1,o2)->o2.getAge()-o1.getAge());
        t.put(employee,1234);
        t.put(e,56789);
        t.put(e1,999);
        t.put(e2,384);
        t.put(e3,00345);
        SortedMap<Employee, Integer> employeeIntegerSortedMap = t.subMap(e2,e);
//        employeeIntegerSortedMap.forEach((a1,a2)-> System.out.println(a1.getAge()+"= "+a2));
//        t.forEach((k,v)-> System.out.println(k.getAge()+"= "+v));


//        System.out.println(t);
//        AtomicInteger c=new At
//        omicInteger(0);
//        employeeList.forEach(employee -> t.put(c.getAndIncrement(), employee));
//        System.out.println(t);


var df=new HashSet<Integer>();


//        Map<String, Long> setMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        setMap.entrySet().forEach((var v)->{
//            System.out.println(v.getKey()+"= "+v.getValue());
//        });
//        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(System.out::println);
//        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge))).entrySet().forEach(System.out::println);
//        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).entrySet().forEach(System.out::println);
//        employeeList.stream().map(Employee::getSalary).sorted(Collections.reverseOrder()).limit(1).collect(Collectors.toSet()).forEach(System.out::println);
//employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);
//        employeeList.stream().filter(employee -> employee.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);
//employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);
//employeeList.stream().filter(employee -> employee.getDepartment().equals("Product Development")&&employee.getGender().equals("Male")).min(Comparator.comparingInt(Employee::getAge)).ifPresent(System.out::println);
//employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).ifPresent(System.out::println);
//employeeList.stream().filter(employee -> employee.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet().forEach(System.out::println);
//employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);
//     employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((key, value) -> System.out.println(key + " = " + value.stream().map(Employee::getName).collect(Collectors.toSet())));
//        var doubleSummaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println(doubleSummaryStatistics.getAverage()+"avg, total= "+doubleSummaryStatistics.getSum());
//        Map<Boolean, List<Employee>> booleanListMap = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() > 25));
//        booleanListMap.forEach((key,value)-> {
//            if(key) System.out.println("Greater Then 25 years old employees = "+value.stream().map(Employee::getName).toList());
//            else System.out.println("less Then 25 years old employees = "+value.stream().map(Employee::getName).toList());
//        });
//        employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).ifPresent(employee -> System.out.println(employee.age+" : "+employee.getDepartment()));
//        employeeList.stream().filter(not(employee->employee.getGender().equalsIgnoreCase("female"))).toList().forEach(System.out::println);
//        String d="ab2cdef3";
//        int l=0,t=0;
//        StringBuffer sb=new StringBuffer();
//        for(int i=0;i<d.length();i++){
//            if(Character.isDigit(d.charAt(i))) {
//                l = Integer.parseInt("" + d.charAt(i));
//                sb.append((d.substring(t,i)).repeat(l));
//                t=i+1;
//            }
//        } System.out.println(sb);
//        System.out.println("123\nabc\nABC".indent(4));
//        IntStream.of(1, 10, 100, 1000, 10000, 1000, 100, 10, 1, 0, 10000)
//                .takeWhile(i -> i < 5000)
//                .forEach(System.out::println);
//        System.out.println();
//        IntStream.of(1, 10, 100, 1000, 10000, 1000, 100, 10, 1, 0, 10000)
//                .dropWhile(i -> i < 5000)
//                .forEach(System.out::println);
        int A2[]={1, 11, 100, 1000, 50000, 1000, 100, 10, 1, 0, 10000};
//        Stream.iterate(1,i->i<100000,i->i*10).forEach(System.out::println);
//        IntStream.of(A2).filter(i->i>1000).forEach(System.out::println);

//        IntStream.of(A2).skip(1).limit(6).forEach(System.out::println);
//        IntStream.of(A2).boxed().filter(not(i->i%2==0)).forEach(System.out::println);

        HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<>();

        subjectToStudentCountMap1.put("Maths", 45);
        subjectToStudentCountMap1.put("Physics", 57);
        subjectToStudentCountMap1.put("Chemistry", 52);
        subjectToStudentCountMap1.put("History", 41);

        //Map-2

        HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();

        subjectToStudentCountMap2.put("Economics", 49);
        subjectToStudentCountMap2.put("Maths", 42);
        subjectToStudentCountMap2.put("Biology", 41);
        subjectToStudentCountMap2.put("History", 55);
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));

//        System.out.println(joinedString);
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");

        stringJoiner.add("Facebook");

        stringJoiner.add("Twitter");

        stringJoiner.add("YouTube");

        stringJoiner.add("WhatsApp");

        stringJoiner.add("LinkedIn");

        System.out.println(stringJoiner);

        //Merging Map-1 and Map-2 into Map-3
        //If any two keys are found same, their values are added using method reference : Integer::sum

//        HashMap<String, Integer> subjectToStudentCountMap3 =
//                Stream.of(subjectToStudentCountMap1, subjectToStudentCountMap2)
//                        .flatMap(map -> map.entrySet().stream())
//                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Integer::sum, HashMap::new));

        //Printing map1, map2 and map3

//        System.out.println("Map 1 : "+subjectToStudentCountMap1);
//
//        System.out.println("Map 2 : "+subjectToStudentCountMap2);
//
//        System.out.println("Map 3 : "+subjectToStudentCountMap3);
//
//        HashMap<String, Integer> subjectToStudentCountMap13 =
//                Stream.concat(subjectToStudentCountMap1.entrySet().stream(), subjectToStudentCountMap2.entrySet().stream())
//                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1>v2 ? v1 : v2, HashMap::new));


        Map<Integer, String> idNameMap = new HashMap<Integer, String>();

        //Insert Id-Name pairs into idNameMap

        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");
        var k=new HashSet<>(idNameMap.entrySet());
        var v= new LinkedList<>(idNameMap.entrySet().stream().toList());
        v.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println(v);
        List<Map.Entry<Integer, String>> listOfEntry = new LinkedList<>(idNameMap.entrySet());


        //Sort listOfEntry using Collections.sort() by passing customized Comparator

        listOfEntry.sort(Map.Entry.comparingByValue());
//        System.out.println(listOfEntry);
//        listOfEntry.sort(Map.Entry.comparingByKey());
//        System.out.println(listOfEntry);
        //Java 8 sorting using Entry.comparingByValue()


//        Map<Integer, String> sortedIdNameMap
//                = idNameMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));



        HashMap<String, Integer> subjectToStudentCountMap23 = new HashMap<>(subjectToStudentCountMap1);

        subjectToStudentCountMap2.forEach((key, value) -> subjectToStudentCountMap23.merge(key, value, (v1, v2) -> v1+v2));
//        HashMap<String, Integer> stringIntegerHashMap = subjectToStudentCountMap2.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Integer::sum, () -> new HashMap<>(subjectToStudentCountMap1)));
//        System.out.println(stringIntegerHashMap);


    }




}
class Pair<T,K>{
    T t;
    K k1;
//    Pair makePair(T t,K,k1){
//        this.t=t;
//        this.k1=k1;
//    }
}
abstract  class Be<h>{
    Be(){}
}
interface InterfaceFromJava9
{
    //Constant Variables

    int constantVariableOne = 10;
    int constantVariableTwo = 20;

    //Abstarct Methods

    void abstractMethodOne();
    void abstractMethodTwo();

    //Default Method

    default void defaultMethod()
    {
        System.out.println("I am default method!!!");
    }

    //Static Method

    static void staticMethod()
    {
        System.out.println("I am static method!!!");
    }

    //Private Method

    private void privatemethod()
    {
        System.out.println("I am private method!!!");
    }

    //Private Static Method

    private static void privateStaticMethod()
    {
        System.out.println("I am private static method!!!");
    }
}

class Parent{

    public Parent(){
        name();
        normal();
    }

    private void name(){
        System.out.printf("private method inside Parent class in Java %n");
    }

    public void normal(){
        System.out.println("non private method from Parent class can be overridden");
    }

}

class Child extends Parent{

    /*
     * Private methods can not be overridden in Java, they can only be hidden
     */
    private void name(){
        System.out.printf("private method inside Child class in Java %n");
    }

    @Override
    public void normal(){
        System.out.println("non private overridden method from Child class ");
    }

}
public class MyClass extends B  {
        private int a;


    public static void main(String[] args) {
       A aOb=new B();
       aOb.b();
//        Runnable r= new MyClass();
//        Thread t=new Thread(r);
//        t.start();
        Optional<Integer> max = List.of(1, 23, 455, 6, 7).stream().max(Integer::compare);
        System.out.println(max.get());

        MyClass c=new MyClass();
        String v1="ajeet";//ajeet
        String v2="Ajeet";
//        v1=v2;
        System.out.println(v1==v2);//heap -> scp
        System.out.println(new MyClass().a);
//        Runnable r=new Thread(r);
        Demo54 demo54=new Demo54("manoj",1);
        System.out.println(demo54.na());
        int costs[][]={{10,20},{30,200},{400,50},{30,20}};
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[0] - a[1])));
//        int costs[][]={{10,20},{30,200},{400,50},{30,20}};
        Arrays.sort(costs,(a,b)->b[0]-a[0]);
//        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));
        for(var v:costs)
            System.out.println(Arrays.toString(v));
//        System.out.println("Y".equals(null));
//        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1}));
//        System.out.println(numEquivDominoPairs(new int[][]{{1,2},{2,1},{3,4},{5,6}}));
    }
    public static  int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int ans = 0, index = 0;
        for (int[] dom : dominoes) {
            index = dom[0] < dom[1] ? dom[0] * 10 + dom[1] : dom[1] * 10 + dom[0];
            ans += count[index]++;
        }
        return ans;
    }
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> left = new HashMap<Integer, Integer>();
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            left.putIfAbsent(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }



}