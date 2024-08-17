/* 
Given two arrays arr1[] and arr2[], the task is to find the
number of elements in the union between these two arrays.

The Union of the two arrays can be defined as the set containing
distinct elements from both arrays. If there are repetitions,
then only one element occurrence should be there in the union.

Note: Elements are not necessarily distinct.

Examples

Input: arr1[] = [1, 2, 3, 4, 5], arr2[] = [1, 2, 3]
Output: 5
Explanation: 1, 2, 3, 4 and 5 are the elements which
comes in the union setof both arrays. So count is 5.
*/

import java.util.HashSet;

public class UnionOfTwoArrays {

    public static int Union(int arr1[],int arr2[]){
        HashSet<Integer> union = new HashSet<>();

        for(int num : arr1){
            union.add(num);
        }
        for(int num : arr2){
            union.add(num);
        }
        return union.size();
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3};

        System.out.println(Union(arr1, arr2));
    }    
}