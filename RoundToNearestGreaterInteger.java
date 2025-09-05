public class RoundToNearestGreaterInteger {
    public static void main(String[] args) {
        double number = 5.3;
        int roundedNumber = (int) Math.ceil(number);
        System.out.println("The nearest greater integer to " + number + " is " + roundedNumber);
    }
}