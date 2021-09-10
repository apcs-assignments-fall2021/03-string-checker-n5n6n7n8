import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int total=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='b'||str.charAt(i)=='c') {
                total++;
            }
        }
        return total;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        return str.toLowerCase().contains("the");
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int len = str.length()/2;
        String backward = "";
        for(int i=0; i<len; i++)
        {
            backward = str.charAt(i) + backward;
        }
        return backward.equals(str.substring(str.length()-len));
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to check how many of a, b, or c it has");
        String abc = scan.nextLine();
        System.out.println(countABC(abc));
        System.out.println("Enter a word to check if it contains the word 'the'. I will say if it's true or false");
        String theword = scan.nextLine();
        System.out.println(containsThe(theword));
        System.out.println("Enter a word to check if it is a palindrome. I will say if it's true or false");
        String palindrome = scan.nextLine();
        System.out.println(isPalindrome(palindrome));

    }
}
