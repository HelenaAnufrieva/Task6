package java15.entity;

/**
 * Created by Администратор on 12.06.2017.
 */
public class SlowlyCustomer extends ACustomer{

    @Override
    protected int putGoodsOnTheLine() {
        return 30;
    }

    @Override
    public int payForGoods() {
        return 25;
    }

    @Override
    public int doShopping() {
        int timeOfShopping;
        timeOfShopping = putGoodsOnTheLine() + payForGoods();
        return timeOfShopping;
    }
}
