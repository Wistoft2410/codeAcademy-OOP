public class Calculator {

    int balance;

    public Calculator(int initialBalance){
        balance = initialBalance;
    }

    public void add(int amountToDeposit){
        int updatedBalance = balance + amountToDeposit;
        balance = updatedBalance;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int subtract(int amountToWithdraw){
        int updatedBalance = balance - amountToWithdraw;
        balance = updatedBalance;
        System.out.println("You just withdrew " + amountToWithdraw);

        return amountToWithdraw;

    }

    public static void main(String[] args){
        Calculator savings = new Calculator(2000);

        savings.add(600);
        savings.subtract(300);

    }
}
