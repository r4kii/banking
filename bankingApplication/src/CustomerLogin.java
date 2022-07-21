import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerLogin {

    static Scanner sc = new Scanner(System.in);

    public void login (ArrayList<Customer> customerList){

        CustomerAuthorization ca = new CustomerAuthorization();
        System.out.println("Enter your Customer ID");
        int id = sc.nextInt();
        System.out.println("Enter your Password");
        String pass = sc.next();

        boolean check = false;
        check = ca.authentication(id,pass,customerList);
        while(!check){
            System.out.println("Enter your Customer ID");
            id = sc.nextInt();
            System.out.println("Enter your Password");
            pass = sc.next();
            check = ca.authentication(id, pass,customerList);
        }

//        Customer c;
//        for(Customer c1 : customerList){
//            if(id==c1.getCustomerID()){
//                c=c1;
//            }
//        }
        OperationsPage opMenu = new OperationsPage();
        opMenu.operationMenu(customerList.get(id-1),customerList);
    }
}
