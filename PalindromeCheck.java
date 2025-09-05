import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
       
       String Str = obj.nextLine();
       
       if(isPalindrome(Str)){
           System.out.println("yes");
       }else{
           System.out.println("no");
       }
    }
    
    public static boolean isPalindrome(String str){
        
        str = str.toLowerCase();
        
        int Left = 0;
        int Right = str.length() - 1;
        
        while(Left < Right){
            
            if(str.charAt(Left) != str.charAt(Right)){
                return false;
            }
            
            Left ++;
            Right --;
        }
        
        return true;
    }
}