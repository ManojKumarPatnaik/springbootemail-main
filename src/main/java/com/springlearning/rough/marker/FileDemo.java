package com.springlearning.rough.marker;

import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FileDemo implements Serializable,MarkerInterface {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream=new FileOutputStream("Demo.txt");
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject("Manoj");
        //serializing

        String demo="Banana";
        Map<String, Long> stringLongMap = Arrays.stream(demo.split("")).collect(groupingBy(Function.identity(),
                counting()));
        System.out.println(stringLongMap);

        FileInputStream fileInputStream=new FileInputStream("Demo.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());
    }
}
