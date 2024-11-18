import java.util.Scanner;

class Commission {
    private double sales;

    // Constructor
    public Commission(double sales) {
        if (sales < 0) {
            System.out.println("Invalid Input");
            this.sales = -1;  // Invalid sales value
        } else {
            this.sales = sales;
        }
    }

    // Commission calculation method
    public double commission() {
        if (sales < 0) {
            return 0;  // Invalid sales case
        }
        return sales * 0.10;  // Assuming commission is 10% of sales
    }
}

public class CommissionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();
        
        Commission commission = new Commission(sales);
        
        if (sales >= 0) {
            System.out.println("Commission: " + commission.commission());
        }
        
        sc.close();
    }
}

