package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Pattern;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Match {

    public final Pattern pattern;

    public final int i;

    public final int j;

    public final CharSequence token;

    public final CharSequence matchedWord;

    public final int rank;

    public final String dictionaryName;

    public final boolean reversed;

    public final boolean l33t;

    public final Map<Character, Character> sub;

    public final String subDisplay;

    public final String sequenceName;

    public final int sequenceSpace;

    public final boolean ascending;

    public final String regexName;

    public final java.util.regex.Matcher regexMatch;

    public final CharSequence baseToken;

    public final List<Match> baseMatches;

    public final int repeatCount;

    public final String graph;

    public final int turns;

    public final Integer shiftedCount;

    public final String separator;

    public final int year;

    public final int month;

    public final int day;

    @SuppressWarnings("java:S1104")
    public Double baseGuesses;

    @SuppressWarnings("java:S1104")
    public Double guesses;

    @SuppressWarnings("java:S1104")
    public Double guessesLog10;

    private Match(Builder builder) {
        this.pattern = builder.pattern;
        this.i = builder.i;
        this.j = builder.j;
        this.token = builder.token;
        this.matchedWord = builder.matchedWord;
        this.rank = builder.rank;
        this.dictionaryName = builder.dictionaryName;
        this.reversed = builder.reversed;
        this.l33t = builder.l33t;
        this.sub = builder.sub;
        this.subDisplay = builder.subDisplay;
        this.sequenceName = builder.sequenceName;
        this.sequenceSpace = builder.sequenceSpace;
        this.ascending = builder.ascending;
        this.regexName = builder.regexName;
        this.regexMatch = builder.regexMatch;
        this.baseToken = builder.baseToken;
        this.baseGuesses = builder.baseGuesses;
        this.baseMatches = builder.baseMatches;
        this.repeatCount = builder.repeatCount;
        this.graph = builder.graph;
        this.turns = builder.turns;
        this.shiftedCount = builder.shiftedCount;
        this.separator = builder.separator;
        this.year = builder.year;
        this.month = builder.month;
        this.day = builder.day;
        this.guesses = builder.guesses;
        this.guessesLog10 = builder.guessesLog10;
    }

    public int tokenLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder {

        private final Pattern pattern;

        private final int i;

        private final int j;

        private final CharSequence token;

        private CharSequence matchedWord;

        private int rank;

        private String dictionaryName;

        private boolean reversed;

        private boolean l33t;

        private Map<Character, Character> sub;

        private String subDisplay;

        private String sequenceName;

        private int sequenceSpace;

        private boolean ascending;

        private String regexName;

        private java.util.regex.Matcher regexMatch;

        private CharSequence baseToken;

        private double baseGuesses;

        private List<Match> baseMatches;

        private int repeatCount;

        private String graph;

        private int turns;

        private int shiftedCount;

        private String separator;

        private int year;

        private int month;

        private int day;

        private Double guesses;

        private Double guessesLog10;

        public Builder(Pattern pattern, int i, int j, CharSequence token) {
            this.pattern = pattern;
            this.i = i;
            this.j = j;
            this.token = token;
        }

        public Builder matchedWord(CharSequence matchedWord) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder rank(int rank) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder dictionaryName(String dictionaryName) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder reversed(boolean reversed) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder l33t(boolean l33t) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder sub(Map<Character, Character> sub) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder subDisplay(String subDisplay) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder sequenceName(String sequenceName) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder sequenceSpace(int sequenceSpace) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder ascending(boolean ascending) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder regexName(String regexName) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder regexMatch(java.util.regex.Matcher regexMatch) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder baseToken(CharSequence baseToken) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder baseGuesses(double baseGuesses) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder baseMatches(List<Match> baseMatches) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder repeatCount(int repeatCount) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder graph(String graph) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder turns(int turns) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder shiftedCount(int shiftedCount) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder separator(String separator) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder year(int year) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder month(int month) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder day(int day) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder guesses(Double guesses) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder guessesLog10(Double guessesLog10) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Match build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
