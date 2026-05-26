package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;

public abstract class BaseGuess implements Guess {

    private final Context context;

    protected BaseGuess(Context context) {
        this.context = context;
    }

    protected Context getContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected static int calculateBinomialCoefficient(int n, int k) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
