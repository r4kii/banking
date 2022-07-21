import java.util.ArrayList;
import java.util.Scanner;

public class OperationsPage {

    public void operationMenu(Customer c, ArrayList<Customer> customerList){

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Amount withdrawal \n2.Cash Deposit \n3.Account Transfer\n4.View Transactions ");
        int choice = sc.nextInt();
        Operations op = new Operations();
        switch (choice){
            case 1: {
                op.withdraw(c);
                break;
            }
            case 2:{
                op.cashDeposit(c);
                break;
            }
            case 3:{
                op.accountTransfer(c,customerList);
                break;
            }
            case 4:{
                op.viewTransactions(c);
            }

        }
    }

}
