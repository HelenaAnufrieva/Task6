package java15.entity;

/**
 * Created by Администратор on 11.06.2017.
 */
public class NormalCustomer extends ACustomer {
    @Override
    protected int putGoodsOnTheLine() {
        return 15;
    }

    @Override
    protected int payForGoods() {
        return 10;
    }
    @Override
    public int doShopping() {
        int timeOfShopping;
        timeOfShopping = putGoodsOnTheLine() + payForGoods();
        return timeOfShopping;
    }
}
