package com.springlearning.config;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.function.Predicate;

class Config{
    int x=10;
    int y=02;
    protected void  mes() {
        ajsj.me(this);
    }

    public static void main(String[] args) {
       Config config=new Config();
       config.mes();
    }

}
abstract  class ajsj{
     abstract void main(String[] args);
     static void me(Config config){
         int x = 10;
         int y = 5;
         x = (x * y) / (y = x);
         System.out.println("After swaping:"
                 + " x = " + x + ", y = " + y);
         System.out.println("congfighjg"+config.x+config.y);
     }
}
public class withoutMain {
    public   withoutMain(){
        System.out.println("sodun");
    }
    static {

        System.out.println("hello");
    }

//    public static String patternMatchingInSwitch(Object obj){
//        return switch (obj){
//            case null->  "a";
//            case Integer i when i>2 ->  " %d b".formatted(i);
//            case Long l -> "c";
//            default -> "new pattern matching in switch";
//        };
//    }

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException, IOException {
        Constructor<Solutions> solutionsConstructor = Solutions.class.getConstructor();
        String sq=new String("d");
        System.out.println(sq.hashCode());
        System.out.println(sq.intern().hashCode());

        System.out.println(Main.x);

        var dema=Arrays.asList("solutionsConstructor","list");
        var listvd=dema.stream();
//        listvd.forEach(System.out::println);
//        listvd.forEach(System.out::println);
        dema.stream().takeWhile(i->i.length()>10).forEach(System.out::println);
        dema.stream().dropWhile(i->i.length()>10).forEach(System.out::println);


        System.out.println(solutionsConstructor.hashCode());
        Solutions newInstance = Solutions.class.newInstance();
        var mp = new HashMap<Integer,Integer>();
//        mp.entrySet().stream().sorted((Comparator<? super Map.Entry<Integer, Integer>>) Map.Entry.comparingByKey().reversed()).forEach(System.out::println);
        System.out.println(newInstance.hashCode());
        Solutions newInstance1 = (Solutions)Class.forName("com.springlearning.config.Solutions").newInstance();
        System.out.println(newInstance1.hashCode());
        Solutions solutions2=(Solutions) newInstance1.clone();
        System.out.println(solutions2.hashCode()+"this obj didn't invoke constructor");

//        FileOutputStream fileOutputStream=new FileOutputStream("text.txt");
//        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(solutions2);
        FileInputStream fileInputStream=new FileInputStream("text.txt");
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject().hashCode()+"this obj didn't invoke constructor");
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 8, 99, 5);
        Predicate<Integer> integerPredicate = i -> i % 2 == 0;
        System.out.printf(" %s is %d old%n", "Manoj",23);
        integerList.stream().filter(Predicate.not(withoutMain::isOdd)).forEach(System.out::println);//11
//        System.out.println("""
//                line 1
//                    line 2
//                        line 3
//                """);
//        Manoj manoj = new Manoj("Manoj",23);
//        System.out.println(manoj.age()+" = "+manoj.name());

    }
//    record  Manoj(String name,int age){
//        static  int d=0;
//        Manoj{//compact constructor to give validation while intializing 16
//            if(name==null) try {
//                throw new IllegalAccessException("sjbd");
//            } catch (IllegalAccessException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//        public String instanceMethods(String name){
//            return  "manod";
//        }
//    }
    //15 public accessor methods equals toString getters, final variables
    public static boolean isOdd(int t){
return true;
//        return switch (t) {
//            case 1 -> {
//                System.out.println("do complex");
//                yield t%2==0;//14
//            }
//            case 2 -> true;
//            case 3 -> true;
//            case 4 -> true;
//            case 5 -> true;
//            case 6 -> true;
//            case 7 -> true;
//            case 8 -> true;
////            default -> throw new IllegalStateException("Unexpected value: " + t);
//            default -> true;
//        };
    }
}
abstract class Abd{
    public static int age(){
        return 1;
    }
}
class Main{
    public static final int x=100;
    static {
        System.out.println("dudujh");
    }
}
