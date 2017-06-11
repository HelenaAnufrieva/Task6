package java15;

import java15.entity.*;

import java.util.Random;

public class Application {

    public void run() {
        Register register = new Register(new LazyCashier());
        Random random = new Random();
        int i;
        System.out.println("LAZY Cashier:");
        for (i = 0; i < random.nextInt(100); i++)
            register.newCustomer(new NormalCustomer());
        System.out.println("\t Normal customers: " + i);

        for (i = 0; i < random.nextInt(100); i++)
            register.newCustomer(new CustomerWithCreditCard());
        System.out.println("\t Customers with credit card: " + i);

        for (i = 0; i < random.nextInt(100); i++)
            register.newCustomer(new SlowlyCustomer());
        System.out.println("\t Slowly customers: " + i);
        register.run();


        register = new Register(new NormalWorkingCashier());
        System.out.println("NORMAL-WORKING Cashier:");
        for (i = 0; i < random.nextInt(100); i++)
            register.newCustomer(new NormalCustomer());
        System.out.println("\t Normal customers: " + i);

        for (i = 0; i < random.nextInt(100); i++)
            register.newCustomer(new CustomerWithCreditCard());
        System.out.println("\t Customers with credit card: " + i);

        for (i = 0; i < random.nextInt(100); i++)
            register.newCustomer(new SlowlyCustomer());
        System.out.println("\t Slowly customers: " + i);
        register.run();


        register = new Register(new HardWorkingCashier());
        System.out.println("HARD-WORKING Cashier:");
        for (i = 0; i < random.nextInt(100); i++)
            register.newCustomer(new NormalCustomer());
        System.out.println("\t Normal customers: " + i);

        for (i = 0; i < random.nextInt(100); i++)
            register.newCustomer(new CustomerWithCreditCard());
        System.out.println("\t Customers with credit card: " + i);

        for (i = 0; i < random.nextInt(100); i++)
            register.newCustomer(new SlowlyCustomer());
        System.out.println("\t Slowly customers: " + i);
        register.run();
    }
}
