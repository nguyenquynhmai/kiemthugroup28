import java.util.*;
public class Prime {
    
    static boolean isPrime(int x) {
        int cout = 0;
        for (int i = 2; i < x; i++) {
            if (x%i==0)
                cout++;
        }
        if (cout == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
	
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n ");
        int n = in.nextInt();
        for (int i = 2; i < n; i++) {
            if(isPrime(i))
                System.out.println(i);
        }    
    }
}
