package java15.entity;

import java.util.Random;

/**
 * Created by Администратор on 11.06.2017.
 */
public class HardWorkingCashier extends ACashier {

    protected int beepTheGoods(int countOfGoods)
    {
        return (countOfGoods * 4);
    }
    protected int countSum(int countOfGoods)
    {
        return (countOfGoods * 2);
    }
    protected int giveChange()
    {
        return 2;
    }
    public int doWork(Customer customer)
    {
        Random random = new Random();
        int countOfGoods = random.nextInt(12) + 1;
        timeOfWork = beepTheGoods(countOfGoods) + countSum(countOfGoods) + giveChange();
        return timeOfWork;
    }
}
