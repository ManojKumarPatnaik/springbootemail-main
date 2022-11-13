package com.springlearning.rough.algo;

import java.util.*;

public class BFS {


    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner(",","[","]");
        stringJoiner.add("1").add("2").add("3").add("4");
        System.out.println(stringJoiner);
        StringJoiner stringJoiner1=new StringJoiner(":","[","]");
        stringJoiner1.add("p").add("q").add("r").add("s");
        System.out.println(stringJoiner1);
        stringJoiner.merge(stringJoiner1);
        System.out.println(stringJoiner);


        List<Integer> integerList = List.of(1, 2, 3, 34, 4, 5, 6, 6, 4, 3, 21, 1, 2, 3, 4, 5, 5, 3, 34);
        var set =new LinkedHashSet<Integer>();
        integerList.stream().filter(i->!set.add(i)).toList().forEach(System.out::print);


        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.setVertexList(b);
        a.setVertexList(f);
        a.setVertexList(g);

        b.setVertexList(a);
        b.setVertexList(c);
        b.setVertexList(d);

        c.setVertexList(b);


        d.setVertexList(b);
        d.setVertexList(e);

        f.setVertexList(a);
        g.setVertexList(a);
        g.setVertexList(h);
        h.setVertexList(g);

        traverse(a);


    }

    public static void traverse(Vertex root) {
        Queue<Vertex> vertexQueue = new LinkedList<>();
        root.setVisited(true);
        vertexQueue.add(root);
        while (!vertexQueue.isEmpty()) {
            Vertex actual = vertexQueue.remove();
            System.out.println("Actual vertix = " + actual);
            for (var v : actual.getVertexList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    vertexQueue.add(v);
                }
            }
        }

    }
}
