package com.github.i23098.b;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.text.RandomStringGenerator;

public class B {
    private static final RandomStringGenerator RANDOM_STRING_GENERATOR = new RandomStringGenerator.Builder()
            .withinRange('a', 'z')
            .build();

    private final String str;

    public B() {
        int n = RandomUtils.nextInt(10, 21);
        this.str = RANDOM_STRING_GENERATOR.generate(n);
    }

    public String getString() {
        return str;
    }
}