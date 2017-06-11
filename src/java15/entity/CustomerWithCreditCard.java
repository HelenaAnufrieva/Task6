package java15.entity;

import java.util.Random;

/**
 * Created by Администратор on 11.06.2017.
 */
public class CustomerWithCreditCard extends ACustomer implements Customer{

    protected int putGoodsOnTheLine()
    {
        return 15;
    }
    protected int payForGoods() {
        Random random = new Random();
        int timeOfPaying = 10;
        boolean isPayed = false;
        while(!isPayed) {
            if (random.nextBoolean()) {
                isPayed = true;
                timeOfPaying += 10;
            }
            else isPayed = true;
        }
        return timeOfPaying;
    }
    public int doShopping()
    {
        timeOfShopping = putGoodsOnTheLine() + payForGoods();
        return timeOfShopping;
    }
}
