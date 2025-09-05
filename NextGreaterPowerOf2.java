import java.util.Scanner;
public class NextGreaterPowerOf2 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        
        int N = obj.nextInt();
        
           System.out.println(nextNumber(N));
    }
    
    public static int nextNumber(int n){
        int power = 1;
        
        while(power <= n){
            
            power = power * 2;
        }
        
        return power;
    }
}