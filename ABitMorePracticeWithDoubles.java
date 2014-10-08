import java.util.Scanner;

public class ABitMorePracticeWithDoubles {

    double total;
    double years;
    double interest;
    
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
    
        
        
        ABitMorePracticeWithDoubles test = new ABitMorePracticeWithDoubles();
    
        test.findInfo();
        
        System.out.println("Your total to be repaid is " + test.toBePaid());
        System.out.println("You amount to be paid each year is " + test.everyYear());
        
        
        System.out.println("The number of years before you are paying off " + 
                         "principal is " + (test.calcInterest() / test.everyYear()));
    
    }

    public double toBePaid() {
    
        return calcInterest() + total;
    }
    
    public double everyYear() {
        
        return calcInterest() + (total/years);
    }
    
    
    public double calcInterest() {
        
        double compound = 0;
        
        for (int count = 0; count < years; count++) {
            compound += total * interest;
        }
        
        return compound;
    }
    
    public void findInfo() {
        System.out.print("How much did you borrow in total? > ");
        total = keyboard.nextDouble();
        
        System.out.print("How many years to pay it back? > ");
        years = keyboard.nextDouble();
        
        System.out.print("What is the interest rate? > ");
        interest = keyboard.nextDouble();
    }
}