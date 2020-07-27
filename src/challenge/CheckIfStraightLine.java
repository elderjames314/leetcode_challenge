package challenge;

import java.util.Vector;

/**
 * check if it is a straight line
 */
public class CheckIfStraightLine {
    public static void main(String[] args) {

        int[][] cordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6,7}};
        int[][] cordinates2 = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(checkIfStraightLine(cordinates));
        System.out.println(checkIfStraightLine(cordinates2));


    }

    //constraint
    //minimum of 2points and maximum of 1000points
    public static boolean checkIfStraightLine(int[][] cordinates) {
        int points = cordinates.length;
        int xDiff = cordinates[1][0] - cordinates[0][0];
        int yDiff = cordinates[1][1] - cordinates[0][1];

        int xCurlDiff, yCurlDiff;

        for (int i = 1; i < points; i++) {

            xCurlDiff = cordinates[i][0] - cordinates[i-1][0];
            yCurlDiff = cordinates[i][1] - cordinates[i-1][1];

            if((yDiff * xCurlDiff) != (xDiff * yCurlDiff))
                    return false;
        }
        return  true;
    }
}
