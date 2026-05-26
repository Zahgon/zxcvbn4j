package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class RegexMatcher extends BaseMatcher {

    private static final Map<String, Pattern> PATTERNS = new HashMap<>();

    static {
        PATTERNS.put("recent_year", Pattern.compile("19\\d\\d|200\\d|201\\d|202\\d"));
    }

    public RegexMatcher(final Context context) {
        super(context);
    }

    @Override
    public List<Match> execute(CharSequence password) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
