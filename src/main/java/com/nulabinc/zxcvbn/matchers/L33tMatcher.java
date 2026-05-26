package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class L33tMatcher extends BaseMatcher {

    private final Map<String, Map<String, Integer>> rankedDictionaries;

    private static final Map<Character, List<Character>> L33T_TABLE;

    static {
        Map<Character, List<Character>> table = new HashMap<>();
        table.put('a', Arrays.asList('4', '@'));
        table.put('b', Collections.singletonList('8'));
        table.put('c', Arrays.asList('(', '{', '[', '<'));
        table.put('e', Collections.singletonList('3'));
        table.put('g', Arrays.asList('6', '9'));
        table.put('i', Arrays.asList('1', '!', '|'));
        table.put('l', Arrays.asList('1', '|', '7'));
        table.put('o', Collections.singletonList('0'));
        table.put('s', Arrays.asList('$', '5'));
        table.put('t', Arrays.asList('+', '7'));
        table.put('x', Collections.singletonList('%'));
        table.put('z', Collections.singletonList('2'));
        L33T_TABLE = Collections.unmodifiableMap(table);
    }

    public L33tMatcher(Context context, Map<String, Map<String, Integer>> rankedDictionaries) {
        super(context);
        this.rankedDictionaries = rankedDictionaries;
    }

    public Map<Character, List<Character>> relevantL33tSubTable(CharSequence password) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<Character, List<Character>> relevantL33tSubTable(CharSequence password, Map<Character, List<Character>> table) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<Match> execute(CharSequence password) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Map<Character, Character> extractMatchSub(WipeableString token, Map<Character, Character> sub) {
        Map<Character, Character> matchSub = new HashMap<>();
        for (Map.Entry<Character, Character> subRef : sub.entrySet()) {
            Character subbedChr = subRef.getKey();
            Character chr = subRef.getValue();
            if (token.indexOf(subbedChr) != -1) {
                matchSub.put(subbedChr, chr);
            }
        }
        return matchSub;
    }

    private String generateSubDisplay(Map<Character, Character> matchSub) {
        List<String> subDisplays = new ArrayList<>();
        for (Map.Entry<Character, Character> matchSubRef : matchSub.entrySet()) {
            Character k = matchSubRef.getKey();
            Character v = matchSubRef.getValue();
            subDisplays.add(String.format("%s -> %s", k, v));
        }
        return Arrays.toString(subDisplays.toArray(new String[0]));
    }

    private List<Match> filterMatches(List<Match> matches) {
        List<Match> filteredMatches = new ArrayList<>();
        for (Match match : matches) {
            if (match.tokenLength() > 1) {
                filteredMatches.add(match);
            }
        }
        return this.sorted(filteredMatches);
    }

    private CharSequence decodeL33tSpeak(CharSequence password, Map<Character, Character> l33tToRegularMapping) {
        StringBuilder sb = new StringBuilder(password.length());
        for (int charIndex = 0; charIndex < password.length(); charIndex++) {
            char curChar = password.charAt(charIndex);
            Character replacement = l33tToRegularMapping.get(curChar);
            sb.append(replacement != null ? replacement : curChar);
        }
        WipeableString result = new WipeableString(sb);
        WipeableString.wipeIfPossible(sb);
        return result;
    }
}
