package challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTownJudge {
    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3},{3,1}};
        //System.out.println(getTownJudge(trust.length, trust));

        int[] thenum = {1, 2, 2, 1, 1, 3, 4, 5, 4, 5};
        int[] occurencey = new int[thenum.length];
       // Arrays.fill(occurencey, -1);
        for (int i = 0; i < thenum.length; i++) {
            ++occurencey[thenum[i]];
        }
        for (int c : occurencey)
            System.out.println(c);
    }
    public static int getTownJudge(int n, int[][] trust) {


        int[] a = new int[n+1];

        for (int[] arr : trust) {
            a[arr[0]] = -1;
            //System.out.println("trust a: "+ arr[0]);
            if(a[arr[1]] != -1) {
                ++a[arr[1]];
               // System.out.println("trust b: "+ arr[1]);
            }

        }
        //System.out.println("******************");
       // System.out.println(n-1);
       // System.out.println("******************");



        for (int i = 0; i <= n; i++) {


            if(a[i] == n-1)
                return i;
        }
       // System.out.println("******************");
        return  -1;

    }
}
