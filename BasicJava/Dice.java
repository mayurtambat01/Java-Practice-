package BasicJava;

public class Dice {

    public static int dice(int N){
        return 7 - N;
    }

    public static void main(String[] args) {
        System.out.println(dice(1));
    }    
}