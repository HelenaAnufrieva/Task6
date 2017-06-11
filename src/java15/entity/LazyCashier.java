package java15.entity;

import java.util.Random;

/**
 * Created by Администратор on 11.06.2017.
 */
public class LazyCashier extends ACashier {

    @Override
    protected int beepTheGoods(int countOfGoods) {
        return (countOfGoods * 8);
    }
    @Override
    protected int countSum(int countOfGoods) {
        return (countOfGoods * 5);
    }

    @Override
    protected int giveChange() {
        return 25;
    }

    @Override
    public int doWork(Customer customer) {
        Random random = new Random();
        int countOfGoods = random.nextInt(12) + 1;
        timeOfWork = beepTheGoods(countOfGoods) + countSum(countOfGoods) + giveChange();
        return timeOfWork;
    }
}
