package com.nulabinc.zxcvbn;

import java.nio.CharBuffer;
import java.util.Arrays;

/**
 * A character sequence with many attributes of Strings, but that can have its content wiped.
 */
public class WipeableString implements CharSequence {

    private char[] content;

    private int hash = 0;

    private boolean wiped = false;

    /**
     * Creates a new wipeable string, copying the content from the specified source.
     */
    public WipeableString(CharSequence source) {
        this.content = new char[source.length()];
        for (int n = 0; n < content.length; n++) {
            content[n] = source.charAt(n);
        }
    }

    /**
     * Creates a new wipeable string, copying the content from the specified source.
     */
    public WipeableString(char[] source) {
        this.content = Arrays.copyOf(source, source.length);
    }

    @Override
    public int length() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public char charAt(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public WipeableString subSequence(int start, int end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Wipe the content of the wipeable string.
     *
     * <p>Overwrites the content buffer with spaces, then replaces the buffer with an empty one.
     */
    public void wipe() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a new wipeable string with the specified content forced into lower case.
     */
    public static WipeableString lowerCase(CharSequence source) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a new wipeable string with the specified content but with the order of the characters
     * reversed.
     */
    public static WipeableString reversed(CharSequence source) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a copy of a portion of a character sequence as a wipeable string.
     */
    public static WipeableString copy(CharSequence source, int start, int end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the position of the first match of the specified character (indexed from 0).
     */
    public int indexOf(char character) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the nth Unicode code point.
     */
    public int codePointAt(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns true if the wipeable string has been wiped.
     */
    public boolean isWiped() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a copy of the content as a char array.
     */
    public char[] charArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Trims whitespace from a CharSequence.
     *
     * <p>If there is no trailing whitespace then the original value is returned. If there is trailing
     * whitespace then the content (without that trailing whitespace) is copied into a new
     * WipeableString.
     */
    static CharSequence trimTrailingWhitespace(CharSequence s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * A version of Integer.parse(String) that accepts CharSequence as parameter.
     */
    public static int parseInt(CharSequence s) throws NumberFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * A version of Integer.parse(String) that accepts CharSequence as parameter.
     */
    @SuppressWarnings("java:S3776")
    public static int parseInt(CharSequence s, int radix) throws NumberFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static NumberFormatException numberFormatException(CharSequence s) {
        return new NumberFormatException("For input string: \"" + s + "\"");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Wipes the content of the specified character sequence if possible.
     *
     * <p>The following types can be wiped... WipeableString StringBuilder StringBuffer CharBuffer (if
     * not readOnly)
     */
    public static void wipeIfPossible(CharSequence text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
