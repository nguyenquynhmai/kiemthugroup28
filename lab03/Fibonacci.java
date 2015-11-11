import java.util.Scanner;
/*
 *Viet chuong trinh nhap vao so n, dua ra so Fibonacci thu n. Voi F0 = 1, F1 = 1.
 *@author: hahongviet
*/   
public class Main {
     
    /*ham nhap so tu ban phim*/
    public static int enterNumber(){
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n = 0;
        
        while (!check) {
            System.out.println(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("You must enter a number. Please try again.");
                input.nextLine();
            }
        }
        
        input.close();
        
        return (n);
    }
    
    /*Ham main*/
    public static void main(String[] args) {
        
        System.out.print("Enter the number n");
        int n = enter();
        int [] fibonacciArr = new int[n+1];
        fibonacciArr[0] = 1; 
        fibonacciArr[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            fibonacciArr[i] = fibonacciArr[i-1] + fibonacciArr[i-2];
        }
        
        System.out.println("The " + n + "-th Fibonacci number is:" + fibonacciArr[n]);
    }
}
