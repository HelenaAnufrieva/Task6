package java15.entity;

/**
 * Created by Администратор on 11.06.2017.
 */
public abstract class ACashier implements Cashier{

    int timeOfWork;

    public ACashier() {
        timeOfWork = 0;
    }

    protected abstract int beepTheGoods(int countOfGoods);

    protected abstract int countSum(int countOfGoods);

    protected abstract int giveChange();
}

