

/*
 * Created by Zhenxian Yang
 * User: Zhenxian
 * Date: 2018/7/12
 * Time: 16:08
 * All Rights Reserved To Zhenxian
 */

public interface Hockey extends Sports{
    void homeGoalScored(int points);

    void vistingGoalScored(int points);

    void endGoalScored(int points);

    void overtimePeriod(int ot);
}

