import java.util.Scanner;
import java.lang.Math;

/*
 * Bai toan: Nhap so nguyen n tu ban phim, in ra tat ca cac so nguyen to nho hon n
 * @author: dinhngocmai
 * @version: 0.0.2
 * */

public class Prime {
	
    /*Ham kiem tra so nguyen to*/
    protected static boolean isPrime(int num) {
        int maxLoop; //so vong lap lon nhat
        maxLoop = (int) Math.sqrt(num);
        
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i <= maxLoop; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    
    /*main*/
    public static void main(String[] args) {
	
    	int numb;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap n ");
        try {
        	numb = scan.nextInt();
        	for (int i = 2; i <= numb; i++) {
                if(isPrime(i))
                    System.out.print(i + "\t");
            }
        } catch(Exception e) {
        	System.out.println("You must enter the number");
        }
        
        //Giai phong scan
        scan.close();
            
    }
}
