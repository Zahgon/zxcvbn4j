package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Pattern;
import java.util.List;
import java.util.Map;

public class MatchFactory {

    private MatchFactory() {
    }

    public static Match createBruteforceMatch(int i, int j, CharSequence token) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Match createDictionaryMatch(int i, int j, CharSequence token, CharSequence matchedWord, int rank, String dictionaryName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Match createReversedDictionaryMatch(int i, int j, CharSequence token, CharSequence matchedWord, int rank, String dictionaryName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("java:S107")
    public static Match createDictionaryL33tMatch(int i, int j, CharSequence token, CharSequence matchedWord, int rank, String dictionaryName, boolean reversed, Map<Character, Character> sub, String subDisplay) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Match createSpatialMatch(int i, int j, CharSequence token, String graph, int turns, int shiftedCount) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Match createRepeatMatch(int i, int j, CharSequence token, CharSequence baseToken, double baseGuesses, List<Match> baseMatches, int repeatCount) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Match createSequenceMatch(int i, int j, CharSequence token, String sequenceName, int sequenceSpace, boolean ascending) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Match createRegexMatch(int i, int j, CharSequence token, String regexName, java.util.regex.Matcher regexMatch) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Match createDateMatch(int i, int j, CharSequence token, String separator, int year, int month, int day) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
