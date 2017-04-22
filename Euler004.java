package projecteuler;

public class Euler4 {
    
    public static void main(String[] args) {
        int one = 999;
        int two = 999;
        int possible;
        int current = 0;
        
        while(one > 800) {
            while(two > 800) {
                possible = one * two;
                String check = Integer.toString(possible);
                System.out.println(one + " " + two);
                if(checkPalindrome(check) && possible > current)
                    current = possible;
                two--;
            }
            one--;
            two = 999;
        }
        
        System.out.println(one);
        
        System.out.println("Largest palindrome: " + current);
    }
    
    private static boolean checkPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}