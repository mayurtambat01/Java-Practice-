public class MergeTwoArray {

    public static int[] merge(int a[],int b[]){
        int i=0;
        int j=0;
        int k=0;

        int ans[]=new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k]=a[i];
                i++;
                k++;
            }else{
                ans[k]=b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            ans[k]=a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            ans[k]=b[j];
            j++;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={10,30,50,70,90};
        int b[]={20,40,60,80,100};
        int ans[]=merge(a, b);
        for(int i=0;i < ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}