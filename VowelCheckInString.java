import java.util.Scanner;
public class VowelCheckInString {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        
        String str = obj.nextLine().toLowerCase();
        
        if(isVowels(str)){
            System.out.println("yes");
        }else{
             System.out.println("no");
        }
        
    }
    
    public static Boolean isVowels(String str){
        
        for(int i = 0; i <= str.length() -1; i++){
            
         char ch = str.charAt(i);
         
            if("aeiou".indexOf(ch) != -1){
                
                     return true;
            }
        }
        
        return false;
    }
}