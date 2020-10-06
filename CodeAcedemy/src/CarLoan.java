/*
Let’s combine a few of the concepts that you have learned so far:
conditionals, Boolean expressions, and arithmethic expressions.

In this project, you will write a program that will
calculate the monthly car payment a user should expect to
make after taking out a car loan. The program will include the following:
*/
public class CarLoan {
    int carLoan = 10000;
    int loanLength = 3;
    int interestsRate = 5;
    int downPayment = 2000;

    CarLoan(/*int tempCarLoan, int tempLoanLength, int tempInteretsRate, int tempDownPayment*/){
        /*
        carLoan = tempCarLoan;
        loanLength = tempLoanLength;
        interestsRate = tempInteretsRate;
        downPayment = tempDownPayment;
        */
    }

    public void carLoanCheck(){
        if(carLoan <= 0 || interestsRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        }else if(downPayment >= carLoan){
            System.out.println("The car can be paid in full.");
        }else{
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestsRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }

    public static void main(String[] args) {
        CarLoan newLoan = new CarLoan();

        newLoan.carLoanCheck();
    }
}