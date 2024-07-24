/*
Given an integer array arr[]. Find the contiguous 
sub-array(containing at least one number) that has 
the maximum sum and return its sum.

Examples:

Input: arr[] = [1, 2, 3, -2, 5]
Output: 9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
*/
package Array;

public class KadaneAlgorithm {
    
    public static long maxSubArraySum(int arr[]){
        long maxEndinghere = arr[0];
        long maxSoFar = arr[0];
        for(int i=1;i < arr.length;i++){
            maxEndinghere = Math.max(arr[i], maxEndinghere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndinghere);
        }
        return maxSoFar;
    }
}
