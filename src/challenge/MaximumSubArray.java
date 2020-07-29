package challenge;

public class MaximumSubArray {
    //use kaban algorith
    public static void main(String[] args) {
        int[] arr =  {1,-2,3,-2};
       // int[] arr =  {5,-3, 5};
       // System.out.println(getMaxSubarrayCircular(arr));
        System.out.println(getMaxSubarrayCircular(arr));
    }






    public static int getMaxSubarrayCircular(int[] arr) {
        int total_sum = 0;
        int max_ending_at = 0;
        int min_ending_at = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;

        for(int x : arr) {

            total_sum += x;

            max_ending_at = Math.max(max_ending_at + x, x);
            max_sum = Math.max(max_ending_at, max_sum);
            min_ending_at = Math.min(min_ending_at + x, x);
            min_sum = Math.min(min_ending_at, min_sum);
        }
        if(max_sum > 0)
            return Math.max(max_sum, total_sum-min_sum);
        else
            return max_sum;

    }

}
