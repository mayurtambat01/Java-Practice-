/**
 * SubSequencePrint
 */
public class SubSequencePrint {

    public static void print(String input,String outputSoFar){
        if (input.length()==0) {
            System.out.println(outputSoFar);
            return;
        }
        print(input.substring(1),outputSoFar);
        print(input.substring(1), outputSoFar + input.charAt(0));
    }
    public static void print(String input){
        print(input, " ");
    }

    public static void main(String[] args) {
        print("I am Ramesh");
    }
}