package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.matchers.Match;

public class DateGuess extends BaseGuess {

    public DateGuess(final Context context) {
        super(context);
    }

    @Override
    public double exec(Match match) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private double calculateYearSpace(int year) {
        return Math.max(Math.abs(year - REFERENCE_YEAR), MIN_YEAR_SPACE);
    }

    private boolean hasSeparator(String separator) {
        return separator != null && !separator.isEmpty();
    }
}
