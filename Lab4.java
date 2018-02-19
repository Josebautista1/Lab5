import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number:");
        String hex = input.nextLine();

        System.out.println("Your number is " + hexToDecimal(hex.toUpperCase()) + " in decimal"); //I'm practicing with GitHub!
    }
    public static long hexToDecimal(String hex) {
        long decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) { //READ THE INPUT THREAD.
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar); //CHANGER FROM HEXA TO DECI.
        }
        return decimalValue;
        }
        public static long hexCharToDecimal(char ch) { //FOR EVERY LETTER, THIS MIGHT CREATE A PROBLEM.
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        }
        else if (ch >='0' && ch >='X'){
            return 0;
            }
        else{
            return ch - '0';
        }
    }
}