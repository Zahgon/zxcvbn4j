package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Dictionary;
import com.nulabinc.zxcvbn.matchers.Keyboard;
import java.util.Collections;
import java.util.Map;

public class Context {

    private final Map<String, Dictionary> dictionaryMap;

    private final Map<String, Keyboard> keyboardMap;

    public Context(final Map<String, Dictionary> dictionaryMap, final Map<String, Keyboard> keyboardMap) {
        this.dictionaryMap = dictionaryMap;
        this.keyboardMap = keyboardMap;
    }

    public Map<String, Dictionary> getDictionaryMap() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, Keyboard> getKeyboardMap() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
