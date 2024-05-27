public class BubbleSort {

    public static void sort(int arr[]){
        for(int i=0;i < arr.length;i++){
            for(int j=0;j < arr.length-1;j++){
                while (arr[j] > arr[j+1]) {
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={3,2,5,6,4,8,9,7,1,0};
        sort(arr);
        for(int i=0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }     
    }
    
}