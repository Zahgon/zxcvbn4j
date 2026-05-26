package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Match;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Zxcvbn {

    private final Context context;

    public Zxcvbn() {
        try {
            context = StandardContext.build();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    Zxcvbn(Context context) {
        this.context = context;
    }

    public Strength measure(CharSequence password) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Strength measure(CharSequence password, List<String> sanitizedInputs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private long time() {
        return System.nanoTime();
    }
}
