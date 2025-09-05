import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        
        if(isPrime(num)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    
     public static boolean isPrime(int num){
            
            if(num <= 1) 
            return false;
            
            if(num == 2)
            return true;
            
            if(num % 2 == 0)
            return false;
            
            for(int i = 3; i * i <= num; i += 2){
                
                if(num % i == 0)
                return false;
            }
            
            return true;
        }
}