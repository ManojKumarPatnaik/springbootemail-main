package com.springlearning.rough.algo;

public class MazeSolver {

    static int[][] maze = {
            {1, 1, 1, 1},
            {2, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 0, 1, 1},
            {0, 0, 0, 0}
    };
    static boolean[][] visited = new boolean[maze.length][maze[0].length];

    public static void main(String[] args) {
        solution(1, 0);
    }

    public static void solution(int x, int y) {
        if (dfsHelperForRecursion(x, y)) System.out.println("solution exits");
        else System.out.println("Not exits");
    }

    public static boolean isFeasible(int x, int y) {
        return x >= 0 && x <= maze.length - 1 && y >= 0 && y <= maze.length - 1 && !visited[x][y] && maze[x][y] != 1;
    }


    public static boolean dfsHelperForRecursion(int x, int y) {
        //base case
        if (x == maze.length - 1 && y == maze.length - 1) return true;
        if (isFeasible(x, y)) {
            visited[x][y] = true;
            if (dfsHelperForRecursion(x + 1, y)
                    || dfsHelperForRecursion(x, y + 1)
                    || dfsHelperForRecursion(x, y - 1)
                    || dfsHelperForRecursion(x - 1, y))
                return true;
            visited[x][y] = false;
            return false;
        }
        return false;
    }
}
