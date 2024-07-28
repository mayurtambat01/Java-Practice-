/*Given an Array Arr of N positive integers and an integer X. 
Return the frequency of X in the array.

Example 1:

Input:
N = 5
Arr = {1, 1, 1, 1, 1}
X = 1
Output: 
5
Explanation: Frequency of 1 is 5.*/

package Array;

public class FindFrequaency {

    public static int frequency(int arr[],int n,int X){
    int count = 0;
    for(int num : arr){
        if (num == X) {
            count++;
        }
    }
    return count;
    }
}