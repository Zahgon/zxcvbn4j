package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseDictionaryMatcher extends BaseMatcher {

    private final Map<String, Map<String, Integer>> rankedDictionaries;

    public ReverseDictionaryMatcher(Context context, Map<String, Map<String, Integer>> rankedDictionaries) {
        super(context);
        if (rankedDictionaries == null) {
            this.rankedDictionaries = new HashMap<>();
        } else {
            this.rankedDictionaries = rankedDictionaries;
        }
    }

    @Override
    public List<Match> execute(CharSequence password) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
