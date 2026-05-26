package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import com.nulabinc.zxcvbn.matchers.Match;
import java.util.AbstractMap;
import java.util.Map;
import java.util.regex.Pattern;

public class DictionaryGuess extends BaseGuess {

    public static final Pattern START_UPPER = Pattern.compile("^[A-Z][^A-Z]+$");

    private static final Pattern END_UPPER = Pattern.compile("^[^A-Z]+[A-Z]$");

    public static final Pattern ALL_UPPER = Pattern.compile("^[^a-z]+$");

    private static final Pattern ALL_LOWER = Pattern.compile("^[^A-Z]+$");

    public DictionaryGuess(final Context context) {
        super(context);
    }

    @Override
    public double exec(Match match) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int uppercaseVariations(Match match) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int l33tVariations(Match match) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int calculateSubstitutionVariation(Map.Entry<Character, Character> substitution, WipeableString token) {
        Character substitutedChar = substitution.getKey();
        Character originalChar = substitution.getValue();
        AbstractMap.SimpleImmutableEntry<Integer, Integer> counts = countCharOccurrences(token, substitutedChar, originalChar);
        int substitutedCount = counts.getKey();
        int originalCount = counts.getValue();
        if (substitutedCount == 0 || originalCount == 0) {
            return 2;
        }
        return calculatePossibleCombinations(originalCount, substitutedCount);
    }

    private static AbstractMap.SimpleImmutableEntry<Integer, Integer> countCharOccurrences(WipeableString str, char char1, char char2) {
        int count1 = 0;
        int count2 = 0;
        for (char currentChar : str.charArray()) {
            if (currentChar == char1) {
                count1++;
            }
            if (currentChar == char2) {
                count2++;
            }
        }
        return new AbstractMap.SimpleImmutableEntry<>(count1, count2);
    }

    private static int calculatePossibleCombinations(int originalCount, int substitutedCount) {
        int minCount = Math.min(originalCount, substitutedCount);
        int possibleCombinations = 0;
        for (int i = 1; i <= minCount; i++) {
            possibleCombinations += calculateBinomialCoefficient(originalCount + substitutedCount, i);
        }
        return possibleCombinations;
    }
}
