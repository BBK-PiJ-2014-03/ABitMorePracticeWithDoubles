import java.util.Scanner;

public class ABitMorePracticeWithDoubles {

    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        
        double total;
        double years;
        double interest;
        
        System.out.print("How much did you borrow in total? > ");
        total = keyboard.nextDouble();
        
        System.out.print("How many years to pay it back? > ");
        years = keyboard.nextDouble();
        
        System.out.print("What is the interest rate? > ");
        interest = keyboard.nextDouble();
        
    }

    public double toBePaid(double total, double years, double interest) {
        
        double compound = 0;
        
        for (int count = 0; count < this.years; count++) {
            compound += this.total * this.interest;
        }
        
        return compound + this.total;
    }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        