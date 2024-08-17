/* 
Given an array, arr. The task is to find the largest element in it.

Examples:

Input: arr = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
*/

public class LargestElemInArray {
    
    public static int largestElement(int arr[],int n){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i < arr.length;i++){
            if (arr[i] >= largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,90,5};
        System.out.println(largestElement(arr, 0));
    }
}