package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Dictionary;
import com.nulabinc.zxcvbn.matchers.Keyboard;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

class StandardContext {

    private StandardContext() {
        throw new IllegalStateException("StandardContext should not be instantiated");
    }

    static Context build() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
