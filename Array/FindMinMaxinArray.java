package Array;

public class FindMinMaxinArray {

    public static long[] Find(long arr[]){
        long min = arr[0];
        long max = arr[0];

        for(long num : arr){
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new long[]{min,max};
    }
}