import java.util.Scanner;
import java.util.Stack;
public class StackPalindrome {
    public static boolean PalindromeCheck(int arr[]){
        Stack<Integer> str = new Stack<>();
        for(int i=0;i<arr.length;i++){
            str.push(arr[i]);
        }
        for(int i=0;i<str.size();i++){
            if(str.pop() != arr[i]){
                return false;
            }
        }return true;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println( PalindromeCheck(arr));
        sc.close();
    }
}
