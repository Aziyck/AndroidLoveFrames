package com.alexandru.loveframes.utils;

public class Quartet<A, B, C, D> {
    private final A id;
    private final B unlock;
    private final C rowSpan;
    private final D columnSpan;

    public Quartet(A id, B unlock, C rowSpan, D columnSpan) {
        this.id = id;
        this.unlock = unlock;
        this.rowSpan = rowSpan;
        this.columnSpan = columnSpan;
    }

    public A getId() {
        return id;
    }

    public B getUnlock() {
        return unlock;
    }

    public C getRowSpan() {
        return rowSpan;
    }

    public D getColumnSpan() {
        return columnSpan;
    }
}