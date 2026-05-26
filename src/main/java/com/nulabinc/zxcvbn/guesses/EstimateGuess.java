package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.Pattern;
import com.nulabinc.zxcvbn.Scoring;
import com.nulabinc.zxcvbn.matchers.Match;
import java.util.EnumMap;
import java.util.Map;

public class EstimateGuess extends BaseGuess {

    private final CharSequence password;

    private final Map<Pattern, Guess> patternGuessMap = new EnumMap<>(Pattern.class);

    public EstimateGuess(Context context, CharSequence password) {
        super(context);
        this.password = password;
        patternGuessMap.put(Pattern.Bruteforce, new BruteforceGuess(context));
        patternGuessMap.put(Pattern.Dictionary, new DictionaryGuess(context));
        patternGuessMap.put(Pattern.Spatial, new SpatialGuess(context));
        patternGuessMap.put(Pattern.Repeat, new RepeatGuess(context));
        patternGuessMap.put(Pattern.Sequence, new SequenceGuess(context));
        patternGuessMap.put(Pattern.Regex, new RegexGuess(context));
        patternGuessMap.put(Pattern.Date, new DateGuess(context));
    }

    @Override
    public double exec(Match match) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
