package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Match;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Optimal {

    private final List<Map<Integer, Match>> bestMatches = new ArrayList<>();

    private final List<Map<Integer, Double>> totalGuesses = new ArrayList<>();

    private final List<Map<Integer, Double>> overallMetrics = new ArrayList<>();

    Optimal(int length) {
        for (int i = 0; i < length; i++) {
            bestMatches.add(new HashMap<Integer, Match>());
            totalGuesses.add(new HashMap<Integer, Double>());
            overallMetrics.add(new HashMap<Integer, Double>());
        }
    }

    Match putToBestMatches(int index, Integer key, Match value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Double putToTotalGuesses(int index, Integer key, Double value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Double putToOverallMetrics(int index, Integer key, Double value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Map<Integer, Match> getBestMatchesAt(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Map<Integer, Double> getTotalGuessAt(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Map<Integer, Double> getOverallMetricsAt(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Match getBestMatch(int index, int key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Double getTotalGuess(int index, int key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Double getOverallMetric(int index, int key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
