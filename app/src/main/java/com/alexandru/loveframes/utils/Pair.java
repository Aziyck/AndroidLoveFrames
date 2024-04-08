package com.alexandru.loveframes.utils;

public class Pair<A, B>{
    private  final A id;
    private final B name;

    public Pair(A id, B name) {
        this.id = id;
        this.name = name;
    }

    public A getId() {
        return id;
    }

    public B getName() {
        return name;
    }
}
