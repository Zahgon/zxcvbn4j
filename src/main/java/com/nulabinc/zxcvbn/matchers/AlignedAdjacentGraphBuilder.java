package com.nulabinc.zxcvbn.matchers;

import java.util.Arrays;
import java.util.List;

public class AlignedAdjacentGraphBuilder extends Keyboard.AdjacentGraphBuilder {

    public AlignedAdjacentGraphBuilder(final String layout) {
        super(layout);
    }

    @Override
    public boolean isSlanted() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected int calcSlant(int y) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * returns the nine clockwise adjacent coordinates on a keypad, where each row is vert aligned.
     */
    @Override
    protected List<Position> getAdjacentCoords(final Position position) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
