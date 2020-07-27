package challenge;

import java.util.ArrayList;
import java.util.List;

public class CheckIfPerfectSquare {

    public static void main(String[] args) {
        Integer num = 8;
        System.out.println(checkIfNumberIsAPerfectSquare(num));


    }

    public static boolean checkIfNumberIsAPerfectSquare(int num) {
        for (long i = 0; i * i <=num; i++) {
            if(i*i == num)
                return true;

        }
        return false;
    }


}
