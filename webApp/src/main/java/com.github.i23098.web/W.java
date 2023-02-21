package com.github.i23098.web;

import com.github.i23098.a.A;
import com.github.i23098.b.B;
import com.github.i23098.tomcat.T;

public class W {
    private final B b;
    private final T t;

    public W() {
        this.b = new B();
        this.t = new T(new A(12));
    }

    public String getString() {
        return "B {" + b.getString() + "} T {" + t.getString() + "}";
    }
}