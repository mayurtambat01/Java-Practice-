public class InsertionSort{
    
    public static void sort(int arr[]){
        for(int i=1;i < arr.length;i++){
            int j=i-1;
            int n=arr[i];
            while(j >= 0 && arr[j] > n){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=n;
        }
    }

    public static void main(String[] args){
        int arr[]={10,30,20,50,40,90,70,80};
        sort(arr);
        for(int i=0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}