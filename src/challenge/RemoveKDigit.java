package challenge;

import java.util.Stack;

public class RemoveKDigit {

    public static void main(String[] args) {
        String num = "1432219";
        String num2 = "112";
        System.out.println(removeKdigits(num, 3));
    }

    public static String removeKdigits(String num, int k) {
        //given 123451
        //what are the numbers that you can remove to form the smallest possible result
        //remove the pick number to flatten the graph
        Stack<Integer> visited = new Stack<>();
        int lastIndex = num.length();
        for(int i = 0; i < num.length(); i++) {
          //if item is first and is not equal to zero
            Integer value = Integer.parseInt(""+num.charAt(i));

            while (!visited.isEmpty() && visited.peek() >  value && k > 0) {
                visited.pop();
                k--;
            }
            if(!visited.isEmpty() || value != 0)
                visited.push(value);
        }
        //now remove the largest value from the top of the stack
        while (!visited.isEmpty() && k > 0) {
            visited.pop();
            k--;
        }
        if(visited.isEmpty())
            return "0";

        System.out.println(visited);
        String item = "";
        for(int val : visited) {
           item += ""+val;
        }

        return item;
    }
}
