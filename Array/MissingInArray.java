/* Given an array of size n-1 such that it only contains distinct integers in the range of 1 to n. 
Return the missing element.

Examples:

Input: n = 5, arr[] = [1,2,3,5]
Output: 4
Explanation : All the numbers from 1 to 5 are present except 4. */

package Array;

public class MissingInArray {

    public static int FindMissing(int arr[],int n){
        int totalSum = n * (n + 1)/2;
        int arrSum = 0;

        for(int num : arr){
            arrSum += num;
        }
        return totalSum - arrSum;
    }
}