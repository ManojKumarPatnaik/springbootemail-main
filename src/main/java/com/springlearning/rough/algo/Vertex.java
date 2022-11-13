package com.springlearning.rough.algo;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String data;
    private final List<Vertex> vertexList;
    private boolean visited;

    @Override
    public String toString() {
        return data;
    }

    public Vertex(String data) {
        this.data = data;
        this.vertexList = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public void setVertexList(Vertex e) {
        this.vertexList.add(e);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
