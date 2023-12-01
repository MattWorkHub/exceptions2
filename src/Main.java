public class Main {
    public static void main(String[] args) {
        char number = '5';
        parameterCheck(number);
    }
    public static void parameterCheck(char number) {
        if (Character.isDigit(number) == false) {
            throw new ArithmeticException("Char is not a number");
        }
        else {
            System.out.println("The character " + number + " is a number");
        }
    }
}