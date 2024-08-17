
public class RemoveSpaces {

    public static String remove(String str){
        return str.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(remove("I Have An Idea"));
    }
}
