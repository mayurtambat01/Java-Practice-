import java.util.Scanner;
public class LargestColumnSum2DArray {
    
    public static int[][] takeinput(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Rows");
        int row = s.nextInt();
        System.out.println("Enter Column");
        int col = s.nextInt();

        int input[][]=new int[row][col];

        for(int i=0;i < row;i++){
            for(int j=0;j < col;j++){
                System.out.println("Enter Elements At "+i+" Row "+j+" Column");
                input[i][j]=s.nextInt();
            }
        }
        for(int i=0;i < row;i++){
            for(int j=0;j < col;j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
        return input;
    }

    public static int largestColumnSum(int input[][]){
        int row = input.length;
        int col = input[0].length;

        int largest = Integer.MIN_VALUE;

        for(int j=0;j < col;j++){
            int sum = 0;
            for(int i=0;i < row;i++){
                sum += input[i][j];
            }
            if (sum > largest) {
                largest = sum;                
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int input[][]=takeinput();
        int largest = largestColumnSum(input);
        System.out.println(largest);
    }

}