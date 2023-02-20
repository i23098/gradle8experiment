package com.github.i23098.a;

import org.apache.commons.text.RandomStringGenerator;

public class A {
    private static final RandomStringGenerator RANDOM_STRING_GENERATOR = new RandomStringGenerator.Builder()
            .withinRange('a', 'z')
            .build();

    String str;

    public A(int n) {
        this.str = RANDOM_STRING_GENERATOR.generate(n);
    }

    public String getString() {
        return str;
    }
}
