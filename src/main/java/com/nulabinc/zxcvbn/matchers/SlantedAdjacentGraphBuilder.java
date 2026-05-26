package com.nulabinc.zxcvbn.matchers;

import java.util.Arrays;
import java.util.List;

public class SlantedAdjacentGraphBuilder extends Keyboard.AdjacentGraphBuilder {

    public SlantedAdjacentGraphBuilder(final String layout) {
        super(layout);
    }

    /**
     * returns the six adjacent coordinates on a standard keyboard, where each row is slanted to the
     * right from the last. adjacencies are clockwise, starting with key to the left, then two keys
     * above, then right key, then two keys below. (that is, only near-diagonal keys are adjacent, so
     * g's coordinate is adjacent to those of t,y,b,v, but not those of r,u,n,c.)
     */
    @Override
    protected List<Position> getAdjacentCoords(final Position position) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isSlanted() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected int calcSlant(int y) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
