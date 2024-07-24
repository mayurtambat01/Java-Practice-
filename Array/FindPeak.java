package Array;

public class FindPeak {

    public static int peak(int arr[],int n){
        int left = 0;
        int right = n-1;

        while(left > right){
            int mid = left + (right - left)/2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}