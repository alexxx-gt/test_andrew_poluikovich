package TestTask;

import java.math.BigDecimal;

public class SumWithoutPlus {
    public static int sum(int first, int second) {
        BigDecimal firstBD  = new BigDecimal(first);
        BigDecimal secondBD = new BigDecimal(second);
        return firstBD.add(secondBD).intValue();
    }

}
