import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        
        String str = obj.nextLine();
        
        int n = str.length();
        
        if(n == 0){
            System.out.print("*");
        }else if(n % 2 == 1){
            
            int mid1 = n / 2;
            System.out.print(str.substring(0,mid1) + "*" + str.substring(mid1 + 1));
        }else{
            int mid2 = n / 2;
            System.out.print(str.substring(0,mid2 - 1) + "**" + str.substring(mid2 + 1));
        }
    }
}