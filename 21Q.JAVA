import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal: " + decimal);
        
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Decimal to Binary: " + binaryNumber);
        
        sc.close();
    }
}
