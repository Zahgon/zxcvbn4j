package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class BaseMatcher implements Matcher {

    private final Context context;

    protected BaseMatcher(Context context) {
        this.context = context;
    }

    protected Context getContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected List<Match> sorted(List<Match> matches) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class MatchComparator implements Comparator<Match>, Serializable {

        private static final long serialVersionUID = 1L;

        @Override
        public int compare(Match o1, Match o2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
