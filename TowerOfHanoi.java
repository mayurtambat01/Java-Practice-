import java.util.Scanner;
public class TowerOfHanoi {
    
    public static void towerOfHanoi(int k,char s,char a,char d){
        if (k==0) {
            return;
        }
        towerOfHanoi(k-1,s,d,a);
        System.out.println(a +" "+ d);
        towerOfHanoi(k-1,a,s,d);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int k=s.nextInt();
        towerOfHanoi(3,'s','a','d');
    }
}