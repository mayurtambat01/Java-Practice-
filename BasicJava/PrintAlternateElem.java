package BasicJava;

public class PrintAlternateElem {
    
    public static void alternate(int a[],int n){
        for(int i=0;i < n;i+=2){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int n = 7;
        alternate(a, n);
    }
}
