import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        
        int num = obj.nextInt();
        
        if(isComposite(num)){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    
    }
    
    public static boolean isComposite(int num){
        if(num <= 1)
        return false;
        
        for(int i = 2; i * i <= num; i++){
            
            if(num % i == 0){
                return true;
            }
        }
        return false;
    }
}