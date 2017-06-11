package java15.entity;

import java.util.Random;

/**
 * Created by Администратор on 11.06.2017.
 */
public class NormalWorkingCashier extends ACashier {

    protected int beepTheGoods(int countOfGoods)
    {
        return (countOfGoods * 5);
    }
    protected int countSum(int countOfGoods)
    {
        return (countOfGoods * 3);
    }
    protected int giveChange()
    {
        return 4;
    }
    public int doWork(Customer customer)
    {
        Random random = new Random();
        int countOfGoods = random.nextInt(12) + 1;
        timeOfWork = beepTheGoods(countOfGoods) + countSum(countOfGoods) + giveChange();
        return timeOfWork;
    }
}
