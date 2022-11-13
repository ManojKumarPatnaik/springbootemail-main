package com.springlearning.rough.algo;

import java.util.*;

public class DFS {


    public static void main(String[] args) {
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

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(a);
        vertexList.add(b);
        vertexList.add(c);
        vertexList.add(d);
        vertexList.add(e);
        vertexList.add(f);
        vertexList.add(g);
        vertexList.add(h);
        traverse(vertexList);


    }

    public static void traverse(List<Vertex> vertexList) {
        for (var v : vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsHelperForRecursion(v);
            }
        }
    }


    private static void dfsHelper(Vertex root) {
        Stack<Vertex> vertexQueue = new Stack<>();
        root.setVisited(true);
        vertexQueue.add(root);
        while (!vertexQueue.isEmpty()) {
            Vertex actual = vertexQueue.pop();
            System.out.println("Actual vertix in DFS= " + actual);
            for (var v : actual.getVertexList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    vertexQueue.push(v);
                }
            }
        }
    }


    private static void dfsHelperForRecursion(Vertex root) {
        System.out.println("Actual vertix in DFS= " + root);
        for (var v : root.getVertexList()) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsHelperForRecursion(v);
            }
        }
    }
}
