import java.util.Scanner; 

public class Program {
    static String firstHalf(String given) {
        return given.substring(0, (int) Math.floor(given.length() / 2));
    }
    static String secondHalf(String given) {
        return given.substring((int) Math.floor(given.length() / 2));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String first = in.nextLine();
        System.out.println("Enter second string: ");
        String second = in.nextLine();
        if (first.length() > second.length()) {
            System.out.println(first + " is longer");
        } else if (first.length() == second.length()) {
            System.out.println("Both strings have the same length");
        } else {
            System.out.println(second + " is longer");
        }
        System.out.println("First half: " + firstHalf(first));
        System.out.println("Second half: " + secondHalf(first));
        System.out.println("First half: " + firstHalf(second));
        System.out.println("Second half: " + secondHalf(second));
        if (first.indexOf(second) == -1) {
            System.out.println(second + " is NOT found in " + first);
        } else {
            System.out.println(second + " is found in " + first + " at index " + first.indexOf(second));
        }
    }
}
