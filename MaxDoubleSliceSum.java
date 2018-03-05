public class MaxDoubleSliceSum {
    public static int solution(int[] A){
        int maxSum = 0;
        int[] maxSumEnd = new int[A.length];
        int[] maxSumStart = new int[A.length];

        //Use Kadane's Algorithm in 2 directions
        //Find the sum going forward and in reverse
        int j = A.length-2;
        for(int i = 1; i < A.length-1; i++){
            maxSumEnd[i] = Math.max(maxSumEnd[i-1] + A[i], 0);
            maxSumStart[j] = Math.max(maxSumStart[j+1] + A[j], 0);
            j--;
        }

        for(int i = 1; i < A.length-1; i++){
            maxSum = Math.max(maxSum, maxSumEnd[i-1]+maxSumStart[i+1]);
        }

        return maxSum;
    }
}
