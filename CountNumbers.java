import java.util.Scanner;
public class CountNumbers {
    static int count = 0;
    public static int countDigit(int n){
        if (n > 0) {
            count++;
            countDigit(n/10);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(countDigit(n));
    }
    
}