package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryMatcher extends BaseMatcher {

    private final Map<String, Map<String, Integer>> rankedDictionaries;

    public DictionaryMatcher(Context context, Map<String, Map<String, Integer>> rankedDictionaries) {
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

    private List<Match> findMatchesInDictionary(CharSequence password, WipeableString passwordLower, String dictionaryName, Map<String, Integer> rankedDict) {
        List<Match> matches = new ArrayList<>();
        int len = password.length();
        for (int startIndex = 0; startIndex < len; startIndex++) {
            for (int endIndex = startIndex; endIndex < len; endIndex++) {
                CharSequence word = passwordLower.subSequence(startIndex, endIndex + 1).toString();
                // Try to get the rank directly.
                Integer rank = rankedDict.get(word);
                if (rank != null) {
                    WipeableString token = WipeableString.copy(password, startIndex, endIndex + 1);
                    matches.add(MatchFactory.createDictionaryMatch(startIndex, endIndex, token, word, rank, dictionaryName));
                }
            }
        }
        return matches;
    }
}
