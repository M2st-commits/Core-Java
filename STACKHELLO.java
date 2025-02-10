import java.util.Scanner;
import java.util.Stack;
public class STACKHELLO {
    public static void StackOperation(int [] arr){
        Stack<Integer> str = new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            str.push(arr[i]);
        }
        System.out.println(str.peek());
        System.out.println(str.pop());
        System.out.println(str.isEmpty());
        System.out.println(str.size());
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        StackOperation(arr);
        sc.close();
    }
}
