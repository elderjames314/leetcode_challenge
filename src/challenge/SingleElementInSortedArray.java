package challenge;

import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] nums2 = {3,3,7,7,10,11,11};
        int n = getSingleElement2(nums);
        System.out.println(n);
    }

    private static int getSingleRonRepeatedElement(int[] numbers) {

        if(numbers.length==1)
            return numbers[0];

        int current = 0;
        final int nonRepeated = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i <numbers.length; i++) {
            int count =1;
            if(mp.containsKey(numbers[i]))
                count++;
            mp.put(numbers[i],count);
        }
       for(Map.Entry<Integer, Integer> m :  mp.entrySet()) {
           if(m.getValue()==1)
               return m.getKey();
        }

        System.out.println(mp);

        return -1;



    }

    public static int getSingleElement2(int[] numbers) {
        //if there is single number in the array
        if(numbers.length==1)
            return numbers[0];
        //check if the unique element occur at the first or last
        int low = 0;
        int high = numbers.length - 1;
        int mid;
        if(numbers[0] != numbers[1])
            return numbers[0];
        if(numbers[high] != numbers[high -1])
            return numbers[high];

        //perform the binary search
        while (low <= high) {
            mid = low + (high-low)/2;
            //perform partition check to find unique element
            if(numbers[mid] != numbers[mid + 1] && numbers[mid] != numbers[mid-1])
                return numbers[mid];
            if((mid/2)==0 && numbers[mid] == numbers[mid+1] || (mid/2)==1 && numbers[mid]==numbers[mid-1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
