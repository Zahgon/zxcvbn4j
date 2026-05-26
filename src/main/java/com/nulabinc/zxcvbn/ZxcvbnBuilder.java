package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Dictionary;
import com.nulabinc.zxcvbn.matchers.Keyboard;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ZxcvbnBuilder {

    private final Map<String, Dictionary> dictionaryMap = new LinkedHashMap<>();

    private final Map<String, Keyboard> keyboardMap = new LinkedHashMap<>();

    public Zxcvbn build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ZxcvbnBuilder dictionary(final Dictionary dictionary) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ZxcvbnBuilder dictionaries(final List<Dictionary> dictionaries) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ZxcvbnBuilder keyboard(final Keyboard keyboard) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ZxcvbnBuilder keyboards(final List<Keyboard> keyboards) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
