import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();
        while (true){
            System.out.println(" Banking Application\n");
            System.out.println("1:Login");
            System.out.println("2:Register User ");
            System.out.println("3: Exit");
            Scanner sc = new Scanner(System.in);
            int choice =sc.nextInt();

            switch (choice){
                case 1: {
                    CustomerLogin cl = new CustomerLogin();
                    cl.login(customerList);
                    break;

                }
                case 2:{
                    CustomerRegistration cr = new CustomerRegistration();
                    cr.createCustomer(customerList);
                    break;
                }
                case 3:{
                    System.exit(0);
                }

            }
        }
    }
}
