public class BinarySearch {

    public static int search(int arr[],int n){
       
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (n==arr[mid]) {
                return mid;
            }else if (n > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int index = search(arr, 7);
        System.out.println(index);
    }
    
}