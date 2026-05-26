package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.io.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DictionaryLoader {

    private final String name;

    private final Resource resource;

    public DictionaryLoader(final String name, final Resource resource) {
        this.name = name;
        this.resource = resource;
    }

    public Dictionary load() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static class DictionaryLoadException extends IOException {

        DictionaryLoadException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
