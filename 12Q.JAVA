import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks in Mathematics: ");
        int mathMarks = sc.nextInt();
        
        System.out.print("Enter marks in Physics: ");
        int physicsMarks = sc.nextInt();
        
        System.out.print("Enter marks in Chemistry: ");
        int chemistryMarks = sc.nextInt();
        
        int totalMarks = mathMarks + physicsMarks + chemistryMarks;
        
        if ((mathMarks >= 60 && physicsMarks >= 50 && chemistryMarks >= 40 && totalMarks >= 200) ||
            (mathMarks + physicsMarks >= 150)) {
            System.out.println("Eligible for admission.");
        } else {
            System.out.println("Not eligible for admission.");
        }
        
        sc.close();
    }
}
