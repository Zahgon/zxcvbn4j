package com.nulabinc.zxcvbn;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TimeEstimates {

    private static final double GUESSES_PER_HOUR = 100.0 / 3600.0;

    private static final double GUESSES_ONLINE_NO_THROTTLING = 10;

    private static final double GUESSES_OFFLINE_SLOW_HASHING = 1e4;

    private static final double GUESSES_OFFLINE_FAST_HASHING = 1e10;

    private static final int DELTA = 5;

    private static final double MINUTE = 60.0;

    private static final double HOUR = MINUTE * 60;

    private static final double DAY = HOUR * 24;

    private static final double MONTH = DAY * 31;

    private static final double YEAR = MONTH * 12;

    private static final double CENTURY = YEAR * 100;

    private TimeEstimates() {
        throw new IllegalStateException("TimeEstimates should not be instantiated");
    }

    public static AttackTimes estimateAttackTimes(double guesses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int guessesToScore(double guesses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String displayTime(final double seconds) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String format(double number, String text) {
        return String.format(text, Math.round(number)) + (number != 1 ? "s" : "");
    }

    private static double divide(double dividend, double divisor) {
        BigDecimal dividendDecimal = BigDecimal.valueOf(dividend);
        BigDecimal divisorDecimal = BigDecimal.valueOf(divisor);
        return dividendDecimal.divide(divisorDecimal, RoundingMode.HALF_DOWN).doubleValue();
    }
}
