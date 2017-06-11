package java15.entity;

public abstract class ACustomer implements Customer {

    public int timeOfShopping;

    public ACustomer()
    {
        timeOfShopping = 0;
    }

    protected abstract int putGoodsOnTheLine();

    protected abstract int payForGoods();

}
