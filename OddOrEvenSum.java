import java.util.Scanner;
public class OddOrEvenSum {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        
        int N = obj.nextInt();
        int M = obj.nextInt();
        
        int Sum = N + M;
        
        if(Sum % 2 != 0){
            
            System.out.println("odd");
        }else{
            
            System.out.println("even");
        }
    }
}