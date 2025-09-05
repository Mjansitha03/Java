import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> tokens = new ArrayList<>();
        while (sc.hasNextInt()) tokens.add(sc.nextInt());
        sc.close();

        if (tokens.size() == 0) return;

        if (tokens.size() == 1) {
            printFactors(tokens.get(0));
            System.out.println();
            return;
        }

        int first = tokens.get(0);
      
        if (tokens.size() == first + 1) {
            for (int i = 1; i < tokens.size(); i++) {
                printFactors(tokens.get(i));
                System.out.println();
            }
        } else {
           
            for (int i = 0; i < tokens.size(); i++) {
                printFactors(tokens.get(i));
                if (i != tokens.size() - 1) System.out.println();
            }
        }
    }


    static void printFactors(int n) {
        if (n <= 0) { 
            System.out.print("");
            return;
        }

        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                small.add(i);
                if (i != n / i) large.add(n / i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int v : small) sb.append(v).append(' ');
        Collections.reverse(large);           
        for (int v : large) sb.append(v).append(' ');

        if (sb.length() > 0) sb.setLength(sb.length() - 1);
        System.out.print(sb.toString());
    }
}