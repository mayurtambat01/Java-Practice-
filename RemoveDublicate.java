import java.util.Scanner;
public class RemoveDublicate {

    public static String removeDublicate(String str){
        if (str.length()==1) {
            return str;
        }
        if (str.charAt(0)==str.charAt(1)) {
            return removeDublicate(str.substring(1));
        }
        return str.charAt(0) + removeDublicate(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(removeDublicate(str));
    }
    
}