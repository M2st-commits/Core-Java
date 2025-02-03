import java.util.Scanner;

public class IsPrime {
    static boolean PrimeCheck(Character ch) {
        int num = Character.getNumericValue(ch);
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();
        System.out.println(PrimeCheck(ch));
    }
}
