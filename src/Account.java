import java.util.Scanner;
/*
* Creating Account Class for intialising variables taken from user
* */
public class Account {

    public static void main(String[] args){
        AccountTest obj = new AccountTest();
        Account obj2 = new Account();

        double account_Balance=1000000;         //taking account Balance as 1000000
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter amount to be Debit");
        double debit = sc.nextDouble();

        System.out.println("Amount Debited from Account : "+debit);
        System.out.println("Total balance left in Account : "+ obj.balance(debit,account_Balance));
    }
}

/*
* Account test class for checking User entered amount lessthan Account Balance
* */
class AccountTest {

    double balance(double debit, double account_Balance) {
        Account obj = new Account();
        double balance_left=0;
        /*
        * Checking debit amount lessthan Account balance using if Condition
        * */
        if (debit<=account_Balance)
        {
            balance_left = account_Balance - debit;
            return balance_left;
        }
        else
        {
            System.out.println("Debit amount Exceeds Balance in account");
        }
        return 0;
    }
}

