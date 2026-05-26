package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Match;
import java.util.ArrayList;
import java.util.List;

public class Strength {

    private CharSequence password;

    private double guesses;

    private double guessesLog10;

    private AttackTimes.CrackTimeSeconds crackTimeSeconds;

    private AttackTimes.CrackTimesDisplay crackTimesDisplay;

    private int score;

    private Feedback feedback;

    private List<Match> sequence;

    private long calcTime;

    /**
     * Default constructor.
     *
     * @deprecated This constructor is discouraged from use as it does not ensure all fields are
     *     initialized properly. Instead, use the {@link #Strength(CharSequence, double, List, long)}
     *     constructor to provide all necessary data.
     */
    @Deprecated
    public Strength() {
        this.sequence = new ArrayList<>();
    }

    /**
     * Constructs a Strength object with the given parameters.
     *
     * @param password The password for which strength is calculated.
     * @param guesses Estimated number of guesses needed to crack the password.
     * @param sequence A list of matching patterns found in the password.
     * @param calcTime Time taken to calculate the password's strength.
     */
    public Strength(CharSequence password, double guesses, List<Match> sequence, long calcTime) {
        this.password = password;
        this.guesses = guesses;
        this.guessesLog10 = Scoring.log10(guesses);
        if (sequence == null) {
            sequence = new ArrayList<>();
        }
        this.sequence = sequence;
        AttackTimes attackTimes = TimeEstimates.estimateAttackTimes(guesses);
        this.crackTimeSeconds = attackTimes.getCrackTimeSeconds();
        this.crackTimesDisplay = attackTimes.getCrackTimesDisplay();
        this.score = attackTimes.getScore();
        this.feedback = Feedback.getFeedback(attackTimes.getScore(), sequence);
        this.calcTime = calcTime;
    }

    public CharSequence getPassword() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the password.
     *
     * @deprecated Use constructor for initialization. Modifying after instantiation is not
     *     recommended.
     */
    @Deprecated
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public double getGuesses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the estimated number of guesses.
     *
     * @deprecated Use constructor for initialization. Modifying after instantiation is not
     *     recommended.
     */
    @Deprecated
    public void setGuesses(double guesses) {
        this.guesses = guesses;
    }

    public double getGuessesLog10() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the logarithm (base 10) of the estimated number of guesses.
     *
     * @deprecated Use constructor for initialization. Modifying after instantiation is not
     *     recommended.
     */
    @Deprecated
    public void setGuessesLog10(double guessesLog10) {
        this.guessesLog10 = guessesLog10;
    }

    public AttackTimes.CrackTimeSeconds getCrackTimeSeconds() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the crack time in seconds.
     *
     * @deprecated Use constructor for initialization. Modifying after instantiation is not
     *     recommended.
     */
    @Deprecated
    public void setCrackTimeSeconds(AttackTimes.CrackTimeSeconds crackTimeSeconds) {
        this.crackTimeSeconds = crackTimeSeconds;
    }

    public AttackTimes.CrackTimesDisplay getCrackTimesDisplay() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the display times for crack attempts.
     *
     * @deprecated Use constructor for initialization. Modifying after instantiation is not
     *     recommended.
     */
    @Deprecated
    public void setCrackTimesDisplay(AttackTimes.CrackTimesDisplay crackTimesDisplay) {
        this.crackTimesDisplay = crackTimesDisplay;
    }

    public int getScore() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the score.
     *
     * @deprecated Use constructor for initialization. Modifying after instantiation is not
     *     recommended.
     */
    @Deprecated
    public void setScore(int score) {
        this.score = score;
    }

    public Feedback getFeedback() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the feedback.
     *
     * @deprecated Use constructor for initialization. Modifying after instantiation is not
     *     recommended.
     */
    @Deprecated
    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public List<Match> getSequence() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the sequence of matches.
     *
     * @deprecated Use constructor for initialization. Modifying after instantiation is not
     *     recommended.
     */
    @Deprecated
    public void setSequence(List<Match> sequence) {
        if (sequence == null) {
            sequence = new ArrayList<>();
        }
        this.sequence = sequence;
    }

    public long getCalcTime() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the calculation time.
     *
     * @deprecated Use constructor for initialization. Modifying after instantiation is not
     *     recommended.
     */
    @Deprecated
    public void setCalcTime(long calcTime) {
        this.calcTime = calcTime;
    }

    /**
     * Attempts to wipe any sensitive content from the object.
     */
    public void wipe() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
