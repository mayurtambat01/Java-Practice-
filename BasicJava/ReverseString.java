/*
You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
*/

public class ReverseString {

    public static String reverse(String str){
        String ans = "";
        for(int i=str.length()-1;i >= 0;i--){
            ans += str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "Geeks";
        System.out.println(reverse(str));
    }    
}