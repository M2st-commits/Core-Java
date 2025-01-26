import java.util.Scanner;
public class MinMax{
    public static int Min(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }return min;
    }
    public static int Max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;
    }
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minval=Min(arr);
        int maxval=Max(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        if(minval !=0 && (minval%maxval==0 || maxval%minval==0)){
            System.out.print("True"+" ");
        }else{
            System.out.print("False"+" ");
        }
        sc.close();
    }
}