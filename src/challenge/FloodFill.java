package challenge;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
       int[][] image = {{1,1,1},{1,1,0},{1,0,1}};

       //System.out.println(image[1][1]);

        //System.out.println(image[1].length);
    }

    public static int[][] getFloodFill(int[][] image, int sr, int sc, int newColor) {
        int source = image[sr][sc];
        if(source==newColor)
            return image;

        //dfs == depth first search
        dfs(image, sr, sc, newColor, source);
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int newColor, int source) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length)
            return;
        else if(image[sr][sc] != source)
            return;
        image[sr][sc] = newColor;

        dfs(image, sr-1, sc, newColor, source); //TOP
        dfs(image, sr+1, sc, newColor, source); //TOP
        dfs(image, sr, sc-1, newColor, source); //LEFT
        dfs(image, sr, sc + 1, newColor, source); //RIGHT
    }
}
